package codeskills.game;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.datatools.connectivity.IConnectionProfile;
import org.eclipse.datatools.connectivity.IManagedConnection;
import org.eclipse.datatools.connectivity.ProfileManager;
import org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo;
import org.eclipse.datatools.modelbase.sql.query.QueryStatement;
import org.eclipse.datatools.modelbase.sql.schema.Database;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserException;
import org.eclipse.datatools.sqltools.parsers.sql.SQLParserInternalException;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParseResult;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParserManager;
import org.eclipse.datatools.sqltools.parsers.sql.query.SQLQueryParserManagerProvider;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Model;

import codeskills.designer.data.data.DataFactory;
import codeskills.designer.data.data.File;
import codeskills.designer.data.data.Folder;
import codeskills.designer.data.data.Project;
import codeskills.designer.data.data.ContainerResource;

public class ProjectManager {
	
	private DataFactory factory = DataFactory.eINSTANCE;
	private IResource modifiedResource;
	private ResourceSet resourceSet; 
	private Logger logger = Logger.getAnonymousLogger();
	
	private Resource projectData;
	private Resource sqlData;
	private Resource umlData;
	
	public ProjectManager(IResource modifiedResource) {
		this.modifiedResource = modifiedResource;
		this.resourceSet = new ResourceSetImpl();
		
		this.collectProjectData(modifiedResource);
	}
	
	public Resource getProjectData() {
		return this.projectData;
	}
	
	public Resource getSQLData() {
		return this.sqlData;
	}
	
	public Resource getUMLData() {
		return this.umlData;
	}
	
	public void collectProjectData(IResource resource) {
		Project project = null;
		
		try {
			IProject iProject = (IProject)resource.getProject();
			
			project = this.createProject(iProject.getName());
			
			for (IResource res : iProject.members()) {
				this.traverse(res, project);
			}
					
		}
		catch (Exception e) {
			logger.log(java.util.logging.Level.FINE, "[ProjectManager] project data not collected for " + resource.getName(), e);
		}
		
		Resource projectResource = this.resourceSet.createResource(URI.createFileURI("the-amazing-resource.xmi"));
		projectResource.getContents().add(project);
		
		this.save(projectResource);
		
		this.projectData = projectResource;
	}
	
	private void traverse(IResource res, ContainerResource parent) throws CoreException {
		if (res instanceof IFolder) {
			IFolder folder = (IFolder)res;
			
			Folder newParent = this.createFolder(parent, folder.getName());
			
			for (IResource r : folder.members()) {
				this.traverse(r, newParent);
			}
		}
		else if (res instanceof IFile) {
			IFile file = (IFile)res;		
			this.createFile(parent, file.getName(), file.getFileExtension(), res.equals(this.modifiedResource));
		}
	}
	
	private Project createProject(String name) {
		Project project = factory.createProject();
		project.setName(name);
		
		return project;
	}
	
	private Folder createFolder(ContainerResource parent, String name) {
		Folder folder = factory.createFolder();
		folder.setName(name);
		
		parent.getFolders().add(folder);
		
		return folder;
		
	}
	
	private void createFile(ContainerResource parent, String name, String extension, boolean modified) {
		File file = factory.createFile();
		file.setName(name);
		file.setExt(extension);
		file.setChanged(modified);
		
		if (extension != null) {
			
			if (modified && extension.equals("sql")) {
				Resource sqlResource = this.loadSQLModel(this.resourceSet, this.modifiedResource.getFullPath().toString());
				file.getModel().addAll(sqlResource.getContents());
				this.sqlData = sqlResource;
				
			}
			
			if (modified && extension.equals("uml")) {
				Model model = this.loadUMLModel(this.resourceSet, this.modifiedResource.getFullPath().toString());
				file.getModel().add(model);
				EcoreUtil.resolveAll(model);
				EcoreUtil.resolveAll(file);
				this.umlData = model.eResource();
			}
		}
			
		parent.getFiles().add(file);
		
	}
	
	public Model loadUMLModel(ResourceSet resourceSet, String pathName) {
        Resource umlResource = resourceSet.getResource(URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + pathName), true);
        return (Model) umlResource.getContents().get(0); 
    }
	
	public Resource loadSQLModel(ResourceSet resourceSet, String pathName) {
		Resource SqlResource = this.resourceSet.createResource(URI.createFileURI("sql.xmi"));
		try {
			
			//recover profile
			IConnectionProfile myProfile = ProfileManager.getInstance().getProfileByName("New MySQL");
			IManagedConnection managedConnection = myProfile.getManagedConnection("org.eclipse.datatools.connectivity.sqm.core.connection.ConnectionInfo");
			if (managedConnection != null) {
				ConnectionInfo connectionInfo = (ConnectionInfo) managedConnection.getConnection().getRawConnection();
				if (connectionInfo != null) {
					Database database = connectionInfo.getSharedDatabase();		
					EcoreUtil.resolveAll(database);
					//SqlResource.getContents().add(database);
				}
			}
			
			//get queries
			SQLQueryParserManager parserManager = SQLQueryParserManagerProvider.getInstance().getParserManager(null, null);	
			
			InputStream in = new BufferedInputStream(ResourcesPlugin.getWorkspace().getRoot().getFile(this.modifiedResource.getFullPath()).getContents());
			
			Scanner scanner = new Scanner(in, "UTF-8");
			String response = scanner.useDelimiter("\\A").next();
			scanner.close();
			
			List<SQLQueryParseResult> parseResults = parserManager.parseQueryScript(response);
			
			for (SQLQueryParseResult parseResult : parseResults) {
				QueryStatement resultObject = parseResult.getQueryStatement();
				String parsedSQL = resultObject.getSQL();
				System.out.println(parsedSQL);
				EcoreUtil.resolveAll(resultObject);
				SqlResource.getContents().add(resultObject);
			}

		} catch (SQLParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLParserInternalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//this.save(SqlResource);
		return SqlResource;
		
	}

	/* this method is for testing purposes */
	public void save(Resource resource) {
		try {
	        EcoreUtil.resolveAll(resource);
        	resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
        	e.printStackTrace();
        }
		
	} 
	

}

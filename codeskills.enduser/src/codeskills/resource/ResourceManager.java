package codeskills.resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import codeskills.designer.game.game.Game;
import codeskills.designer.game.status.status.GameS;
import codeskills.designer.game.ui.internal.GameActivator;
import codeskills.game.Activator;

public class ResourceManager {
	
	private static ResourceManager instance = null;
	private Logger logger = Logger.getAnonymousLogger();
	
	//folders
	public static final String RES_FOLDER = "/resources/"; 
	public static final String IMG_BADGES = "/img/badges/";
	public static final String IMG_NOTIFICATIONS = "/img/notifications/";
	public static final String SOUND = "/sound/";
	public static final String METAMODELS = "/metamodels/";
	public static final String QUERIES = "/queries/";
	
	//files
	public static final String GAME_STATUS = "game.status";
	public static final String GAME_SETTINGS = "settings.game";
	public static final String OCL = "queries.ocl";
	
	public static final String LEVEL_IMG = "level.png";
	public static final String GROUP_IMG = "group.png";
	public static final String ACHIEVEMENT_IMG = "achievement.png";
	public static final String POINTS_IMG = "points.png";
	public static final String FALLBACK_IMG = "default.png";
	public static final String FALLBACK_SOUND = "default.wav";
	
	private ResourceSet resourceSet;
	private Injector injector;
	private EncryptionXMIFactoryImpl encryptionXMI;
	
	public static ResourceManager getInstance() {
	      if(instance == null) {
	         instance = new ResourceManager();
	      }
	      return instance;
	}
	
	public ResourceManager() {
		this.resourceSet = new ResourceSetImpl();
		this.injector = GameActivator.getInstance().getInjector(GameActivator.CODESKILLS_DESIGNER_GAME_GAME);
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("status", this.encryptionXMI);
		this.encryptionXMI = new EncryptionXMIFactoryImpl();	
	}
	
	public URL getResource(String resourcePath) {
		URL found = FileLocator.find(Activator.getDefault().getBundle(), new Path(resourcePath), null);
		
		if (found == null)
			logger.log(Level.SEVERE, "[ResourceManager] Resource " + resourcePath + " not found!");
	    
		return found;
	}
	
	
	public GameS loadGameStatusModel() {
		GameS found = null;
		try {
			Resource gameStatus = resourceSet.getResource(getGameStatusURI(), true);		
	        found = (GameS) gameStatus.getContents().get(0); 
		}
		catch (Exception e) {
			logger.log(Level.WARNING, "[ResourceManager] status model not found");
		}
		
		return found;
	}
	
	public void saveGameStatusModel(GameS gameStatus) {
		try {
			Resource resource = resourceSet.createResource(getGameStatusURI());
	        resource.getContents().add(gameStatus);
	        
        	resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
        	logger.log(Level.SEVERE, "[ResourceManager] Error occurred trying to save game status", e);
		    e.printStackTrace();
        }
	}
	
	public void deleteGameStatusModel() {
		try {
			Resource resource = resourceSet.getResource(getGameStatusURI(), true);
			
			if (resource != null) {
				resource.delete(null);
				this.encryptionXMI.resetVault();
			}
			
		} catch (IOException e) {
			logger.log(Level.WARNING, "[ResourceManager] status model not found");
			e.printStackTrace();
		}
	}
	
	public Game loadGameModel() {
		XtextResourceSet xtextResourceSet = injector.getInstance(XtextResourceSet.class);

		Resource resource  = xtextResourceSet.getResource(this.getGameModelURI(), true);
        EcoreUtil.resolveAll(resource);
        
        this.resourceSet.getResources().add(resource);
        
        return (Game) resource.getContents().get(0); 
	}
	
	private byte[] createChecksum(String path) {
		byte[] output = null;
		try {
			InputStream fis =  this.getResource(path).openStream();
	
			byte[] buffer = new byte[1024];
	        MessageDigest complete;
			complete = MessageDigest.getInstance("MD5");
		
	        int numRead;
	        
	        do {
	           numRead = fis.read(buffer);
	           if (numRead > 0) {
	               complete.update(buffer, 0, numRead);
	           }
	        } while (numRead != -1);
	
	        fis.close();
	        output = complete.digest();
		} catch (NoSuchAlgorithmException | IOException e) {
			logger.log(java.util.logging.Level.FINE, "[GameStatusManager] checksum not created");
		}
		
		return output;
	}
	
	public String getMD5Checksum(String path) {
		byte[] b = createChecksum(path);
	    String result = "";

	    for (int i=0; i < b.length; i++)
	       result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
	    
	    return result;
	}
	
	public URI getGameStatusURI() {
		return URI.createFileURI(Activator.getDefault().getStateLocation() + RES_FOLDER + GAME_STATUS);
	}
	
	public URI getGameModelURI() {
		return URI.createPlatformPluginURI("/" + Activator.PLUGIN_ID + RES_FOLDER + GAME_SETTINGS, true);
	}
	
	public URI getOCLQueriesURI() {
		return URI.createPlatformPluginURI("/" + Activator.PLUGIN_ID + ResourceManager.QUERIES + ResourceManager.OCL, true);
	}

}

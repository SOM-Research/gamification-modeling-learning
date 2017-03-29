package codeskills.query;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.pivot.Constraint;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.pivot.utilities.Query;

import codeskills.designer.data.data.DataPackage;

public class OCLEvaluator {

	private OCL ocl = OCL.newInstance();
	private URI oclLocation;
	private Map<String, ExpressionInOCL> constraints;
	private Logger logger = Logger.getAnonymousLogger();
	
	public OCLEvaluator(URI oclLocation) {
		this.oclLocation = oclLocation;
		this.constraints = loadConstraints(this.oclLocation);
	}
	
	public ExpressionInOCL getConstraint(String queryName) {
		return this.constraints.get(queryName);
	}
	
	public boolean execute(Resource resource, String queryName) {
		boolean success = false;
			
		try {
			if (resource != null) {
				ExpressionInOCL found = this.getConstraint(queryName);
				if (found != null) {
					Query q = ocl.createQuery(this.getConstraint(queryName));
					success = q.checkBoxed(resource.getContents());
				}
				else {
					logger.log(Level.WARNING, "[OCLQueryLauncher] not OCL query linked to " + queryName);
				}
			}
			else {
				logger.log(Level.WARNING, "[OCLQueryLauncher] resource is null");
			}
		}
		catch (Exception e) {
			logger.log(Level.WARNING, "[OCLQueryLauncher] failed with " + queryName + "!", e);
		}
		
		return success;

	}
	
	private void testOclExpression(Resource resource) {
		try {
			ExpressionInOCL query = ocl.createInvariant(DataPackage.Literals.PROJECT, 
					"files->select(f | f.ext.toLower() = 'sql' and f.model->notEmpty()).model->notEmpty()");
			Query q = ocl.createQuery(query);
			boolean success = q.checkBoxed(resource.getContents());
			System.out.println(success);
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Map<String, ExpressionInOCL> loadConstraints(URI uriResource) {
		ASResource oclResource = ocl.parse(uriResource);
		Map<String, ExpressionInOCL> constraintMap = new HashMap<String, ExpressionInOCL>();
		for (TreeIterator<EObject> tit = oclResource.getAllContents(); tit.hasNext();) {
			EObject next = tit.next();
			if (next instanceof Constraint) {
				Constraint constraint = (Constraint) next;
				ExpressionInOCL expressionInOCL;
				try {
					expressionInOCL = ocl.getSpecification(constraint);
					if (expressionInOCL != null) {
						String name = constraint.getName();
						if (name != null) {
							constraintMap.put(name, expressionInOCL);
						}
					}
				} catch (ParserException e) {
					throw new RuntimeException("Invalid constraints file", e);
				}
			}
		}
		return constraintMap;
	}
}
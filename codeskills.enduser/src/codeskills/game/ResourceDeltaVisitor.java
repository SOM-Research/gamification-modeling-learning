package codeskills.game;

import java.util.ArrayList;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Folder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;

@SuppressWarnings("restriction")
public class ResourceDeltaVisitor implements IResourceDeltaVisitor {
	
	private ArrayList<IResource> changedResources;
	
	public ResourceDeltaVisitor() {
		this.changedResources = new ArrayList<IResource>();
	}
	
	// only visit delta classes
	public boolean visit(IResourceDelta delta) {
		IResource res = delta.getResource();
		if(res instanceof File || res instanceof Folder) {
			addResource(res);
		}
		
		return true; // visit the children
	}
	
	public ArrayList<IResource> getChangedResources() {
		return changedResources;
	}
	
	private void addResource(IResource res) {
		changedResources.add(res);
	}
}
package codeskills.listener;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;

import codeskills.game.GameManager;
import codeskills.game.ResourceDeltaVisitor;
import codeskills.handlers.ToggleGameManager;

public class ResourceChangeListener implements IResourceChangeListener {

	private Logger logger = Logger.getAnonymousLogger();
	
	public void resourceChanged(IResourceChangeEvent event) {
		ToggleGameManager toggleGameManager = new ToggleGameManager();
		if (toggleGameManager.getStatus()) {
			IResourceDelta[] allChanges = event.getDelta().getAffectedChildren();
			GameManager gameManager = GameManager.getInstance(); 
			for(IResourceDelta delta : allChanges) {
				if(delta.getKind() == IResourceDelta.CHANGED || delta.getKind() == IResourceDelta.ADDED || delta.getKind() == IResourceDelta.ADDED_PHANTOM) {	// only check projects when there are actual changes (4 = CHANGED)
					try {
						ResourceDeltaVisitor resourceDeltaVisitor = new ResourceDeltaVisitor();
						delta.accept(resourceDeltaVisitor);
						ArrayList<IResource> changedResources = resourceDeltaVisitor.getChangedResources();
	
						for(IResource changedResource : changedResources) {
							logger.log(Level.FINE, "[ResourceChangeListener] Parsed file: " + changedResource.getName());
							
							if (changedResource.getProject().exists() && changedResource.exists()) {
								gameManager.checkCurrentLevel(changedResource);
							}
						}
					}
					catch (CoreException e1) {
						logger.log(Level.SEVERE, "[ResourceChangeListener] Error", e1);
					}
	
					gameManager.getNotificationManager().showNotification();
				}
			}
		}
	}
}
package codeskills.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;

import codeskills.game.GameManager;
import codeskills.notifications.NotificationManager;
import codeskills.resource.ResourceManager;

public class ToggleGameHandler extends AbstractHandler {
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ToggleGameManager toggleGameManager = new ToggleGameManager();
		toggleGameManager.invertStatus();
		
		NotificationManager notificationManger = new NotificationManager();
		
		if (toggleGameManager.getStatus()) {
			GameManager.getInstance();
			notificationManger.addCustomNotification(Display.getDefault(), 
					                                 "Welcome! Let's start play.", 
					                                 "Hey there!", 
					                                 ResourceManager.IMG_NOTIFICATIONS + "greeting.png", 
					                                 ResourceManager.SOUND + "greeting.wav");	
		}
		else {
			GameManager.destroy();
			notificationManger.addCustomNotification(Display.getDefault(), 
					                                 "Goodbye! Come back soon.", 
					                                 "See you!", 
					                                 ResourceManager.IMG_NOTIFICATIONS + "greeting.png", 
					                                 ResourceManager.SOUND + "greeting.wav");
		}
		
		notificationManger.showNotification();
		
		return null;
	}

}

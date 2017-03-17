package codeskills.notifications;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.mylyn.commons.ui.dialogs.AbstractNotificationPopup;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Display;

import codeskills.game.SoundPlayer;

public class NotificationManager {

	private static ArrayList<AbstractNotificationPopup> notificationList = new ArrayList<AbstractNotificationPopup>();
	private static int runningNotifications = 0;
	private Logger logger = Logger.getAnonymousLogger();
	
	public void addCustomNotification(Display display, String message, String popUp, String imagePath, String soundPath) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				GameNotification notification = new CustomNotification(display, message, popUp, imagePath, soundPath);
				logger.log(Level.FINE, "[NotificationManager] Default Notification added");
				NotificationManager.add(notification);
			}
		});
		this.showNotification();
	}

	public void addRewardNotification(Display display, String aMessage, int points, String aSound, String aImage, String type) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				GameNotification notification = new RewardNotification(display, aMessage, points, aSound, aImage, type);
				logger.log(Level.FINE, "[NotificationManager] Reward Notification added");
				NotificationManager.add(notification);
			}
		});
		this.showNotification();
	}

	private static void add(AbstractNotificationPopup notification) {
		notificationList.add(notification);
	}
	
	private void notifyReward(SoundPlayer soundPlayer) {
		RewardNotification notification = (RewardNotification) notificationList.get(0);
		notification.open();
		soundPlayer.play(notification.getSoundResource());

		notification.getShell().addDisposeListener(new DisposeListener() {
			@Override
			// wait until current notification is disposed
			public void widgetDisposed(DisposeEvent e) {
				notificationList.remove(0); // removes current achievement
				runningNotifications--;
				showNotification(); // returns to start of method
			}
		});
	}
	
	private void notifyCustomMessage(SoundPlayer soundPlayer) {
		CustomNotification notification = (CustomNotification) notificationList.get(0);
		notification.open();
		soundPlayer.play(notification.getSoundResource());

		notification.getShell().addDisposeListener(new DisposeListener() {
			@Override
			// wait until current notification is disposed
			public void widgetDisposed(DisposeEvent e) {
				notificationList.remove(0); // removes current achievement
				runningNotifications--;
				showNotification(); // returns to start of method
			}
		});
	}
	
	public void showNotification() {
		if(runningNotifications == 0 && notificationList.size() > 0) {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					runningNotifications++;
					SoundPlayer soundPlayer = new SoundPlayer();
					
					if(notificationList.get(0) instanceof RewardNotification) {
						notifyReward(soundPlayer);
					}
					else if(notificationList.get(0) instanceof CustomNotification)  {
						notifyCustomMessage(soundPlayer);
					}
				}
			});
		}
	}
	
}

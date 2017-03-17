package codeskills.notifications;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.mylyn.commons.ui.dialogs.AbstractNotificationPopup;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import codeskills.resource.ResourceManager;

public class RewardNotification extends GameNotification {
	
	private Display display;
	private String headerMessage;
	private String notificationMessage;
	private String achievementPoints;
	private String notificationSound;
	private String notificationImage;
	private ResourceManager resourceManager;
	
	private Logger logger = Logger.getAnonymousLogger();
	
	public RewardNotification(Display display, String aMessage, int points, String aSound, String aImage, String type) {
		super(display);
		this.display = display;
		resourceManager = ResourceManager.getInstance();
		notificationMessage = aMessage;
		notificationSound = aSound;
		notificationImage = aImage;
		headerMessage = "New " + type + " reward!";
		achievementPoints = "You receive " + Integer.toString(points) + " points!";
		
	}

	public String toString() {
		return notificationMessage;
	}
	
	@Override
	protected void createContentArea(Composite composite) {

		composite.setLayout(new GridLayout(4, false));
		try {
			// add picture	
			URL location = this.getImageResource();
			InputStream inputStream = location.openStream();
			final Image ideaImage = new Image(display, inputStream);
			this.addImage(ideaImage);
			Label label = new Label(composite, SWT.NONE);
			label.setImage(ideaImage);
			
			// set text
			StyledText text = new StyledText(composite, 0);
			text.setText(this.headerMessage + "\n" + notificationMessage + "\n\n" + achievementPoints);

			// set achievement name bold
			StyleRange titleStyle = new StyleRange();
			titleStyle.start = 0;
			titleStyle.length = this.headerMessage.length();
			titleStyle.fontStyle = SWT.BOLD;
			text.setStyleRange(titleStyle);
		}
		catch (IOException e1) {
			logger.log(Level.SEVERE, "[RewardNotification] Error", e1);
		}
	}

	@Override
	protected String getPopupShellTitle() {
		return this.headerMessage;
	}

	@Override
	protected Image getPopupShellImage(int maximumHeight) {
		return null;
	}
	
	private URL getImageResource() {
		URL found = null;
		try {
			found = this.resourceManager.getResource(this.notificationImage);
		}
		catch (Exception e) {
			logger.log(Level.SEVERE, "[RewardNotification] image " + this.notificationImage + " not found!", e);
		}
		
		if (found == null)
			found = this.resourceManager.getResource(ResourceManager.IMG_NOTIFICATIONS + ResourceManager.FALLBACK_IMG);
		
		return found;
	}
	
	public URL getSoundResource() {
		URL found = null;
		try {
			found = this.resourceManager.getResource(this.notificationSound);
		}
		catch (Exception e) {
			logger.log(Level.SEVERE, "[RewardNotification] sound " + this.notificationSound + " not found!", e);
		}
		
		if (found == null)
			found = this.resourceManager.getResource(ResourceManager.SOUND  + ResourceManager.FALLBACK_SOUND);
		
		return found;
	}

}

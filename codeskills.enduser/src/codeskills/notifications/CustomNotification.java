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
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import codeskills.resource.ResourceManager;

public class CustomNotification extends GameNotification {

	private Display display;
	private String message;
	private String popUp;
	private String notificationImage;
	private String notificationSound;
	private ResourceManager resourceManager;
	private List<Image> images;
	private Logger logger = Logger.getAnonymousLogger();

	public CustomNotification(Display display, String message, String popUp, String notificationImage, String notificationSound) {
		super(display);
		this.display = display;
		this.message = message;
		this.popUp = popUp;
		this.notificationImage = notificationImage;
		this.notificationSound = notificationSound;
		resourceManager = ResourceManager.getInstance();
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
			text.setText(this.message);
		}
		catch (IOException e1) {
			logger.log(Level.SEVERE, "[MessageNotification] Error", e1);
		}
	}

	@Override
	protected String getPopupShellTitle() {
		return this.popUp;
	}

	@Override
	protected Image getPopupShellImage(int maximumHeight) {
		return null;
	}
	
	private URL getImageResource() {
		URL found = this.resourceManager.getResource(this.notificationImage);
		if (found == null)
			found = this.resourceManager.getResource(ResourceManager.IMG_NOTIFICATIONS  + ResourceManager.FALLBACK_IMG);
		
		return found;
	}
	
	public URL getSoundResource() {
		URL found = this.resourceManager.getResource(this.notificationSound);
		if (found == null)
			found = this.resourceManager.getResource(ResourceManager.SOUND  + ResourceManager.FALLBACK_SOUND);
		
		return found;
	}

}
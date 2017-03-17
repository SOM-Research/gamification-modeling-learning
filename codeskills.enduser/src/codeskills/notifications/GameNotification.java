package codeskills.notifications;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.mylyn.commons.ui.dialogs.AbstractNotificationPopup;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class GameNotification extends AbstractNotificationPopup {

	protected List<Image> images;
	
	public GameNotification(Display display) {
		super(display);
		this.images = new LinkedList<Image>();
	}
	
	public void addImage(Image image) {
		this.images.add(image);
	}
	
	public void disposeImages() {
		for (Image i : this.images)
			i.dispose();
	}
	
	@Override
	public boolean close() {
		this.disposeImages();
		return super.close();
	}

}

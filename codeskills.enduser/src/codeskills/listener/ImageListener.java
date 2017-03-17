package codeskills.listener;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ImageListener implements MouseListener {
	
	private Text receiver;
	
	public void setReceiver(Text text) {
		this.receiver = text;
	}
	
	@Override
	public void mouseDoubleClick(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDown(MouseEvent e) {
		// TODO Auto-generated method stub
		Label label = (Label)e.getSource();
		String description = (String)label.getData();
		this.receiver.setText(description);
		
	}

	@Override
	public void mouseUp(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	

}

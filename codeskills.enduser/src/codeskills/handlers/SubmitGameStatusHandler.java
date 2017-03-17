package codeskills.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import codeskills.visualization.SubmitStatusDialog;

public class SubmitGameStatusHandler extends AbstractHandler  {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ToggleGameManager toggleGameManager = new ToggleGameManager();
		
		if (toggleGameManager.getStatus()) {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			SubmitStatusDialog dialog = new SubmitStatusDialog(window.getShell());
			dialog.open();
		}
		
		return null;
	}

}

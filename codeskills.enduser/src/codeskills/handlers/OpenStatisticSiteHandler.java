package codeskills.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import codeskills.visualization.GameStatisticsDialog;

public class OpenStatisticSiteHandler extends AbstractHandler {
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ToggleGameManager toggleGameManager = new ToggleGameManager();
		
		if (toggleGameManager.getStatus()) {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			GameStatisticsDialog dialog = new GameStatisticsDialog(window.getShell());
			dialog.open();
		}
		
		return null;
	}
	
}

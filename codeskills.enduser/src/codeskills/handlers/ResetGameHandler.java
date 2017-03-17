package codeskills.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;

import codeskills.game.GameManager;

public class ResetGameHandler extends AbstractHandler {
	
	public Object execute(ExecutionEvent event) {
		ToggleGameManager toggleGameManager = new ToggleGameManager();
		
		if (toggleGameManager.getStatus()) {
			GameManager.destroy();
			GameManager.getInstance().resetGameStatus();
		
		}
		return null;
	}

}

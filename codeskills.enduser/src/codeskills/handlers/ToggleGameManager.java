package codeskills.handlers;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.State;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

public class ToggleGameManager {
	
	private static final String COMMAND_ID = "codeskills.commands.toggleGame";
	private static final String STATE_ID = "codeskills.commands.toggleState";
	private Command toggleGameCommand;
	private State toggleGameState;
	
	public ToggleGameManager() {
		ICommandService cService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
		toggleGameCommand = cService.getCommand(COMMAND_ID);
		toggleGameState = toggleGameCommand.getState(STATE_ID);
	}
	
	public boolean getStatus() {
		return (Boolean)toggleGameState.getValue();
	}
	
	public void invertStatus() {
		boolean oldState = (Boolean)toggleGameState.getValue();
		toggleGameState.setValue(!oldState);
	}
	

}

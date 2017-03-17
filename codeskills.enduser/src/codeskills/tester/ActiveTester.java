package codeskills.tester;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.State;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;

public class ActiveTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		ICommandService cService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
		
		Command toggleGame = cService.getCommand("codeskills.commands.toggleGame");
		State toggleGameState = toggleGame.getState("codeskills.commands.toggleState");
		return (Boolean)toggleGameState.getValue();
		
	}

}

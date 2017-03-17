package codeskills.game;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	
	public static final String PLUGIN_ID = "codeskills.enduser";
	
	private Logger logger = Logger.getAnonymousLogger();
	private static Activator plugin;	// the shared instance
	
	public Activator() {
		logger.log(Level.FINE, "[Activator] Plugin starts.");
	}

	public void start(BundleContext context) {
		try {
			super.start(context);
			plugin = this;
		}
		catch (Exception e1) {
			logger.log(Level.SEVERE, "[Activator] Error", e1);
		}
		
	}
	
	public void stop(BundleContext context) {
		try {
			plugin = null;
			super.stop(context);
		}
		catch (Exception e1) {
			logger.log(Level.SEVERE, "[Activator] Error", e1);
		}
	}

	public static Activator getDefault() {
		return plugin;
	}
	
}

package codeskills.listener;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;

import codeskills.handlers.ToggleGameManager;

public class ListenerInitializer implements org.eclipse.ui.IStartup {
	
	private Logger logger = Logger.getAnonymousLogger();

	@Override
	public void earlyStartup() {
		logger.log(Level.FINE, "[ListenerInititalizer] change listener initialized.");

		// create Jobs to do all the tasks one after another (necessary to avoid a crash on startup because resources are not yet fully loaded)
		Job addResourceChangeListenerJob = new Job("addListenerJob") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				IWorkspace workspace = ResourcesPlugin.getWorkspace();
				workspace.addResourceChangeListener(new ResourceChangeListener(), IResourceChangeEvent.POST_BUILD);
				return Status.OK_STATUS;
			}
		};

		addResourceChangeListenerJob.addJobChangeListener(new IJobChangeListener() {
			@Override
			public void sleeping(IJobChangeEvent event) {}

			@Override
			public void scheduled(IJobChangeEvent event) {}

			@Override
			public void running(IJobChangeEvent event) {}

			@Override
			public void done(IJobChangeEvent event) {}

			@Override
			public void awake(IJobChangeEvent event) {}

			@Override
			public void aboutToRun(IJobChangeEvent event) {}
		});
		
		addResourceChangeListenerJob.setPriority(Job.SHORT);
		addResourceChangeListenerJob.schedule();
		
		ToggleGameManager toggleGameManager = new ToggleGameManager();
		
		if (toggleGameManager.getStatus())
			toggleGameManager.invertStatus();

	}

}

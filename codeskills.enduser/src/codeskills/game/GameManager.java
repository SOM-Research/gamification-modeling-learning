package codeskills.game;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;

import codeskills.designer.game.game.Achievement;
import codeskills.designer.game.game.Game;
import codeskills.designer.game.game.Group;
import codeskills.designer.game.game.Level;
import codeskills.designer.game.game.Notification;
import codeskills.designer.game.game.Reward;
import codeskills.designer.game.game.Task;
import codeskills.notifications.NotificationManager;
import codeskills.query.OCLEvaluator;
import codeskills.resource.ResourceManager;

public class GameManager {
	private static GameManager instance = null;
	private Logger logger = Logger.getAnonymousLogger();
	private GameStatusManager statusManager;
	private NotificationManager notificationManager;
	private ResourceManager resourceManager;
	private Game gameModel;
	private boolean gameFinished = false;
	private OCLEvaluator oclEvaluator;
	
	public static GameManager getInstance() {
	      if(instance == null) {
	         instance = new GameManager();
	      }
	      return instance;
	}
	
	public static void destroy() {
		instance = null;
	}
	
	public GameManager() {
		this.resourceManager = ResourceManager.getInstance();
		this.notificationManager = new NotificationManager();
		this.gameModel = this.loadGameSettings();
		this.statusManager = new GameStatusManager(gameModel);
		this.oclEvaluator = new OCLEvaluator(this.resourceManager.getOCLQueriesURI());
		
	}
	
	private Game loadGameSettings() {
		return this.resourceManager.loadGameModel();
	}
	
	public NotificationManager getNotificationManager() {
		return this.notificationManager;
	}
	
	public int getCurrentScore() {
		return this.statusManager.getCurrentScore();
	}
	
	public void addScore(int points) {
		this.statusManager.addScore(points);
	}
	
	public Level getCurrentLevel() {
		return this.statusManager.getCurrentLevel();
	}
	
	public void resetGameStatus() {
		this.statusManager.resetGameStatus(gameModel);
	}
	
	private void saveGameStatus() {
		this.statusManager.saveGameStatus();
	}

	public void checkCurrentLevel(IResource changedResource) {
		
		if (!this.statusManager.isGameComplete()) {
			ProjectManager pm = new ProjectManager(changedResource);
			Resource projectData = pm.getProjectData();
			
			List<Group> activeGroups = this.statusManager.getActiveGroups(this.getCurrentLevel());
			
			for (Group group : activeGroups) {
				List<Achievement> activeAchievements = this.statusManager.getActiveAchievements(group);
				
				for (Achievement achievement : activeAchievements) {			
					if(allTaskFulfilled(projectData, achievement)) {
						
						logger.log(java.util.logging.Level.FINE, "[GameManager] all tasks fulfilled for: " + achievement.getName());
						
						this.statusManager.setStatusComplete(achievement);
						this.statusManager.addScore(achievement.getReward().getPoints());
						this.notifyReward(achievement.getReward(), "achievement");
						
						this.saveGameStatus();
					}				
				}
				
				if (allAchievementFulfilled(group)) {
					
					logger.log(java.util.logging.Level.FINE, "[GameManager] all achievements fulfilled for: " + group.getName());
					
					this.statusManager.setStatusComplete(group);
					this.statusManager.addScore(group.getReward().getPoints());
					this.notifyReward(group.getReward(), "group");
					
					this.saveGameStatus();
				}
				
			}
			
			if (allGroupFulfilled(this.getCurrentLevel())) {
				
				logger.log(java.util.logging.Level.FINE, "[GameManager] all groups fulfilled for: " + this.getCurrentLevel().getName());
				
				this.statusManager.setStatusComplete(this.getCurrentLevel());
				this.statusManager.addScore(this.getCurrentLevel().getReward().getPoints());
				this.notifyReward(this.getCurrentLevel().getReward(), "level");
				
				this.saveGameStatus();
				
				if (!this.statusManager.updateCurrentLevel()) {
					this.statusManager.setGameComplete();
					this.notifyGameFinished();
					
					this.saveGameStatus();
				}
			}
		}
		
		else {
			this.notifyResetGame();
		}
	
	}
	
	private void notifyResetGame() {
		if (!this.gameFinished) {
			this.notificationManager.addCustomNotification(Display.getDefault(), 
														   "It looks there are no achievements to complete,\n if you want reset the game and start again!", 
														   "Hey boss!", 
														   ResourceManager.IMG_NOTIFICATIONS + "game.png", 
														   ResourceManager.SOUND + "game.wav");
			this.gameFinished = true;
		}
	}
	
	private void notifyGameFinished() {
		if (!this.gameFinished) {
			this.notificationManager.addCustomNotification(Display.getDefault(), 
														   "Congratulations! You have finished the game.", 
														   "Hey boss!", 
														   ResourceManager.IMG_NOTIFICATIONS + "game.png", 
														   ResourceManager.SOUND + "game.wav");
			this.gameFinished = true;
		}
	}
	
	private void notifyReward(Reward reward, String type) {
		Notification notification = reward.getNotification();
		
		String aMessage = "Congratulations! " + StringUtils.capitalize(type) + " complete!";
		String aSound = ResourceManager.SOUND + type + ".wav";
		String aIcon = ResourceManager.IMG_NOTIFICATIONS + type + ".png";
		
		if (notification != null) {
			aMessage = notification.getMessage();
			aSound = notification.getSoundPath();
			aIcon = notification.getIconPath();
		}
		
		this.notificationManager.addRewardNotification(Display.getDefault(), 
				aMessage, 
				reward.getPoints(), 
				aSound, 
				aIcon,
				type);
		
	}

	private boolean allAchievementFulfilled(Group group) {
		boolean isComplete = false;
		
		List<Achievement> activeAchievements = this.statusManager.getActiveAchievements(group);
		
		if (activeAchievements.isEmpty())
			isComplete = true;
		
		return isComplete;
	}
	
	private boolean allGroupFulfilled(Level level) {
		boolean isComplete = false;
			
		List<Group> activeGroups = this.statusManager.getActiveGroups(level);
		
		if (activeGroups.isEmpty())
			isComplete = true;
		
		return isComplete;
	}
	
	private boolean allTaskFulfilled(Resource projectData, Achievement achievement) {
		boolean isComplete = true;
		List<Task> activeTasks = this.statusManager.getActiveTasks(achievement);
		
		for (Task t : activeTasks) {
			if (oclEvaluator.execute(projectData, t.getQueryName())) {
				this.statusManager.setStatusComplete(t);
			}
			else {
				isComplete = false;
			}
		}
		
		return isComplete;
	}
	
	/* this method is for testing the application behavior */
	@SuppressWarnings("unused")
	private boolean randomTaskResult(Achievement achievement) {
		boolean isComplete = true;
		List<Task> activeTasks = this.statusManager.getActiveTasks(achievement);
		
		for (Task t : activeTasks) {
			
			Random rn = new Random();
			int answer = rn.nextInt(10) + 1;
			boolean result = answer > 8 ? true : false;
			
			if (!result)
				isComplete = false;
			else {
				this.statusManager.setStatusComplete(t);
			}
		}
		
		return isComplete;
	}
	
	public boolean isComplete(Level level) {
		return this.statusManager.getStatus(level);
	}
	
	public boolean isComplete(Group group) {
		return this.statusManager.getStatus(group);
	}
	
	public boolean isComplete(Achievement achievement) {
		return this.statusManager.getStatus(achievement);
	}
	
	public boolean isComplete(Task task) {
		return this.statusManager.getStatus(task);
	}
	
	public List<Level> getLevels() {
		return this.gameModel.getLevels();
	}
	
	public List<Group> getGroups(Level level) {
		return level.getGroups();
	}
	
	public List<Achievement> getAchievements(Group group) {
		return group.getAchievements();
	}
	
	public List<Level> getCompleteLevels() {
		return this.statusManager.getCompleteLevels();
	}
	
	public List<Group> getCompleteGroups() {
		return this.statusManager.getCompleteGroups();
	}
	
	public List<Achievement> getCompleteAchievements() {
		return this.statusManager.getCompleteAchievements();
	}
	
	public String toJSON() {
		return this.statusManager.toJSON();
	}
	
}

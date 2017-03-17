package codeskills.game;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

import codeskills.designer.game.game.Achievement;
import codeskills.designer.game.game.Game;
import codeskills.designer.game.game.Group;
import codeskills.designer.game.game.Level;
import codeskills.designer.game.game.Task;
import codeskills.designer.game.status.status.AchievementS;
import codeskills.designer.game.status.status.GameS;
import codeskills.designer.game.status.status.GroupS;
import codeskills.designer.game.status.status.LevelS;
import codeskills.designer.game.status.status.Status;
import codeskills.designer.game.status.status.StatusFactory;
import codeskills.designer.game.status.status.TaskS;
import codeskills.resource.ResourceManager;

public class GameStatusManager {
	private StatusFactory factory = StatusFactory.eINSTANCE;
	private ResourceManager resourceManager;
	private GameS statusModel;
	private Logger logger = Logger.getAnonymousLogger();
	
	public GameStatusManager(Game gameModel) {
		this.resourceManager = ResourceManager.getInstance();
		loadGameStatus(gameModel);
		if (this.statusModel == null) {
			this.initGameStatus(gameModel);
		}
	}
	
	public void loadGameStatus(Game gameModel) {
		this.statusModel = this.resourceManager.loadGameStatusModel();
		
		if (this.statusModel != null) {
			if (!this.statusModel.getSignature().equals(this.getMD5Checksum())) {
				logger.log(java.util.logging.Level.FINE, "[GameStatusManager] checksums do not match");
				MessageDialog.openWarning(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), "Warning", "Modifications over the OCL queries are not allowed!");
			}
		}
				
	}
	
	private Status createStatus() {
		Status status = this.factory.createStatus();
		status.setComplete(false);
		status.setMilliseconds(0);
		
		return status;
	}
	
	private String getMD5Checksum() {
		return this.resourceManager.getMD5Checksum(ResourceManager.RES_FOLDER + ResourceManager.GAME_SETTINGS) + "-" + this.resourceManager.getMD5Checksum(ResourceManager.QUERIES + ResourceManager.OCL);
	}
	
	public void initGameStatus(Game gameModel) {
		GameS gS = this.factory.createGameS();
		gS.setCurrentScore(0);
		gS.setSignature(this.getMD5Checksum());
		gS.setCreated(System.currentTimeMillis());
		gS.setStatus(this.createStatus());
		
		for (Level level: gameModel.getLevels()) {
			LevelS lS = this.factory.createLevelS();
			lS.setLevel(level);
			lS.setStatus(this.createStatus());
			
			if (level.equals(gameModel.getLevels().get(0)))
				lS.setIsCurrent(true);
			else
				lS.setIsCurrent(false);
			
			gS.getLevels().add(lS);
			
			for (Group group: level.getGroups()) {
				GroupS grS = this.factory.createGroupS();
				grS.setStatus(this.createStatus());
				grS.setGroup(group);
				lS.getGroups().add(grS);
				
				for (Achievement achievement: group.getAchievements()) {
					AchievementS aS = this.factory.createAchievementS();
					aS.setStatus(this.createStatus());
					aS.setAchievement(achievement);
					grS.getAchievements().add(aS);
					
					for (Task task: achievement.getTasks()) {
						TaskS tS = this.factory.createTaskS();
						tS.setStatus(this.createStatus());
						tS.setTask(task);
						aS.getTasks().add(tS);
					}
				}
			}
			
		}
		
		this.statusModel = gS;
		this.saveGameStatus();
	}
	
	public void resetGameStatus(Game gameModel) {
		this.deleteGameStatus();
		this.initGameStatus(gameModel);
	}
	
	public void saveGameStatus() {
		this.resourceManager.saveGameStatusModel(this.statusModel);
	}
	
	public void deleteGameStatus() {
		this.resourceManager.deleteGameStatusModel();
	}
	
	public Level getCurrentLevel() {
		LevelS found = null;
		for (LevelS level : this.statusModel.getLevels()) {
			if (level.isIsCurrent()) {
				found = level;
				break;
			}
		}
		
		return found.getLevel();
	}
	
	public int getCurrentScore() {
		return this.statusModel.getCurrentScore();
	}
	
	public void addScore(int score) {
		int newScore = this.statusModel.getCurrentScore() + score;
		this.statusModel.setCurrentScore(newScore);
	}
	
	public boolean updateCurrentLevel() {
		boolean success = false;
		
		//retrieve and update previous level
		LevelS previousLevel = null;
		for (LevelS level : this.statusModel.getLevels()) {
			if (level.isIsCurrent()) {
				previousLevel = level;
				break;
			}
		}
		
		//if the previous level is not the last one, set the new level 
		if ((this.statusModel.getLevels().size() - 1) != this.statusModel.getLevels().indexOf(previousLevel)) {
			LevelS newLevel = this.statusModel.getLevels().get(this.statusModel.getLevels().indexOf(previousLevel) + 1);
			previousLevel.setIsCurrent(false);
			newLevel.setIsCurrent(true);
			success = true;
		}
		
		return success;
	}
	
	public List<Group> getActiveGroups(Level level) {
		List<Group> activeGroups = new ArrayList<Group>();
		
		LevelS lS = this.getLevelS(level);
		for (GroupS gS : lS.getGroups()) {
			if (!gS.getStatus().isComplete())
				activeGroups.add(gS.getGroup());
		}
	
		return activeGroups;
	}
	
	public List<Achievement> getActiveAchievements(Group group) {
		List<Achievement> activeAchievements = new ArrayList<Achievement>();
		
		GroupS gS = this.getGroupS(group);
		for(AchievementS aS : gS.getAchievements()) {
			if (!aS.getStatus().isComplete())
				activeAchievements.add(aS.getAchievement());
		}
		
		return activeAchievements;
	}
	
	public List<Task> getActiveTasks(Achievement achievement) {
		ArrayList<Task> activeTasks = new ArrayList<Task>();
		
		AchievementS aS = this.getAchievementS(achievement);
		for(TaskS tS : aS.getTasks()) {
			if (!tS.getStatus().isComplete())
				activeTasks.add(tS.getTask());
		}

		return activeTasks;
	}
	
	private TaskS getTaskS(Task task) {
		TreeIterator<EObject> iterator = this.statusModel.eAllContents();
		TaskS found = null;
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			if (o instanceof TaskS) {
				TaskS tS = (TaskS)o;
				if (tS.getTask().equals(task)) {
					found = tS;
					break;
				}
			}
		}
		
		return found;
	}
	
	private AchievementS getAchievementS(Achievement achievement) {
		TreeIterator<EObject> iterator = this.statusModel.eAllContents();
		AchievementS found = null;
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			if (o instanceof AchievementS) {
				AchievementS aS = (AchievementS)o;
				if (aS.getAchievement().equals(achievement)) {
					found = aS;
					break;
				}
			}
		}
		
		return found;
	}
	
	private GroupS getGroupS(Group group) {
		TreeIterator<EObject> iterator = this.statusModel.eAllContents();
		GroupS found = null;
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			if (o instanceof GroupS) {
				GroupS gS = (GroupS)o;
				if (gS.getGroup().equals(group)) {
					found = gS;
					break;
				}
			}
		}
		
		return found;
	}
	
	private LevelS getLevelS(Level level) {
		TreeIterator<EObject> iterator = this.statusModel.eAllContents();
		LevelS found = null;
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			if (o instanceof LevelS) {
				LevelS lS = (LevelS)o;
				if (lS.getLevel().equals(level)) {
					found = lS;
					break;
				}
			}
		}
		
		return found;
	}
	
	public void setStatusComplete(Task task) {
		TaskS found = this.getTaskS(task);
		if (found != null) {
			Status status = found.getStatus();
			status.setComplete(true);
			status.setMilliseconds(System.currentTimeMillis());
		}
	}
	
	private String getDate(long milliseconds) {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		 Date resultdate = new Date(milliseconds);
		 String output = sdf.format(resultdate);
		 
		 if (output.endsWith("1970"))
		 	output = "0";
		 
		 return output;
	}
	
	public boolean getStatus(Task task) {
		boolean flag = false;
		TaskS found = this.getTaskS(task);
		if (found != null) {
			Status status = found.getStatus();
			flag = status.isComplete();
		}
		
		return flag;
	}
	
	public void setStatusComplete(Achievement achievement) {
		AchievementS found = this.getAchievementS(achievement);
		if (found != null) {
			Status status = found.getStatus();
			status.setComplete(true);
			status.setMilliseconds(System.currentTimeMillis());
		}
	}
	
	public boolean getStatus(Achievement achievement) {
		boolean flag = false;
		AchievementS found = this.getAchievementS(achievement);
		if (found != null) {
			Status status = found.getStatus();
			flag = status.isComplete();
		}
		
		return flag;
	}
	
	public void setStatusComplete(Group group) {
		GroupS found = this.getGroupS(group);
		if (found != null) {
			Status status = found.getStatus();
			status.setComplete(true);
			status.setMilliseconds(System.currentTimeMillis());
		}
	}
	
	public boolean getStatus(Group group) {
		boolean flag = false;
		GroupS found = this.getGroupS(group);
		if (found != null) {
			Status status = found.getStatus();
			flag = status.isComplete();
		}
		
		return flag;
	}
	
	public void setStatusComplete(Level level) {
		LevelS found = this.getLevelS(level);
		if (found != null) {
			Status status = found.getStatus();
			status.setComplete(true);
			status.setMilliseconds(System.currentTimeMillis());
		}
	}
	
	public boolean getStatus(Level level) {
		boolean flag = false;
		LevelS found = this.getLevelS(level);
		if (found != null) {
			Status status = found.getStatus();
			flag = status.isComplete();
		}
		
		return flag;
	}
	
	public boolean isGameComplete() {
		return this.statusModel.getStatus().isComplete();
	}
	
	public void setGameComplete() {
		GameS found = this.statusModel;
		Status status = found.getStatus();
		status.setComplete(true);
		status.setMilliseconds(System.currentTimeMillis());
	}
	
	public List<Level> getCompleteLevels() {
		List<Level> complete = new ArrayList<Level>();
		TreeIterator<EObject> iterator = this.statusModel.eAllContents();
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			if (o instanceof LevelS) {
				LevelS lS = (LevelS)o;
				if (lS.getStatus().isComplete()) {
					complete.add(lS.getLevel());
				}
			}
		}
		
		return complete;
	}

	public List<Group> getCompleteGroups() {
		List<Group> complete = new ArrayList<Group>();
		TreeIterator<EObject> iterator = this.statusModel.eAllContents();
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			if (o instanceof GroupS) {
				GroupS gS = (GroupS)o;
				if (gS.getStatus().isComplete()) {
					complete.add(gS.getGroup());
				}
			}
		}
		
		return complete;
	}
	
	public List<Achievement> getCompleteAchievements() {
		List<Achievement> complete = new ArrayList<Achievement>();
		TreeIterator<EObject> iterator = this.statusModel.eAllContents();
		while (iterator.hasNext()) {
			EObject o = iterator.next();
			if (o instanceof AchievementS) {
				AchievementS aS = (AchievementS)o;
				if (aS.getStatus().isComplete()) {
					complete.add(aS.getAchievement());
				}
			}
		}
		
		return complete;
	}
	
	private String toJSON(Status status) {
		return "\"complete\": " + status.isComplete() + ", \"date\": \"" + this.getDate(status.getMilliseconds()) + "\"";
	}

	public String toJSON() {
		String output = "";
		
		if (this.statusModel != null) {
			//game info
			output = output + "\"game\" : { "
											+ "\"created\": \"" + this.getDate(this.statusModel.getCreated()) + "\", "
											+ "\"score\": " + this.getCurrentScore() + ", "
											+ this.toJSON(this.statusModel.getStatus()) + ", "
											+ "\"signature\" : \"" + this.statusModel.getSignature() + "\" , ";
			//level info
			output = output + "\"levels\" : [";
			for (LevelS level : this.statusModel.getLevels()) {
				output = output + "{\"name\" : \"" + level.getLevel().getName() + "\" , "
						        + this.toJSON(level.getStatus()) + ", " 
						        + "\"points\": " + level.getLevel().getReward().getPoints() + ", ";
				
				//group info
				output = output + "\"groups\" : [";
				for (GroupS group : level.getGroups()) {
					output = output + "{\"name\" : \"" + group.getGroup().getName() + "\" , "
							          + this.toJSON(group.getStatus()) + ", "
							          + "\"points\": " + group.getGroup().getReward().getPoints() + ", ";
					
					//achievement info
					output = output + "\"achievements\" : [";
					for (AchievementS achievement : group.getAchievements()) {
						output = output + "{\"name\" : \"" + achievement.getAchievement().getName() + "\" , "
								 + this.toJSON(achievement.getStatus()) + ", "
								 + "\"points\": " + achievement.getAchievement().getReward().getPoints() + ", ";
					
						//task info
						output = output + "\"tasks\" : [";
						for (TaskS task : achievement.getTasks()) {
							if (achievement.getTasks().get(achievement.getTasks().size()-1).equals(task))
								output = output + "{\"query\" : \"" + task.getTask().getQueryName() + "\" , "
										+ this.toJSON(task.getStatus()) + "} ";
							else
								output = output + "{\"query\" : \"" + task.getTask().getQueryName() + "\" , "
										+ this.toJSON(task.getStatus()) + "} , ";
						}
						
						if (group.getAchievements().get(group.getAchievements().size()-1).equals(achievement))
							output = output + "]}";
						else
							output = output + "]},";
						
					}
					
					if (level.getGroups().get(level.getGroups().size()-1).equals(group))
						output = output + "]}";
					else
						output = output + "]},";
							          
				}
				
				if (this.statusModel.getLevels().get(this.statusModel.getLevels().size()-1).equals(level))
					output = output + "]}";
				else
					output = output + "]},";
			}
			
			output = output + "]}";
			
		}
		else {
			output = "{}";
		}
		
		return output;
	}
	
}

package codeskills.visualization;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import codeskills.designer.game.game.Achievement;
import codeskills.designer.game.game.Group;
import codeskills.designer.game.game.Level;
import codeskills.game.GameManager;
import codeskills.listener.ImageListener;
import codeskills.resource.ResourceManager;

public class GameStatisticsDialog extends Dialog {
	
	private GameManager gameManager;
	private ResourceManager resourceManager;
	private ImageListener imageListener;
	private List<Image> images;
	private Logger logger = Logger.getAnonymousLogger();
	
	private final static int OVERVIEW_IMAGE_SIZE = 80;
	private final static int GROUP_IMAGE_SIZE = 50;
	private final static int ACHIEVEMENT_IMAGE_SIZE = 30;
	
	public GameStatisticsDialog(Shell parentShell) {
		super(parentShell);
		this.gameManager = GameManager.getInstance();
		this.resourceManager = ResourceManager.getInstance();
		this.imageListener = new ImageListener();
		this.images = new LinkedList<Image>();
	}
	
	public void disposeImages() {
		for (Image i : this.images)
			i.dispose();
	}
	
	private void addImage(Image image) {
		this.images.add(image);
	}
	
	private Image createImage(Display display, String path, String fallback) {
		Image found = null;
		try {
			found = new Image(display, this.resourceManager.getResource(path).openStream());
		}
		catch (Exception e) {
			try {
				found = new Image(display, this.resourceManager.getResource(ResourceManager.IMG_BADGES + fallback).openStream());
			} catch (IOException e1) {
				logger.log(java.util.logging.Level.SEVERE, "[GameStatisticsDialog] default image not found", e1);
			}
		}
		
		this.addImage(found);
		
		return found;
	}
	
	private Image scale(Display display, Image image, int scaleTo) {
		ImageData imageDataLevels = image.getImageData().scaledTo(scaleTo, scaleTo);
        Image scaled = new Image(display, imageDataLevels);
        image.dispose();
        
        this.addImage(scaled);  
        return scaled;
	}
	
	private Image toGray(Display display, Image image) {
		Image gray = new Image(display, image, SWT.IMAGE_GRAY);
		image.dispose();

		this.addImage(gray);
		return gray;
	}
	
	private void createOverviewContainer(Composite parent) {
        Display display = Display.getCurrent();
        
        Composite overview = new Composite(parent, SWT.NONE);
        overview.setLayout(new GridLayout(4, true));
        overview.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
     
        //first row
        Image imagePoints = this.createImage(display, ResourceManager.IMG_BADGES + ResourceManager.POINTS_IMG, ResourceManager.FALLBACK_IMG);
        imagePoints = scale(display, imagePoints, OVERVIEW_IMAGE_SIZE);
        Label iPoints = new Label(overview, SWT.FILL);
        iPoints.setImage(imagePoints);
        iPoints.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, false));
        
        Image imageLevels = this.createImage(display, ResourceManager.IMG_BADGES + ResourceManager.LEVEL_IMG, ResourceManager.FALLBACK_IMG);
        imageLevels = scale(display, imageLevels, OVERVIEW_IMAGE_SIZE);
        Label iLevels = new Label(overview, SWT.FILL);
        iLevels.setImage(imageLevels);
        iLevels.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, false)); 
        
        Image imageGroups = this.createImage(display, ResourceManager.IMG_BADGES + ResourceManager.GROUP_IMG, ResourceManager.FALLBACK_IMG);
        imageGroups = scale(display, imageGroups, OVERVIEW_IMAGE_SIZE);
        Label iGroups = new Label(overview, SWT.FILL);
        iGroups.setImage(imageGroups);
        iGroups.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, false));
        
        Image imageAchievements = this.createImage(display, ResourceManager.IMG_BADGES + ResourceManager.ACHIEVEMENT_IMG, ResourceManager.FALLBACK_IMG);
        imageAchievements = scale(display, imageAchievements, OVERVIEW_IMAGE_SIZE);
        Label iAchievements = new Label(overview, SWT.FILL);
        iAchievements.setImage(imageAchievements);
        iAchievements.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, false, false));
        
        //second row
        Label tPoints = new Label(overview, SWT.CENTER);
        tPoints.setText("Points: " + this.gameManager.getCurrentScore());
        tPoints.setFont(new Font(super.getShell().getDisplay(), "Arial", 10, SWT.BOLD));
        tPoints.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, false));
        
        Label tLevels = new Label(overview, SWT.CENTER);
        tLevels.setText("Levels: " + this.gameManager.getCompleteLevels().size());
        tLevels.setFont(new Font(super.getShell().getDisplay(), "Arial", 10, SWT.BOLD));
        tLevels.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, false));
        
        Label tGroups = new Label(overview, SWT.CENTER);
        tGroups.setText("Groups: " + this.gameManager.getCompleteGroups().size());
        tGroups.setFont(new Font(super.getShell().getDisplay(), "Arial", 10, SWT.BOLD));
        tGroups.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, false));
        
        Label tAchievements = new Label(overview, SWT.CENTER);
        tAchievements.setText("Achvs: " + this.gameManager.getCompleteAchievements().size());
        tAchievements.setFont(new Font(super.getShell().getDisplay(), "Arial", 10, SWT.BOLD));
        tAchievements.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, false));
        
	}
	
	private Composite createAchievementsDetails(List<Achievement> achievements, Composite parent)  {
		Display display = Display.getCurrent();
		
		Composite achievementsInfo = new Composite(parent, SWT.FILL);
		RowLayout rowLayout = new RowLayout();
		rowLayout.wrap = true;
        achievementsInfo.setLayout(rowLayout);
        
        for (Achievement achievement : achievements) {
        	Image imageAchievement = this.createImage(display, achievement.getReward().getBadgePath(), ResourceManager.ACHIEVEMENT_IMG);
            imageAchievement = scale(display, imageAchievement, ACHIEVEMENT_IMAGE_SIZE);
            
            if (!this.gameManager.isComplete(achievement))
            	imageAchievement = toGray(display, imageAchievement);
            	
            Label iAchievement = new Label(achievementsInfo, SWT.FILL);
            iAchievement.setImage(imageAchievement);
            iAchievement.setData(achievement.getDescription());
            iAchievement.addMouseListener(this.imageListener);
        }
        
        return achievementsInfo;
	}
	
	private void createGroupDetails(Composite parent, Group group) {
    	Composite details = new Composite(parent, SWT.NONE);

        details.setLayout(new GridLayout(2, false));
        details.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        
        Display display = Display.getCurrent();
        
        //group info        
        Image imageGroup = this.createImage(display, group.getReward().getBadgePath(), ResourceManager.GROUP_IMG);
        imageGroup = scale(display, imageGroup, GROUP_IMAGE_SIZE);
        
        if (!this.gameManager.isComplete(group))
        	imageGroup = toGray(display, imageGroup);
        
        Label iGroup = new Label(details, SWT.FILL);
        iGroup.setData(group.getDescription());
        iGroup.setImage(imageGroup);
        
        iGroup.addMouseListener(this.imageListener);
        
        
        //achievements info
        Composite achievementsInfo = new Composite(details, SWT.FILL);
        achievementsInfo.setLayout(new GridLayout(10, true));
        achievementsInfo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
        
        for (Achievement achievement : group.getAchievements()) {
        	Image imageAchievement = this.createImage(display, achievement.getReward().getBadgePath(), ResourceManager.ACHIEVEMENT_IMG);
            imageAchievement = scale(display, imageAchievement, ACHIEVEMENT_IMAGE_SIZE);
            
            if (!this.gameManager.isComplete(achievement))
            	imageAchievement = toGray(display, imageAchievement);
            	
            Label iAchievement = new Label(achievementsInfo, SWT.FILL);
            iAchievement.setImage(imageAchievement);
            iAchievement.setData(achievement.getDescription());
            iAchievement.addMouseListener(this.imageListener);
        }
        
	}
	
	private void createLevelContainer(Composite parent) {
		Composite levelContainer = new Composite(parent, SWT.NULL);
	    levelContainer.setLayout(new GridLayout(1, false));
	    levelContainer.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, true, false));
		
		TabFolder tabFolder = new TabFolder(levelContainer, SWT.NULL);
		
        for (Level level : this.gameManager.getLevels()) {
        	TabItem tab = new TabItem(tabFolder, SWT.NULL);
        	tab.setText("Level " + level.getName());
           
        	Composite overview = new Composite(tabFolder, SWT.NULL);
            overview.setLayout(new GridLayout(1, true));
            overview.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
            
            for (Group group : level.getGroups())
            	this.createGroupDetails(overview, group);
        	
        	tab.setControl(overview);
        	
        }
	}
	
	private void createDetailsContainer(Composite parent) {
		org.eclipse.swt.widgets.Group infoContainer = new org.eclipse.swt.widgets.Group(parent, SWT.NONE);
	    infoContainer.setText("Details");
	    infoContainer.setLayout(new GridLayout(1, false));
	    infoContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    
		Text info = new Text(infoContainer, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		this.imageListener.setReceiver(info);
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, true);
		gridData.minimumHeight = 50;
		info.setLayoutData(gridData);
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(1, false));
	    GridLayout layout = (GridLayout) container.getLayout();
	    layout.numColumns = 1;
	    layout.verticalSpacing = 10;
	    
	    //overview
	    this.createOverviewContainer(container);
	    
	    //levels
	    this.createLevelContainer(container);
	    
	    //reward details
	    this.createDetailsContainer(container);
	    
	    return container;
	}
	
	@Override
	public boolean close() {
		this.disposeImages();
		return super.close();
	}
	
	
	@Override
	protected void createButtonsForButtonBar(final Composite parent) { 
		GridLayout layout = (GridLayout)parent.getLayout();
		layout.marginHeight = 0;
	}
	
	@Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Game statistics");
    }
	
}
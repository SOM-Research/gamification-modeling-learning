package codeskills.visualization;

import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolTip;

import codeskills.handlers.SubmitManager;

import org.eclipse.swt.graphics.Font;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.graphics.Point;

public class SubmitStatusDialog extends Dialog {
	
	private Text urlField;
	private Text usernameField;
	private Text passwordField;
	private Text confirmPasswordField;
	private Button newUserButton;
	private Text emailField;
	private Text birthField;
	private Combo locationField;
	private Combo degreeField;
	private Combo professionField;
	private Text professionDetailsField;
	
	private static String[] LOCATIONS = getISOCountries();
	private static String[] JOB_TITLES = new String[] {"Intern", "Student", "Researcher", "Engineer", "Manager"};
	private static String[] ACADEMIC_TITLES = new String[]{"Undergraduate", "Bachelor", "Master", "Phd"};
	
	private static final int RESET_ID = IDialogConstants.NO_TO_ALL_ID + 1;
	private static final int LENGTH = 5;
	
	public SubmitStatusDialog(Shell parentShell) {
		super(parentShell);
	}
	
	private static String[] getISOCountries() {
		List<String> locales = new LinkedList<String>();
	
		for (String countryCode : Locale.getISOCountries()) {
		    Locale obj = new Locale("", countryCode);
		    locales.add(obj.getDisplayCountry(Locale.ENGLISH));
		}
		
		String[] localesArr = new String[locales.size()];
		localesArr = locales.toArray(localesArr);
		return localesArr;
	}
	
	private void createURLComponent(Composite parent) {
		Composite urlRow = new Composite(parent, SWT.NONE);
		urlRow.setLayout(new GridLayout(2, true));
		urlRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label urlLabel = new Label(urlRow, SWT.LEFT);
	    urlLabel.setText("URL: ");
	    urlLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    urlField = new Text(urlRow, SWT.SINGLE | SWT.BORDER);
	    urlField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    urlRow.setVisible(true);    
	}
	
	private void createUsernameComponent(Composite parent) {
		Composite userNameRow = new Composite(parent, SWT.NONE);
	    userNameRow.setLayout(new GridLayout(2, true));
	    userNameRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label usernameLabel = new Label(userNameRow, SWT.LEFT);
	    usernameLabel.setText("Username: "); 
	    usernameLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	       
	    ToolTip tip = new ToolTip(Display.getCurrent().getActiveShell(), SWT.BALLOON);
	    tip.setMessage("Username must contain at least " + LENGTH + " characters and be alphanumberic.");   
	    
	    usernameField = new Text(userNameRow, SWT.SINGLE | SWT.BORDER);
	    usernameField.addMouseTrackListener(new MouseTrackListener() {
			
			@Override
			public void mouseHover(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExit(MouseEvent e) {
				// TODO Auto-generated method stub
				tip.setVisible(false);
			}
			
			@Override
			public void mouseEnter(MouseEvent e) {
				// TODO Auto-generated method stub
				Text actionWidget = (Text) e.widget;
                Point loc = actionWidget.toDisplay(actionWidget.getLocation());
                tip.setLocation(loc.x - (loc.x / 50), loc.y);
                tip.setVisible(true);
			}
		});
	    
	    usernameField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	}
	
	private void createPasswordComponent(Composite parent) {
		Composite passwordRow = new Composite(parent, SWT.NONE);
	    passwordRow.setLayout(new GridLayout(2, true));
	    passwordRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label passwordLabel = new Label(passwordRow, SWT.LEFT);
	    passwordLabel.setText("Password: ");
	    passwordLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    ToolTip tip = new ToolTip(Display.getCurrent().getActiveShell(), SWT.BALLOON);
	    tip.setMessage("Password must contain more than " + LENGTH + " characters.");   
	    
	    passwordField = new Text(passwordRow, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD);
	    passwordField.addMouseTrackListener(new MouseTrackListener() {
			
			@Override
			public void mouseHover(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExit(MouseEvent e) {
				// TODO Auto-generated method stub
				tip.setVisible(false);
			}
			
			@Override
			public void mouseEnter(MouseEvent e) {
				// TODO Auto-generated method stub
				Text actionWidget = (Text) e.widget;
                Point loc = actionWidget.toDisplay(actionWidget.getLocation());
                tip.setLocation(loc.x - (loc.x / 50), loc.y);
                tip.setVisible(true);
			}
		});
	    
	    passwordField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	}
	
	private Composite addNewUserCheckBox(Composite parent) {
		Composite checkBoxRow = new Composite(parent, SWT.NONE);
		checkBoxRow.setLayout(new GridLayout(2, true));
		checkBoxRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		
		Label newUserLabel = new Label(checkBoxRow, SWT.LEFT);
		newUserLabel.setText("New user?");
		newUserLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		
		newUserButton = new Button(checkBoxRow, SWT.CHECK);
		newUserButton.setSelection(true);
		newUserButton.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		
		return checkBoxRow;
	}
	
	private void createEmailComponent(Composite parent) {
		Composite emailRow = new Composite(parent, SWT.NONE);
		emailRow.setLayout(new GridLayout(2, true));
		emailRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label emailLabel = new Label(emailRow, SWT.LEFT);
	    emailLabel.setText("Email: ");
	    emailLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    emailField = new Text(emailRow, SWT.SINGLE | SWT.BORDER);
	    emailField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    emailRow.setVisible(true);
	}
	
	private Composite createDateOfBirthComponent(Composite parent) {
		Composite birthRow = new Composite(parent, SWT.NONE);
		birthRow.setLayout(new GridLayout(2, true));
		birthRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label birthLabel = new Label(birthRow, SWT.LEFT);
	    birthLabel.setText("Date of birth: ");
	    birthLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    birthField = new Text(birthRow, SWT.SINGLE | SWT.BORDER);
	    ToolTip tip = new ToolTip(Display.getCurrent().getActiveShell(), SWT.BALLOON);
	    tip.setMessage("Date must follow the format DD-MM-YYYY.");   
	    
	    birthField.addMouseTrackListener(new MouseTrackListener() {
			
			@Override
			public void mouseHover(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExit(MouseEvent e) {
				// TODO Auto-generated method stub
				tip.setVisible(false);
			}
			
			@Override
			public void mouseEnter(MouseEvent e) {
				// TODO Auto-generated method stub
				Text actionWidget = (Text) e.widget;
                Point loc = actionWidget.toDisplay(actionWidget.getLocation());
                tip.setLocation(loc.x - (loc.x / 50), loc.y);
                tip.setVisible(true);
			}
		});

	    birthField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    birthRow.setVisible(true);
	    return birthRow;
	}
	
	private void createConfirmPasswordComponent(Composite parent) {
		Composite confirmPasswordRow = new Composite(parent, SWT.NONE);
	    confirmPasswordRow.setLayout(new GridLayout(2, true));
	    confirmPasswordRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label confirmPasswordLabel = new Label(confirmPasswordRow, SWT.LEFT);
	    confirmPasswordLabel.setText("Repeat Password: ");
	    confirmPasswordLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    confirmPasswordField = new Text(confirmPasswordRow, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD);
	    confirmPasswordField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    confirmPasswordRow.setVisible(true);
	}
	
	private void createLocationComponent(Composite parent) {
		Composite locationRow = new Composite(parent, SWT.NONE);
		locationRow.setLayout(new GridLayout(2, true));
		locationRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label locationLabel = new Label(locationRow, SWT.LEFT);
	    locationLabel.setText("Location: ");
	    locationLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

	    locationField = new Combo(locationRow, SWT.DROP_DOWN);
	    locationField.setItems(LOCATIONS);
	    locationField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    locationRow.setVisible(true);	    
	}
	
	private void createAcademicDegreeComponent(Composite parent) {
		Composite degreeRow = new Composite(parent, SWT.NONE);
		degreeRow.setLayout(new GridLayout(2, true));
		degreeRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label degreeLabel = new Label(degreeRow, SWT.LEFT);
	    degreeLabel.setText("Academic title: ");
	    degreeLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

	    degreeField = new Combo(degreeRow, SWT.DROP_DOWN);
	    degreeField.setItems(ACADEMIC_TITLES);
	    degreeField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    degreeRow.setVisible(true);
	}
	
	private void createProfessionComponent(Composite parent) {
		Composite professionRow = new Composite(parent, SWT.NONE);
		professionRow.setLayout(new GridLayout(2, true));
		professionRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label professionLabel = new Label(professionRow, SWT.LEFT);
	    professionLabel.setText("Profession: ");
	    professionLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));

	    professionField = new Combo(professionRow, SWT.DROP_DOWN);
	    professionField.setItems(JOB_TITLES);
	    professionField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    professionRow.setVisible(true);
	}
	
	private void createProfessionDetailsComponent(Composite parent) {
		Composite professionDetailsRow = new Composite(parent, SWT.NONE);
		professionDetailsRow.setLayout(new GridLayout(2, true));
		professionDetailsRow.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    Label professionDetailsLabel = new Label(professionDetailsRow, SWT.LEFT);
	    professionDetailsLabel.setText("Company/Institution: ");
	    professionDetailsLabel.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    professionDetailsField = new Text(professionDetailsRow, SWT.SINGLE | SWT.BORDER);
	    professionDetailsField.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    
	    professionDetailsRow.setVisible(true);
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite component = (Composite) super.createDialogArea(parent);
		component.setLayout(new GridLayout(1, false));
		
	    GridLayout layout = (GridLayout) component.getLayout();
	    layout.numColumns = 1;
	    
	    Group serverGroup = new Group(parent, SWT.SHADOW_ETCHED_IN);
	    serverGroup.setText("Server");
	    serverGroup.setFont(new Font(super.getShell().getDisplay(), "Arial", 10, SWT.BOLD));
	    serverGroup.setLayout(new GridLayout(1, false));
	    serverGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    this.createURLComponent(serverGroup);
	    
	    Group loginGroup = new Group(parent, SWT.SHADOW_ETCHED_IN);
	    loginGroup.setText("Credentials");
	    loginGroup.setFont(new Font(super.getShell().getDisplay(), "Arial", 10, SWT.BOLD));
	    loginGroup.setLayout(new GridLayout(1, false));
	    loginGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    this.createUsernameComponent(loginGroup);
	    this.createEmailComponent(loginGroup);
	    this.createPasswordComponent(loginGroup);
	    
	    Group detailsGroup = new Group(parent, SWT.SHADOW_ETCHED_IN);
	    detailsGroup.setText("Registration");
	    detailsGroup.setFont(new Font(super.getShell().getDisplay(), "Arial", 10, SWT.BOLD));
	    detailsGroup.setLayout(new GridLayout(1, false));
	    detailsGroup.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
	    this.addNewUserCheckBox(detailsGroup);
	    this.createConfirmPasswordComponent(detailsGroup);
	    this.createDateOfBirthComponent(detailsGroup);
	    this.createLocationComponent(detailsGroup);
	    this.createAcademicDegreeComponent(detailsGroup);
	    this.createProfessionComponent(detailsGroup);
	    this.createProfessionDetailsComponent(detailsGroup);
	    	
	    return component;
	  }

	  protected void createButtonsForButtonBar(Composite parent) {
		  super.createButtonsForButtonBar(parent);
		  createButton(parent, RESET_ID, "Reset All", false);
	  }

	  protected void buttonPressed(int buttonId) {
		  if (buttonId == RESET_ID) {
			  usernameField.setText("");
			  passwordField.setText("");
			  confirmPasswordField.setText("");
		} else if (buttonId == OK) {
			if (this.validate()) {
				this.sendData();
				this.close();
			}
	    } else {
	    	super.buttonPressed(buttonId);
	    }
	  }
	  
	  private Map<String, String> collectDialogInfo() {
		  Map<String, String> info = new HashMap<String, String>();
		  
		  info.put("url", this.urlField.getText());
		  info.put("username", this.usernameField.getText());
		  info.put("password", this.passwordField.getText());
		  info.put("email", this.emailField.getText());
		  
		  if (this.newUserButton.getSelection()) {
			  info.put("birth", this.birthField.getText());
			  info.put("location", this.locationField.getText());
			  info.put("degree", this.degreeField.getText());
			  info.put("profession", this.professionField.getText());
			  info.put("details", this.professionDetailsField.getText());
		  }
		  
		  return info;
	  }
	  
	  private void sendData() {
		  SubmitManager submitManager = new SubmitManager();
		  Map<String, String> data = this.collectDialogInfo();
		  submitManager.sendData(data);
	  }
	  
	  private boolean validate() {
		  boolean flag = true;
		  String message = "";
		  
		  if (!this.validateURL(this.urlField.getText())) {
			  message = message.concat("URL is not valid or cannot connect.\n");
			  flag = false;
		  }
		  
		  if (!this.validateUsername(this.usernameField.getText())) {
			  message = message.concat("Username must contain at least " + LENGTH + " characters and be alphanumberic.\n");
			  flag = false;  
		  }
		  
		  if (!this.validatePassword(this.passwordField.getText())) {
			  message = message.concat("Password must contain at least " + LENGTH + " characters.\n");
			  flag = false;
		  }
		  
		  if (!this.validateEmail(this.emailField.getText())) {
			  message = message.concat("Email is not valid\n");
			  flag = false;
		  }
		  
		  if (this.newUserButton.getSelection()) {
			  if (!this.validateConfirmedPassword(this.passwordField.getText(), this.confirmPasswordField.getText())) {
				  message = message.concat("Passwords do not match.\n");
				  flag = false;
			  }
			  
			  if (!this.validateDate(this.birthField.getText())) {
				  message = message.concat("Date must follow the format DD-MM-YYYY.");
				  flag = false;
			  }
			  
		  }
		  
		  if (!flag)
			  MessageDialog.openError(Display.getCurrent().getActiveShell(), "Something is wrong!", message);
		  
		  return flag;
	  }
	  
	  private boolean validateUsername(String text) {
		  String ePattern = "^[a-zA-Z0-9]+$";
		  Pattern p = java.util.regex.Pattern.compile(ePattern);
		  Matcher m = p.matcher(text);
		  
		  return m.matches() && text.length() >= LENGTH;
	  }
	  
	  private boolean validateEmail(String text) {
		  String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
          java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
          java.util.regex.Matcher m = p.matcher(text);
          return m.matches();
	  }
	  
	  private boolean validateDate(String text) {
		  String ePattern = "^[0-9][0-9]\\-[0-9][0-9]\\-[0-9][0-9][0-9][0-9]$";
          java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
          java.util.regex.Matcher m = p.matcher(text);
          return m.matches();
	  }
	  
	  private boolean validateURL(String text) {
		  boolean flag = true;
		  try {
			    URL url = new URL(text);
			    URLConnection conn = url.openConnection();
			    conn.connect();
			} catch (Exception e) {
			    flag = false;
			}
		  
		  return flag;
	  }
	  
	  private boolean validatePassword(String text) {
		 return text.length() >= LENGTH;
	  }
	  
	  private boolean validateConfirmedPassword(String original, String confirmation) {
		  return original.equals(confirmation);
	  }
	  
	  @Override
      protected void configureShell(Shell newShell) {
          super.configureShell(newShell);
          newShell.setText("Submit result");
      }

}
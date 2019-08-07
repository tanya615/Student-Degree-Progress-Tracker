
import javax.swing.*; //swing classes
import java.awt.event.*; //listener interface
import java.awt.*; //for color class
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class ProgressWindow extends JFrame {
final static int WINDOW_WIDTH = 910;
final static int WINDOW_HEIGHT = 510;
JFrame progressWindow;
JButton back;
JButton next;
JTextField time;
JTextField time2;
private JCheckBox[] days;
final static int numTxtBox = 24;
public static ArrayList<String> daysSelected = new ArrayList<String>();
public static ArrayList<String> classesAvailable = new ArrayList<String>();
	
public ProgressWindow() {
	/*Window Displays student progress and asks for time constraints */
	progressWindow = new JFrame("Student Degree Progress Tracker");
	progressWindow.setLayout(new BorderLayout()); 
	progressWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	progressWindow.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	
	/*Logo Panel*/
	 JPanel top = new JPanel(new GridLayout(1,3));
	 top.setBackground(Color.WHITE); 
	  Image image = null;
      try {
          URL url = new URL("http://www.csueastbay.edu/alumni/files/images/CSUEB-Featured-Link.jpg");
          image = ImageIO.read(url);
          
      } catch (IOException e) {
      	e.printStackTrace();
      }
     JLabel logo = new JLabel();
      ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(220, 124, Image.SCALE_SMOOTH));
      logo.setIcon(imageIcon);
      top.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	 
	 JPanel blank = new JPanel();
	 blank.setBackground(Color.WHITE);
	 JPanel blank1 = new JPanel();
	 blank1.setBackground(Color.WHITE);
	 
	 top.add(logo);
	 top.add(blank);
	 top.add(blank1);
	 
	 progressWindow.add(top, BorderLayout.NORTH);
	
	/*Percent Completion Panel*/
	 JPanel percentMsg = new JPanel(new GridLayout(5,1));
	 percentMsg.setBackground(Color.WHITE);
	 int percent = CSWindow1.getClassesTakenSize();
	 percent = ((percent*100)/numTxtBox);
	 
	 JLabel messageLabel = new JLabel("You have completed " + percent + " % of your coursework.");
	 messageLabel.setFont(new Font("Serif", Font.BOLD, 22));
	 JLabel chooseDays = new JLabel("Please choose your preferred class days: ");
	 chooseDays.setFont(new Font("Serif", Font.BOLD, 14));
	 percentMsg.add(messageLabel);
	 percentMsg.add(chooseDays);
	 
	/*Days Selector: Horizontal Panel with 5 columns*/ 
	 JPanel daysPanel = new JPanel(new GridLayout(1,5));
	 
	 days = new JCheckBox[] {
			 new JCheckBox("Monday"),
			 new JCheckBox("Tuesday"),
			 new JCheckBox("Wednesday"),
			 new JCheckBox("Thursday"),
			 new JCheckBox("Friday"),
			 }; 
	 
	 for(JCheckBox days1 : days) {
			days1.setBackground(Color.WHITE);
			daysPanel.add(days1);
		}	 
	 percentMsg.add(daysPanel);
	 
	 /*Time Frame: 2x 2 Panel */
	 JPanel timeFrame = new JPanel(new GridLayout(1,2));
	 timeFrame.setBackground(Color.WHITE);
	 JLabel chooseTime = new JLabel ("Please select time preference in 24:00hr format ex (8:00-1400):");
	 chooseTime.setFont(new Font("Serif", Font.BOLD, 14));
	 /*Create 1x4 panel to resize text box*/
	 JPanel txtBox = new JPanel(new GridLayout(1,3));
	 time = new JTextField();
	 time.setBorder(BorderFactory.createTitledBorder("Start"));
	 txtBox.add(time);
	 timeFrame.add(txtBox);
	 time2 = new JTextField();
	 time2.setBorder(BorderFactory.createTitledBorder("End"));
	 txtBox.add(time2);
	 for(int i = 0; i<1; i++) {
		 JPanel empty = new JPanel();
		 empty.setBackground(Color.WHITE);
		txtBox.add(empty); 
	 }
	 /*add components*/
	timeFrame.add(chooseTime);
	timeFrame.add(txtBox);
	progressWindow.add(timeFrame);
	percentMsg.add(timeFrame);
	progressWindow.add(percentMsg, BorderLayout.CENTER);
	 
	 /*buttons*/
	JPanel bottom = new JPanel(new GridLayout(1,2));
	bottom.setBackground(Color.WHITE);
	bottom.setPreferredSize(new Dimension(25, 25));
	back = new JButton("back");
	next = new JButton("next");
	bottom.add(back);  
	bottom.add(next);
	back.addActionListener(new progressWindowButtonListener());
	next.addActionListener(new progressWindowButtonListener());
	progressWindow.add(bottom, BorderLayout.SOUTH);	
	progressWindow.setVisible(true);
}

//button listeners
private class progressWindowButtonListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource() == back) {
		progressWindow.setVisible(false);
		//new ScheduleSelector();
		
	}if(e.getSource() == next) {
		getDaysSelected();
		getStartTime();
		getEndTime();
		getClasses();
		progressWindow.setVisible(false);
		new CSCourseSelectionWindow();
		
		}
	}
}
	
public void getDaysSelected() {
	//takes checked boxes and stores corresponding string names into an array list
		
	for(int i = 0; i<days.length; i++) {
		if(days[i].isSelected()) {
			daysSelected.add(days[i].getText());
		}
	}
}

public int getStartTime() {
	return Integer.parseInt(time.getText().replaceAll("\\D", ""));
	
}
public int getEndTime() {
	return Integer.parseInt(time2.getText().replaceAll("\\D", ""));	
}


public void getClasses() {
	CSmajor csmajor = new CSmajor();
	CSWindow1 csClasses = new CSWindow1();	
	ArrayList<String> classNames = new ArrayList<String>();
	classNames = new ArrayList<String>(csClasses.getClassesRemainingArray());
	getDaysSelected();
	for(int i=0; i<classNames.size(); i++) {
		String course = classNames.get(i);
		if(csmajor.getCourse(course).contentEquals(course)){
			String name = csmajor.getCourse(course);
			classesAvailable.add(name);
		
	
		
	}
	}
}
	public static void main(String[] args) {
		new ProgressWindow();
	}

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import javax.imageio.ImageIO;

import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;
import java.util.Arrays;
import java.util.ArrayList;

class PreferredTimeDay extends JPanel{
	private JPanel percentPanel;
	JLabel percentLabel;
	
	private JPanel preferencePanel;
	private JLabel fallScheduler;
    
    private JPanel timeLabelP;
    private JPanel timePanel;
    private JLabel timeLabel;
    private JLabel startTimeLabel;
    private JLabel endTimeLabel;
    JTextField inputStartTime;
    JTextField inputEndTime;

	private JPanel dayPanel;
	private JLabel dayLabel;
	JCheckBox[] dayBoxes;

	
	public PreferredTimeDay(){
        setLayout(new BorderLayout());
        
		// everything in PercentPanel
		percentLabel = new JLabel("You have completed " + CEWindow1.getPercentage() + "% of the required courses!");
		fallScheduler = new JLabel("\tFall 2019 Class Scheduler: ");
		
		percentPanel = new JPanel();
		percentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		percentPanel.setBackground(Color.WHITE);
		percentPanel.add(percentLabel);
		add(percentPanel, BorderLayout.NORTH);
		
		
		// time and day components that will be later added to the preferrence panel
		timeLabel = new JLabel("\tEnter Preferred start and end times in 24hr format (ex 23:00): ");
        startTimeLabel = new JLabel("\tStart Time:");
        endTimeLabel = new JLabel("End Time:");
        inputStartTime = new JTextField(10);
        inputEndTime = new JTextField(10);
		
        dayLabel = new JLabel("\tPreferred days:");
		dayBoxes = new JCheckBox[] { 
				new JCheckBox("Monday"), 
				new JCheckBox("Tuesday"),
				new JCheckBox("Wednesday"),
				new JCheckBox("Thursday"),
				new JCheckBox("Friday") 
		};
		
        // timeLabelP has just one label in it
        // timePanel and dayPanel is called within the preferencePanel
        timeLabelP = new JPanel();
        timeLabelP.setBackground(Color.WHITE);
        timeLabelP.setLayout(new FlowLayout(FlowLayout.LEFT));
        timeLabelP.add(timeLabel);
        
        timePanel = new JPanel();
		timePanel.setBackground(Color.WHITE);
		timePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        timePanel.add(startTimeLabel);
        timePanel.add(inputStartTime);
        timePanel.add(endTimeLabel);
        timePanel.add(inputEndTime);

		
		dayPanel = new JPanel();
		dayPanel.setBackground(Color.WHITE);
		dayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		dayPanel.add(dayLabel);
		for(JCheckBox box : dayBoxes){
			dayPanel.add(box);
		}
		
		preferencePanel = new JPanel();
		preferencePanel.setLayout(new GridLayout(7,1));
		preferencePanel.setBackground(Color.WHITE);
				
        preferencePanel.add( fallScheduler );
        preferencePanel.add( timeLabelP ) ;
		preferencePanel.add( timePanel );
		preferencePanel.add( dayPanel );
		for(int i =0; i <= 2; i++){
			JPanel blank = new JPanel();
			blank.setBackground(Color.WHITE);	
			preferencePanel.add(blank);
		}
		
		add(preferencePanel, BorderLayout.WEST);
	}
}

class ButtonsPanel1 extends JPanel{
	JButton backButton;
	JButton importDataButton;
	JButton nextButton;
	private JLabel nothingSelected;
	private JPanel blank;
	private JPanel blank1;
	private JPanel blank2;
	private JPanel blank3;
	
	public ButtonsPanel1(){
	
		backButton = new JButton("BACK");
		nextButton = new JButton("NEXT");
		
		setLayout(new GridLayout(1,8));
		add(backButton);
		for(int i = 0; i <= 4; i++){
			blank = new JPanel();
			blank.setBackground(Color.WHITE);
			add(blank);
		}
		add(nextButton);
	}
}

public class CEWindow2 extends JFrame{
	private final int WINDOW_WIDTH = 910;
    private final int WINDOW_HEIGHT = 510;
    
    public static ArrayList<String> daysSelected = new ArrayList<String>();
	
	JFrame ceWindow2;
	
	public CEWindow2(){
		ceWindow2 = new JFrame("Student Degree Progress Tracker");
		ceWindow2.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		ceWindow2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ceWindow2.setLayout(new BorderLayout());
		
		LogoPanel logoP = new LogoPanel();
		logoP.setBackground(Color.WHITE);
		ceWindow2.add(logoP,BorderLayout.NORTH);
		
		PreferredTimeDay pTimeDay = new PreferredTimeDay();
		pTimeDay.setBackground(Color.WHITE);
		ceWindow2.add(pTimeDay, BorderLayout.CENTER); 
		
		JPanel blankP = new JPanel();
		blankP.setBackground(Color.WHITE);
		ceWindow2.add(blankP, BorderLayout.EAST);
		
		ButtonsPanel1 buttonP1 = new ButtonsPanel1();
		buttonP1.setBackground(Color.WHITE);
		
		buttonP1.backButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ceWindow2.setVisible(false);
				new CEWindow1();
			}
				
		});
		
		buttonP1.nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
                // System.out.println( daysSelected );
                //System.out.println( getStartTime(pTimeDay) );
                //System.out.println( getEndTime(pTimeDay) );
                //filterClasses();

                ceWindow2.setVisible(false);
			    new CECourseSelectionWindow();
			}
				
		});

		ceWindow2.add(buttonP1, BorderLayout.SOUTH);
		ceWindow2.setVisible(true);
		
    }
    
    public void getDaysSelected(PreferredTimeDay pTimeDay){
    //takes checked boxes and stores corresponding string names into an array list
        for(int i = 0; i < pTimeDay.dayBoxes.length; i++){
            if(pTimeDay.dayBoxes[i].isSelected()){
                daysSelected.add(pTimeDay.dayBoxes[i].getText()); 
            }
        }
    }

    public int getStartTime(PreferredTimeDay pTimeDay){
        return Integer.parseInt( pTimeDay.inputStartTime.getText().replaceAll("\\D", "") );
    }

    public int getEndTime(PreferredTimeDay pTimeDay){
        return Integer.parseInt( pTimeDay.inputEndTime.getText().replaceAll("\\D", "") );
    }

    public void filterClasses(){
        System.out.println("now working");
        System.out.println(CEWindow1.getClassesTakenSize());
        System.out.println(CEWindow1.getAllClassesSize() );
        System.out.println(CEWindow1.classesTaken);
        System.out.println(CEWindow1.allClasses);

        for(int i = 0; i < CEWindow1.getClassesTakenSize(); i++){
            for(int j = 0; j < CEWindow1.getAllClassesSize(); j++){
                if(!CEWindow1.classesTaken.get(i).equals( CEWindow1.allClasses.get(j)) ){
                    System.out.println( CEWindow1.allClasses.get(j) );
                }  
            }
        }
    }

    public static void main(String[] args){
		new CEWindow2();
    }
}
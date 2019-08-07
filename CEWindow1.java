

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import javax.imageio.ImageIO;

import java.awt.Image;
import java.io.*;
import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class LogoPanel extends JPanel{
	private JLabel logo;
	private JLabel ce;
	private JPanel blank;
	
	public LogoPanel(){
		Image image = null;
        try {
            URL url = new URL("http://www.csueastbay.edu/alumni/files/images/CSUEB-Featured-Link.jpg");
            image = ImageIO.read(url);
            
        } catch (IOException e) {
        	e.printStackTrace();
        }
        logo = new JLabel();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(220, 124, Image.SCALE_SMOOTH));
        logo.setIcon(imageIcon);
        ce = new JLabel("B.S. Computer Engineering  ");
        ce.setHorizontalAlignment(JLabel.RIGHT);
		
		setLayout(new GridLayout(1,3));
		
		add(logo);
		
		
		blank = new JPanel();
		blank.setBackground(Color.WHITE);
		add(blank);
		add(ce);
	}
}

class LowerDivPanel extends JPanel{
	JCheckBox[] boxes;
	private JPanel blank;
	private JPanel blank1;
	
	public LowerDivPanel(){
		boxes = new JCheckBox[] {	
			new JCheckBox("CHEM 110"),
			new JCheckBox("CS 101"),
			new JCheckBox("CS 201"),
			new JCheckBox("ENGR 200"),
			new JCheckBox("ENGR 220"),
			new JCheckBox("ENGR 230"),
			new JCheckBox("MATH 130"),
			new JCheckBox("MATH 131"),
			new JCheckBox("MATH 210"),
			new JCheckBox("MATH 230"),
			new JCheckBox("PHYS 135"),
			new JCheckBox("PHYS 136")
		};
		setLayout(new GridLayout(12,3));
		
		for(JCheckBox box : boxes){
			blank = new JPanel();
			blank.setBackground(Color.WHITE);
			
			blank1 = new JPanel();
			blank1.setBackground(Color.WHITE);
			
			add(blank);
			add(box);
			add(blank1);
		}
		
		setBorder(BorderFactory.createTitledBorder("Lower Division"));	
	}
}

class UpperDivPanel extends JPanel{
	JCheckBox[] boxes;
	private JPanel blank;
	private JPanel blank1;
	
	public UpperDivPanel(){
		boxes = new JCheckBox[] { 
								new JCheckBox("CMPE 322"),
								new JCheckBox("CMPE 330"),
								new JCheckBox("CMPE 344"),
								new JCheckBox("CMPE 370"),
								new JCheckBox("CMPE 421"),
								new JCheckBox("CMPE 480"),
								new JCheckBox("CMPE 492"),
								new JCheckBox("CMPE 493"),
								new JCheckBox("CS 301"),
								new JCheckBox("CS 321"),
								new JCheckBox("INDE 330"),
								new JCheckBox("MATH 375")
		};
		setLayout(new GridLayout(12,1));
		for(JCheckBox box : boxes){
			blank = new JPanel();
			blank.setBackground(Color.WHITE);
			
			blank1 = new JPanel();
			blank1.setBackground(Color.WHITE);
			
			add(blank);
			add(box);
			add(blank1);
		}
		
		setBorder(BorderFactory.createTitledBorder("Upper Division"));
		
		
	}
}

class MajorElectPanel extends JPanel{
	JCheckBox[] boxes;
	private JPanel blank;
	private JPanel blank1;
	private JPanel blank2;
	
	public MajorElectPanel(){
		boxes = new JCheckBox[] { 
								new JCheckBox("CMPE 430"),
								new JCheckBox("CMPE 470"),
								new JCheckBox("CS 401"),
								new JCheckBox("CS 421"),
								new JCheckBox("CS 441"),
								new JCheckBox("CS 455"),
								new JCheckBox("ENGR 310") //end
		};

		setLayout(new GridLayout(12,3));
		for(JCheckBox box : boxes){
			blank = new JPanel();
			blank.setBackground(Color.WHITE);
			
			blank1 = new JPanel();
			blank1.setBackground(Color.WHITE);
			
			add(blank);
			add(box);
			add(blank1);
		}
		
		for(int i = 0; i <= 3; i++){
			blank2 = new JPanel();
			blank2.setBackground(Color.WHITE);
			
			add(blank2);
		}
		
		setBorder(BorderFactory.createTitledBorder("Major Electives"));
		
		
	}
}

class ButtonsPanel extends JPanel{
	JButton backButton;
	JButton importDataButton;
	JButton nextButton;
	private JLabel nothingSelected;
	private JPanel blank;
	private JPanel blank1;
	private JPanel blank2;
	private JPanel blank3;
	private LowerDivPanel lowerDivP;
	private UpperDivPanel upperDivP;
	private MajorElectPanel majorElectP;
	
	public ButtonsPanel(LowerDivPanel lDivP, UpperDivPanel uDivP, MajorElectPanel majorElect){
		lowerDivP = lDivP;
		upperDivP = uDivP;
		majorElectP = majorElect;
		
		backButton = new JButton("BACK");
		importDataButton = new JButton("Import Data");
		nextButton = new JButton("NEXT");
		nothingSelected = new JLabel("no file selected");
		
		blank = new JPanel();
		blank.setBackground(Color.WHITE);
		
		blank1 = new JPanel();
		blank1.setBackground(Color.WHITE);
		
		blank2 = new JPanel();
		blank2.setBackground(Color.WHITE);
		
		blank3 = new JPanel();
		blank3.setBackground(Color.WHITE);
		
		setLayout(new GridLayout(1,8));
		add(backButton);
		add(blank);
		add(blank1);
		
		add(importDataButton);
		add(nothingSelected);
		//add(importDataPanel);
		
		add(blank3);
		add(nextButton);

		importDataButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
	            // create an object of JFileChooser class 
	            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
	            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.txt", "txt");
	  
	            // set the selection mode to both files directories
	            j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); 
	            j.setFileFilter(filter);
	            
	 
	            // invoke the showsOpenDialog function to show the open dialog 
	            int r = j.showOpenDialog(null); 
	  
	            if (r == JFileChooser.APPROVE_OPTION) { 
	                // set the label to the path of the selected directory 
	                //nothingSelected.setText(j.getSelectedFile().getAbsolutePath());
	                nothingSelected.setText(j.getSelectedFile().getName()); 
		            
		            // open and read the file
					try {
						Scanner scFile = new Scanner(j.getSelectedFile());
						
						while(scFile.hasNext()){
							String nxtLine = scFile.nextLine();

							if(nxtLine.equals("Fall 2019 Schedule:")){
								break;
							}

							else{
								for(int i = 0; i < lowerDivP.boxes.length; i++){
									if(nxtLine.equals("CHEM 110"))
										lowerDivP.boxes[0].setSelected(true);
									
									else if(nxtLine.equals("CS 101"))
										lowerDivP.boxes[1].setSelected(true);
									
									else if(nxtLine.equals("CS 201"))
										lowerDivP.boxes[2].setSelected(true);
									
									else if(nxtLine.equals("ENGR 200"))
										lowerDivP.boxes[3].setSelected(true);
									
									else if(nxtLine.equals("ENGR 220"))
										lowerDivP.boxes[4].setSelected(true);
									
									else if(nxtLine.equals("CS 230"))
										lowerDivP.boxes[5].setSelected(true);
									
									else if(nxtLine.equals("MATH 130"))
										lowerDivP.boxes[6].setSelected(true);
									
									else if(nxtLine.equals("MATH 131"))
										lowerDivP.boxes[7].setSelected(true);
									
									else if(nxtLine.equals("MATH 210"))
										lowerDivP.boxes[8].setSelected(true);
									
									else if(nxtLine.equals("MATH 230"))
										lowerDivP.boxes[9].setSelected(true);
									
									else if(nxtLine.equals("PHYS 135"))
										lowerDivP.boxes[10].setSelected(true);
									
									else if(nxtLine.equals("PHYS 136"))
										lowerDivP.boxes[11].setSelected(true);
								}//lowerDivP.boxes for loop 
								
								for(int i = 0; i < upperDivP.boxes.length; i++){
									if(nxtLine.equals("CMPE 322"))
										upperDivP.boxes[0].setSelected(true);
									
									else if(nxtLine.equals("CMPE 330"))
										upperDivP.boxes[1].setSelected(true);
									
									else if(nxtLine.equals("CMPE 344"))
										upperDivP.boxes[2].setSelected(true);
									
									else if(nxtLine.equals("CMPE 370"))
										upperDivP.boxes[3].setSelected(true);
									
									else if(nxtLine.equals("CMPE 421"))
										upperDivP.boxes[4].setSelected(true);
									
									else if(nxtLine.equals("CMPE 480"))
										upperDivP.boxes[5].setSelected(true);
									
									else if(nxtLine.equals("CMPE 492"))
										upperDivP.boxes[6].setSelected(true);
									
									else if(nxtLine.equals("CMPE 493"))
										upperDivP.boxes[7].setSelected(true);
									
									else if(nxtLine.equals("CS 301"))
										upperDivP.boxes[8].setSelected(true);
									
									else if(nxtLine.equals("CS 321"))
										upperDivP.boxes[9].setSelected(true);
									
									else if(nxtLine.equals("INDE 330"))
										upperDivP.boxes[10].setSelected(true);
									
									else if(nxtLine.equals("MATH 375"))
										upperDivP.boxes[11].setSelected(true);
								}//upperDivP.boxes for loop 
								
								for(int i = 0; i < majorElectP.boxes.length; i++){
									if(nxtLine.equals("CMPE 430"))
										majorElectP.boxes[0].setSelected(true);
									
									else if(nxtLine.equals("CMPE 470"))
										majorElectP.boxes[1].setSelected(true);
									
									else if(nxtLine.equals("CS 401"))
										majorElectP.boxes[2].setSelected(true);
									
									else if(nxtLine.equals("CS 421"))
										majorElectP.boxes[3].setSelected(true);
									
									else if(nxtLine.equals("CS 441"))
										majorElectP.boxes[4].setSelected(true);
									
									else if(nxtLine.equals("CS 455"))
										majorElectP.boxes[5].setSelected(true);
									
									else if(nxtLine.equals("ENGR 310"))
										majorElectP.boxes[6].setSelected(true);
								}//majorElectP.boxes for loop
							}
						}// while 
						
						scFile.close();
					
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
//					catch (IOException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
 
	            } 
	            // if the user cancelled the operation 
	            else
	                nothingSelected.setText("the user cancelled the operation"); 
	  
			}
		}) ;
	}
}

public class CEWindow1 extends JFrame{
	private final int WINDOW_WIDTH = 910;
	private final int WINDOW_HEIGHT = 510;
	final static int numTxtBox = 31;
	
	JFrame ceWindow1;
	public static ArrayList<String> allClasses = new ArrayList<String>();
	public static ArrayList<String> classesTaken = new ArrayList<String>();
	public static ArrayList<String> classesNotTaken = new ArrayList<String>();

	public CEWindow1(){
		ceWindow1 = new JFrame("Student Degree Progress Tracker");
		ceWindow1.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		//ceWindow1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ceWindow1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		ceWindow1.setLayout(new BorderLayout());
		
		LogoPanel logoP = new LogoPanel();
		logoP.setBackground(Color.WHITE);
		ceWindow1.add(logoP,BorderLayout.NORTH);
		
		LowerDivPanel lDivP = new LowerDivPanel();
		lDivP.setBackground(Color.WHITE);
		ceWindow1.add(lDivP,BorderLayout.WEST);
		
		UpperDivPanel uDivP = new UpperDivPanel();
		uDivP.setBackground(Color.WHITE);
		ceWindow1.add(uDivP,BorderLayout.CENTER);
		
		MajorElectPanel majorElect = new MajorElectPanel();
		majorElect.setBackground(Color.WHITE);
		ceWindow1.add(majorElect, BorderLayout.EAST);
		
		ButtonsPanel buttonP = new ButtonsPanel(lDivP, uDivP, majorElect);
		buttonP.setBackground(Color.WHITE);
		
		buttonP.backButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				ceWindow1.setVisible(false);
				new MainWindow();
			}
				
		});
		
		buttonP.nextButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
					classesCompleted(lDivP, uDivP, majorElect);
					getAllClasses(lDivP, uDivP, majorElect);
					ceWindow1.setVisible(false);
					new CEWindow2();
			}
				
		});
		ceWindow1.add(buttonP, BorderLayout.SOUTH);
		ceWindow1.setVisible(true);
	}

	public static void main(String[] args){
		new CEWindow1();
	}

	public void classesCompleted(LowerDivPanel lDivP, UpperDivPanel uDivP, MajorElectPanel majorElect) {
		//takes checked boxes and stores corresponding string names into an array list	
		for(int i = 0; i < lDivP.boxes.length; i++) {
			if(lDivP.boxes[i].isSelected()) {
				classesTaken.add(lDivP.boxes[i].getText());
			}
			else {
				classesNotTaken.add(lDivP.boxes[i].getText());
			}
		}
		
		for(int i = 0; i < uDivP.boxes.length; i++) {
			if(uDivP.boxes[i].isSelected()) {
				classesTaken.add(uDivP.boxes[i].getText());
			}
			else{
				classesNotTaken.add(uDivP.boxes[i].getText());
			}
		}

		for(int i = 0; i < majorElect.boxes.length; i++) {
			if(majorElect.boxes[i].isSelected()) {
				classesTaken.add(majorElect.boxes[i].getText());		
			}
			else{
				classesNotTaken.add(majorElect.boxes[i].getText());
			}
		}
	}
	
	//returns size of classesTaken List
	public static int getClassesTakenSize() {
		return classesTaken.size();
	}

	public void getAllClasses(LowerDivPanel lDivP, UpperDivPanel uDivP, MajorElectPanel majorElect){
		for(int i = 0; i < lDivP.boxes.length; i++) {
			allClasses.add(lDivP.boxes[i].getText());
		}
		
		for(int i = 0; i < uDivP.boxes.length; i++) {
			allClasses.add(uDivP.boxes[i].getText());
		}

		for(int i = 0; i < majorElect.boxes.length; i++) {
			allClasses.add(majorElect.boxes[i].getText());
		}
	}

	//returns size of getAllClasses List
	public static int getAllClassesSize() {
		return allClasses.size();
	}

	//returns size of getAllClasses List
	public static int classesNotTakenSize() {
		return classesNotTaken.size();
	}

	public static int getPercentage(){
		int percentage = 0;
		int classesSelected = getClassesTakenSize();
		percentage = ((classesSelected*100)/numTxtBox);
		return percentage;
	}
}
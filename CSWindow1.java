
import javax.swing.*; //swing classes
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.*; //listener interface
import java.awt.*; //for color class
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import javax.imageio.ImageIO;


public class CSWindow1 extends JFrame {
	final static int WINDOW_WIDTH = 910;
	final static int WINDOW_HEIGHT = 510;
	JButton	back;
	JButton importData;
	JButton next;
	JFrame csChecklistScreen;
	JPanel empty; 
	public static JCheckBox[] boxes;
	public static JCheckBox[] boxes1;
	public static JCheckBox[] boxes2;
	private JPanel blank;
	private JPanel blank1;
	public int percentage = 0;
	public static ArrayList<String> classesTaken = new ArrayList<String>();
	public static ArrayList<String> classesRemaining = new ArrayList<String>();
	
public CSWindow1 () {
		csChecklistScreen = new JFrame("Student Degree Progress Tracker");
		csChecklistScreen.setLayout(new BorderLayout()); 	 
		csChecklistScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 /*Icon Panel + add to north part of layout */
		 JPanel icon = new JPanel(new GridLayout (1,3));
		 icon.setBackground(Color.WHITE); 
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
	     icon.add(logo, "west");
	     
	     JLabel cs = new JLabel("B.S. Computer Science  ");
	      cs.setHorizontalAlignment(JLabel.RIGHT);
	     
	      blank = new JPanel();
			blank.setBackground(Color.WHITE);
			icon.add(blank);
			icon.add(cs);
			
		 csChecklistScreen.add(icon, BorderLayout.NORTH);
		 
		/* 3 Panels in the middle that hold check boxes*/
		 //west boxes
		 JPanel westCheckBoxes = new JPanel();
		 westCheckBoxes.setLayout(new GridLayout(9,3));
		 boxes = new JCheckBox[] {
		 
		 new JCheckBox("CS 101"),
		 new JCheckBox("CS 201"),
		 new JCheckBox("CS 211"),
		 new JCheckBox("CS 221"),
		 new JCheckBox("CS 230"),
		 new JCheckBox("MATH 130"),
		 new JCheckBox("MATH 131"),
		 new JCheckBox("MATH 225"),
		 new JCheckBox("PHYS 135")
		 };
		 
		for(JCheckBox box : boxes) {
			blank = new JPanel();
			blank.setBackground(Color.WHITE);
			
			blank1 = new JPanel();
			blank1.setBackground(Color.WHITE);
			
			westCheckBoxes.add(blank);
			westCheckBoxes.add(box);
			box.setBackground(Color.WHITE);
			westCheckBoxes.add(blank1);
			
		}

		westCheckBoxes.setBackground(Color.WHITE); 
		westCheckBoxes.setBorder(BorderFactory.createTitledBorder("Lower Division"));	
		csChecklistScreen.add(westCheckBoxes, BorderLayout.WEST);
		 	
		 //center boxes
		 	JPanel centerCheckBoxes = new JPanel();
		 	centerCheckBoxes.setLayout(new GridLayout(9,3));
		 	
		 	 boxes1 = new JCheckBox[] {
			 new JCheckBox("CS 301"),
			 new JCheckBox("CS 311"),
			 new JCheckBox("CS 321"),
			 new JCheckBox("CS 401"),
			 new JCheckBox("CS 411"),
			 new JCheckBox("CS 413"),
			 new JCheckBox("CS 421"),
			 new JCheckBox("CS 441"),
			 new JCheckBox("STAT 316")
		 	 };
		 	for(JCheckBox box1 : boxes1) {
				blank = new JPanel();
				blank.setBackground(Color.WHITE);
				
				blank1 = new JPanel();
				blank1.setBackground(Color.WHITE);
				
				centerCheckBoxes.add(blank);
				centerCheckBoxes.add(box1);
				box1.setBackground(Color.WHITE);
				centerCheckBoxes.add(blank1);
				
			}

			 centerCheckBoxes.setBackground(Color.WHITE);
			 centerCheckBoxes.setBorder(BorderFactory.createTitledBorder("Upper Division"));
			 csChecklistScreen.add(centerCheckBoxes, BorderLayout.CENTER);
			 	
			 //east boxes
				JPanel eastCheckBoxes = new JPanel();
				eastCheckBoxes.setLayout(new GridLayout(6,3));
				 boxes2 = new JCheckBox[] {
				 new JCheckBox("CS 351"),
				 new JCheckBox("CS 431"),
				 new JCheckBox("CS 453"),
				 new JCheckBox("CS 455"),
				 new JCheckBox("CS 461"),
				 new JCheckBox("CS 471")
		 	
				 }; 
				
				 for(JCheckBox box2 : boxes2) {
						blank = new JPanel();
						blank.setBackground(Color.WHITE);
						
						blank1 = new JPanel();
						blank1.setBackground(Color.WHITE);
						
						eastCheckBoxes.add(blank);
						eastCheckBoxes.add(box2);
						box2.setBackground(Color.WHITE);
						eastCheckBoxes.add(blank1);
						
					}
				 eastCheckBoxes.setBackground(Color.WHITE);
				 eastCheckBoxes.setBorder(BorderFactory.createTitledBorder("Major Electives"));	
				 csChecklistScreen.add(eastCheckBoxes, BorderLayout.EAST);
				 
				 /* bottom panel that holds buttons*/
				 JPanel bottomButtons = new JPanel();
				 bottomButtons.setLayout(new GridLayout(1,3));
				 back = new JButton("Back");
				 importData = new JButton("Import Data");
				 next = new JButton("next");
				 
				 bottomButtons.add(back);
				 bottomButtons.add(importData);
				 bottomButtons.add(next);
				 bottomButtons.setBackground(Color.WHITE);
				 
				 back.addActionListener(new csChecklistListener());
				next.addActionListener(new csChecklistListener());
				importData.addActionListener(new importButtonListener());
								 
				csChecklistScreen.add(bottomButtons, BorderLayout.SOUTH);		 
				csChecklistScreen.setBackground(Color.WHITE);
				csChecklistScreen.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);	
				csChecklistScreen.setVisible(true);
	}
		
private class csChecklistListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource() == back) {
		csChecklistScreen.setVisible(false);
		new MainWindow();
		
	}if(e.getSource() == next) {
		classesCompleted();
		csChecklistScreen.setVisible(false);
		new ProgressWindow();
		
		}
	}
}

private class importButtonListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource() == importData) {
		JLabel nothingSelected = new JLabel();
			
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
            
         // This assumes user pressed Open
            // Get the file from the file 
            //File file = j.getSelectedFile();
            
            // open and read the file
			try {
				Scanner scFile = new Scanner(j.getSelectedFile());
				
				while(scFile.hasNext()){
					String nxtLine = scFile.nextLine();
					
					for(int i = 0; i < boxes.length; i++){
						if(nxtLine.equals("CS 101"))
							boxes[0].setSelected(true);
						
						else if(nxtLine.equals("CS 201"))
							boxes[1].setSelected(true);
						
						else if(nxtLine.equals("CS 211"))
							boxes[2].setSelected(true);
						
						else if(nxtLine.equals("CS 221"))
							boxes[3].setSelected(true);
						
						else if(nxtLine.equals("MATH 130"))
							boxes[4].setSelected(true);
						
						else if(nxtLine.equals("MATH 131"))
							boxes[5].setSelected(true);
						
						else if(nxtLine.equals("MATH 225"))
							boxes[6].setSelected(true);
						
						else if(nxtLine.equals("PHYS 135"))
							boxes[7].setSelected(true);
					}//lowerDivP.boxes for loop 
///////////////////////////////////////////////////////////////////////////
					for(int i = 0; i < boxes1.length; i++){
						if(nxtLine.equals("CS 301"))
							boxes1[0].setSelected(true);
						
						else if(nxtLine.equals("CS 311"))
							boxes1[1].setSelected(true);
						
						else if(nxtLine.equals("CS 321"))
							boxes1[2].setSelected(true);
						
						else if(nxtLine.equals("CS 401"))
							boxes1[3].setSelected(true);
						
						else if(nxtLine.equals("CS 413"))
							boxes1[4].setSelected(true);
						
						else if(nxtLine.equals("CS 421"))
							boxes1[5].setSelected(true);
						
						else if(nxtLine.equals("CS 441"))
							boxes1[6].setSelected(true);
						
						else if(nxtLine.equals("STAT 316"))
							boxes1[7].setSelected(true);
					}//upperDivP.boxes for loop 
////////////////////////////////////////////////////////////////////////////////////					
					for(int i = 0; i < boxes2.length; i++){
						if(nxtLine.equals("CS 351"))
							boxes2[0].setSelected(true);
						
						else if(nxtLine.equals("CS 431"))
							boxes2[1].setSelected(true);
						
						else if(nxtLine.equals("CS 453"))
							boxes2[2].setSelected(true);
						
						else if(nxtLine.equals("CS 455"))
							boxes2[3].setSelected(true);
						
						else if(nxtLine.equals("CS 461"))
						boxes2[4].setSelected(true);
						
						else if(nxtLine.equals("CS 471"))
							boxes2[5].setSelected(true);
						
					}
					//majorElectP.boxes for loop 
				}// while 
				
				scFile.close();
			
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			      
        } 
                       
        // if the user cancelled the operation 
        else
            nothingSelected.setText("the user cancelled the operation"); 
		}
	}
}	
	

public static void classesCompleted() {
//takes checked boxes and stores corresponding string names into an array list
	
for(int i = 0; i<boxes.length; i++) {
	if(boxes[i].isSelected()) {
		classesTaken.add(boxes[i].getText());
	}else {
		classesRemaining.add(boxes[i].getText());
	}
}

for(int i = 0; i<boxes1.length; i++) {
	if(boxes1[i].isSelected()) {
		classesTaken.add(boxes1[i].getText());				
	}else {
		classesRemaining.add(boxes1[i].getText());
	}
}
for(int i = 0; i<boxes2.length; i++) {
	if(boxes2[i].isSelected()) {
		classesTaken.add(boxes2[i].getText());		
		}else {
			classesRemaining.add(boxes2[i].getText());
		}
	}
}
//returns size of classesTaken List
public static int getClassesTakenSize() {
	return classesTaken.size();
}

//loop through array list
public ArrayList<String> getClassesRemainingArray() {
	return (classesRemaining);
}

//returns size of classesTaken List
public static int getClassesNotTakenSize() {
	return classesRemaining.size();
}

public static void main(String[] args) {
		new CSWindow1();
	}	
}
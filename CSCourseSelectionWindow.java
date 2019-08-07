
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class CSCourseSelectionWindow {
	private JFrame frame;
	final static int WINDOW_WIDTH = 910;
	final static int WINDOW_HEIGHT = 510;
	private JButton next, back;
	private JLabel label, label2;
	private JPanel buttonPanel, buttonPanel2, panel, panel2;
	private CSFilterPanel filterPanel;
	private CSCoursePanel coursePanel;
	private JScrollPane scrollPane;

	
	public CSCourseSelectionWindow() {
		//default frame setting
		frame = new JFrame();
		frame.setTitle("Student Degree Progress Tracker");
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		//top Logo starts here
		panel = new JPanel(new GridLayout(1,3));
		Image image = null;
	    try {
	        URL url = new URL("http://www.csueastbay.edu/alumni/files/images/CSUEB-Featured-Link.jpg");
	        image = ImageIO.read(url);
	          
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	    
	    label = new JLabel();
	    label2 = new JLabel("Select Courses List");
	    label2.setFont(new Font("Serif", Font.BOLD, 35));
	    ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(220, 124, Image.SCALE_SMOOTH));
	    label.setIcon(imageIcon);
	    panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.add(label);
		panel.add(label2);
		// top Logo ends here 
		filterPanel = new CSFilterPanel();
		coursePanel = new CSCoursePanel();
		
		buildButtonPanel();
		scrollPane = new JScrollPane(coursePanel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
				                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED ); 
		scrollPane.setPreferredSize(new Dimension(500,500));
			
		panel2 = new JPanel(new GridLayout(2,1));
		panel2.add(filterPanel);
		panel2.add(scrollPane);	
		frame.add(panel,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.CENTER);
		frame.add(buttonPanel,BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	
	public void buildButtonPanel() {
		buttonPanel = new JPanel();
		next = new JButton("Next");
		back = new JButton("Back");

		next.addActionListener(new NextButtonListener());
		back.addActionListener(new BackButtonListener());
		
		buttonPanel.add(back);
		buttonPanel.add(next);
	}

	private class NextButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class BackButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new ProgressWindow();
		}
	}
	
	public static void main(String[] arg) {
		new CSCourseSelectionWindow();
	}
}



class CSFilterPanel extends JPanel{
	private JTextField classField;
	private JLabel classLabel, dateLabel, timeLabel;
	private JLabel blank, b2, b3, b4;
	private JCheckBox mo, tu, we, th, fr, t1, t2, t3;
	private JButton filterButton, resetButton;
	
	public CSFilterPanel() {
		setLayout(new GridLayout(3,6));
		classLabel = new JLabel("Course Number");
		classField = new JTextField();
		filterButton = new JButton("Filter");
		resetButton = new JButton("Reset");
		
		filterButton.addActionListener(new FilterButtonListener());
		resetButton.addActionListener(new ResetButtonListener());
		
		dateLabel = new JLabel("Class Date");
		mo = new JCheckBox("Mo");
		tu = new JCheckBox("Tu");
		we = new JCheckBox("We");
		th = new JCheckBox("Th");
		fr = new JCheckBox("Fr");
		timeLabel = new JLabel("Class time");
		t1 = new JCheckBox("Morning");
		t2 = new JCheckBox("Afternoon");
		t3 = new JCheckBox("Night");
		
		blank = new JLabel();
		b2 = new JLabel();
		b3 = new JLabel();
		b4 = new JLabel();

		setBorder(BorderFactory.createTitledBorder("Class Filter"));
		add(classLabel);
		add(classField);
		add(blank);		
		add(filterButton);
		add(resetButton);
		add(b2);
		add(dateLabel);
		add(mo);
		add(tu);
		add(we);
		add(th);
		add(fr);
		add(timeLabel);
		add(t1);
		add(t2);
		add(t3);
		add(b3);
		add(b4);		
	}
	private class FilterButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	private class ResetButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			classField.setText("");
			mo.setSelected(false);
			tu.setSelected(false);
			we.setSelected(false);
			th.setSelected(false);
			fr.setSelected(false);
			t1.setSelected(false);
			t2.setSelected(false);
			t3.setSelected(false);
			
		}
	}
	/*public void setFilter() {
		String[] arrayClass = CoursePanel.getCourseID();
		ArrayList<String> newCourseList = new ArrayList<String>(CoursePanel.getCourseID().length);
		for(int i = 0; i < arrayClass.length; i++) {
			if(classField.getText().equalsIgnoreCase(arrayClass[i])) {
				newCourseList.add(arrayClass[i]);
				CoursePanel.showClassList(newCourseList);
			}
		}
	}
	*/
}

class CSCoursePanel extends JPanel{
	private JLabel numberL, nameL, dateTimeL, instructorL;
	static String[] courseBox;
	String[] name;
	String[] dateTime;
	String[] instructor;
	ArrayList<String> arrayList;
	//private CSWindow1 csWindow1;
	JCheckBox[] checkBox;
	public CSCoursePanel() {

		setLayout(new GridLayout(25,4));
		setBorder(BorderFactory.createTitledBorder("Class List"));
		numberL = new JLabel("Course ID");
		nameL = new JLabel("Course Name");
		dateTimeL = new JLabel("Date&Time");
		instructorL = new JLabel("Instructor");
		numberL.setFont(new Font("Serif", Font.BOLD, 20));
		nameL.setFont(new Font("Serif", Font.BOLD, 20));
		dateTimeL.setFont(new Font("Serif", Font.BOLD, 20));
		instructorL.setFont(new Font("Serif", Font.BOLD, 20));
		
		courseBox = new String[]{	
				("CS 101"),
				("CS 201"),
				("CS 211"),
				("CS 221"),
				("CS 230"),
				("CS 301"),
				("CS 311"),
				("CS 321"),
				("CS 351"),
				("CS 401"),
				("CS 411"),
				("CS 413"),
				("CS 421"),
				("CS 431"),
				("CS 441"),
				("CS 453"),
				("CS 455"),
				("CS 461"),
				("CS 471"),
				("STAT 316"),
				("MATH 130"),
				("MATH 131"),
				("MATH 225"),
				("PHYS 135")
			}; 

		
		name = new String[] {
				("Computer Science I"),
				("Computer Science II"),
				("Discrete Structures "),
				("Computer Organization and Assembly Language"),
				("Computing and Social Responsibility "),
				("Data Structures and Algorithms "),
				("Programming Language Concepts "),
				("Computer Architecture"),
				("Website Development "),
				("Software Engineering"),
				("Automata and Computation "),
				("Analysis of Algorithms "),
				("Operating Systems "),
				("Database Architecture"),
				("Computer Networks "),
				("Mobile Programming"),
				("Computer Graphics "),
				("Artificial Intelligence "),
				("Security and Information Assurance"),
				("Statistics and Probability for Science and Engineering "),
				("Calculus I "),
				("Calculus II "),
				("Numerical Algorithms and Linear Algebra for Computer Science"),
				("Physics for Scientists and Engineers I")
		};
		
		dateTime = new String[] {
				("TuTh 2:45PM - 4:00PM"),
				("MoWe 5:00PM - 6:15PM"),
				("TuTh 4:15PM - 5:30PM"),
				("TuTh 2:45PM - 4:00PM"),
				("Mo 9:30AM - 10:45AM"),
				("MoWe 9:30AM - 10:45AM"),
				("TuTh 9:30AM - 10:45AM"),
				("TuTh 11:00AM - 12:15PM"),
				("Fr 9:00AM - 11:30AM"),
				("Mo 10:00AM - 11:40AM"),
				("TuTh 11:00AM - 12:15PM"),
				("TuTh 2:45PM - 4:00PM"),
				("MoWe 8:00AM - 9:15AM"),
				("Tu 1:15PM - 2:55PM"),
				("Fr 12:00PM - 2:30PM"),
				("Mo 4:00PM - 5:40PM"),
				("TuTh 6:00PM - 7:15PM"),
				("MoWe 4:00PM - 5:40PM"),
				("TuTh 11:00AM - 12:15PM"),
				("MoWe 12:30PM - 1:45PM"),
				("MoWe 12:30PM - 1:45PM"),
				("TuTh 11:00AM - 12:15PM"),
				("Tu 2:00PM - 4:30PM"),
				("MoWe 11:00AM - 12:15PM")
		};
		
		instructor = new String[] {
				("Henry Stalica"),
				("David Yang"),
				("Massoud Malek"),
				("Farzan Roohparvar"),
				("Barbara Hecker"),
				("Ahmed Banafa"),
				("Alex Sumarsono"),
				("James Tandon"),
				("Roger Doering"),
				("Roger Doering"),
				("Roger Doering"),
				("Alex Sumarsono"),
				("James Tandon"),
				("Farnaz Ganjeizadeh"),
				("Saeid Motavalli"),
				("Sharon Buckley"),
				("Bianca Lopez"),
				("Massoud Malek"),
				("Sharon Buckley"),
				("Jesus Oliver"),
				("Dallas Burton"),
				("Farnaz Ganjeizadeh"),
				("Massoud Malek"),
				("James Tandon")
		};

		
		add(numberL);
		add(nameL);
		add(dateTimeL);
		add(instructorL);
		
		
		//list all unSelectedClasses	
		//csWindow1 = new CSWindow1();
		int size = CSWindow1.getClassesNotTakenSize();
		//CSWindow1.closeWindow();
		checkBox = new JCheckBox[size]; 
		for(int i = 0; i < size; i++) {
			checkBox[i] = new JCheckBox( CSWindow1.classesRemaining.get(i) );
			add( checkBox[i] );
			add(new JLabel( name[i] ) );
			add(new JLabel( dateTime[i] ) );
			add(new JLabel( instructor[i] ) );
		}
	} 
}
	/*
	public static String[] getCourseID() {
		return courseBox;
	}
	/*
	public String[] selectedCourse() {
		for(JCheckBox box: checkBox) {
			if(box.isSelected()) {
				
			}
		}
	}
	/*public void resetList() {
		for(int i =0; i < courseBox.length; i++) {
			checkBox.setSelected(false);
		}
	}*/


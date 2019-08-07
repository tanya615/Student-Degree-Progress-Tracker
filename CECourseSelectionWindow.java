import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class CECourseSelectionWindow {
	private JFrame frame;
	final static int WINDOW_WIDTH = 1000;
	final static int WINDOW_HEIGHT = 750;
	private JButton back, Export;
	private JLabel label, label2;
	private JPanel buttonPanel, buttonPanel2, panel, panel2;
	private FilterPanel filterPanel;
	private CoursePanel coursePanel;
	private JScrollPane scrollPane;

	
	public CECourseSelectionWindow() {
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
		filterPanel = new FilterPanel();
		coursePanel = new CoursePanel();
		
		buildButtonPanel(coursePanel);
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
	
	public void buildButtonPanel(CoursePanel coursePanel) {
		buttonPanel = new JPanel();
		Export = new JButton("Export");
		back = new JButton("Back");
		

		Export.addActionListener(new ExportButtonListener());
		// back.addActionListener(new BackButtonListener());
		
		buttonPanel.add(back);
		
		buttonPanel.add(Export);
	}

	private class ExportButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				boolean a = false;
				//conlicter class object
				ConflicterCE b = new ConflicterCE();
				//to access tree
				CEmajor a1 = new CEmajor();
				String c;
			
				
				// for each box selected run through conflict check
				if (coursePanel.checkBox[0].isSelected())
				{
					
					c = "CHEM 110";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[1].isSelected())
				{
					
					c = "CS 101";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
					
							e1.printStackTrace();
						}
					}
					
				}
				if (coursePanel.checkBox[2].isSelected())
				{
					
					c = "CS 301";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
				}
				if (coursePanel.checkBox[3].isSelected())
				{
					
					c = "CS 321";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					
				}
				if (coursePanel.checkBox[4].isSelected())
				{
					
					c = "CS 401";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
				}
				if (coursePanel.checkBox[5].isSelected())
				{
					
					c = "CS 421";
					a = b.insertCorCE(a1, c);
					if (a)
						System.out.println(c + " added to schedule");
				}
				if (coursePanel.checkBox[6].isSelected())
				{
					
					c = "MATH 441";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					
				}
				if (coursePanel.checkBox[7].isSelected())
				{
					
					c = "CS 455";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
				
						
				}
				if (coursePanel.checkBox[8].isSelected())
				{
					
					c = "CMPE 322";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
				
				}
				if (coursePanel.checkBox[9].isSelected())
				{
					c = "CMPE 330";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
			
				}
				if (coursePanel.checkBox[10].isSelected())
				{
					c = "CMPE 344";
					
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
			
				}
				if (coursePanel.checkBox[11].isSelected())
				{
					c = "CMPE 370";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
						
							e1.printStackTrace();
						}
					}

				}
				if (coursePanel.checkBox[12].isSelected())
				{
					c = "CMPE 430";
					
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
					
							e1.printStackTrace();
						}
					}

				}
				if (coursePanel.checkBox[13].isSelected())
				{
					c = "CMPE 470";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
						
							e1.printStackTrace();
						}
					}
			
				}
				if (coursePanel.checkBox[14].isSelected())
				{
					c = "CS 480";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
						
							e1.printStackTrace();
						}
					}

				}
				if (coursePanel.checkBox[15].isSelected())
				{
					c = "CMPE 492";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
						
							e1.printStackTrace();
						}
					}

				}
				if (coursePanel.checkBox[16].isSelected())
				{
					c = "CMPE 493";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
				
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[17].isSelected())
				{
					c = "ENGR 200";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
				
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[18].isSelected())
				{
					c = "ENGR 220";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[19].isSelected())
				{
					c = "ENGR 230";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[20].isSelected())
				{
					c = "ENGR 310";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
						
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[21].isSelected())
				{
					c = "MATH 130";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
						
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[22].isSelected())
				{
					c = "MATH 131";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
						
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (coursePanel.checkBox[23].isSelected())
				{
					c = "MATH 210";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (a)
				{
					System.out.println( "Course(s) added Succuessfully");
				}
				if (coursePanel.checkBox[24].isSelected())
				{
					c = "MATH 230";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (a)
				{
					System.out.println( "Course(s) added Succuessfully");
				}
				if (coursePanel.checkBox[25].isSelected())
				{
					c = "MATH 375";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (a)
				{
					System.out.println( "Course(s) added Succuessfully");
				}
				if (coursePanel.checkBox[26].isSelected())
				{
					c = "PHYS 135";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (a)
				{
					System.out.println( "Course(s) added Succuessfully");
				}
				if (coursePanel.checkBox[27].isSelected())
				{
					c = "PHYS 136";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (a)
				{
					System.out.println( "Course(s) added Succuessfully");
				}
				if (coursePanel.checkBox[28].isSelected())
				{
					c = "INDE 330";
					a = b.insertCorCE(a1, c);
					if (a)
					{
						System.out.println(c + " added to schedule");
						try {
							b.scheduleOut(c);
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
					}
					else 
						System.out.println(c + "failed to add");
				}
				if (a)
				{
					System.out.println( "Course(s) added Succuessfully");
				}
			}
		}
	

/*
	private class BackButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			frame.setVisible(false);
			new CEWindow2();
		}
	}
	*/
	public static void main(String[] args) {
		new CECourseSelectionWindow();
	}
}



class FilterPanel extends JPanel{
	private JTextField classField;
	private JLabel classLabel, dateLabel, timeLabel;
	private JLabel blank, b2, b3, b4;
	private JCheckBox mo, tu, we, th, fr, t1, t2, t3;
	private JButton filterButton, resetButton;
	
	public FilterPanel() {
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
			reset();
		}
	}
	public void reset() {
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

class CoursePanel extends JPanel{
	private JLabel numberL, nameL, dateTimeL, instructorL;
	String[] courseBox, name, dateTime, instructor;
	ArrayList<String> arrayList;
	JCheckBox[] checkBox;
	public CoursePanel() {

		setLayout(new GridLayout(32,4));
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
				("CHEM 110"),
				("CS 101"),
				("CS 201"),
				("CS 301"),
				("CS 321"),
				("CS 401"),
				("CS 421"),
				("CS 441"),
				("CS 455"),
				("CMPE 322"),
				("CMPE 330"),
				("CMPE 344"),
				("CMPE 370"),
				("CMPE 421"),
				("CMPE 430"),
				("CMPE 470"),
				("CMPE 480"),
				("CMPE 492"),
				("CMPE 493"),
				("ENGR 200"),
				("ENGR 220"),
				("ENGR 230"),
				("ENGR 310"),
				("MATH 130"),
				("MATH 131"),
				("MATH 210"),
				("MATH 230"),
				("MATH 375"),
				("PHYS 135"),
				("PHYS 136"),
				("INDE 330")
			};
		
		name = new String[] {
				("General Chemistry for Engineering"),
				("Computer Science I"),
				("Computer Science II"),
				("Data Structures and Algorithms"),
				("Computer Architecture "),
				("Software Engineering"),
				("Operating Systems "),
				("Computer Networks"),
				("Computer Graphics"),
				("Digital Design Laboratory"),
				("Electric Circuits II"),
				("N/A"),
				("N/A"),
				("Computer Architecture II"),
				("Analog Design"),
				("N/A"),
				("N/A"),
				("Senior Design I "),
				("N/A"),
				("Introduction to Engineering and Design "),
				("Statics "),
				("N/A"),
				("N/A"),
				("Calculus I "),
				("Calculus II "),
				("Linear Algebra with Differential Equations"),
				("Calculus III "),
				("Differential Equations I "),
				("Physics for Scientists and Engineers I"),
				("N/A"),
				("Engineering Statistics and Probability ")
		};
		
		dateTime = new String[] {
				("MoFr 8:00AM - 8:50AM"),
				("TuTh 2:45PM - 4:00PM"),
				("MoWe 5:00PM - 6:15PM"),
				("TuTh 4:15PM - 5:30PM"),
				("TuTh 1:15PM - 2:30PM"),
				("MoWe 8:00AM - 9:15AM"),
				("MoWe 9:30AM - 10:45AM"),
				("TuTh 9:30AM - 10:45AM"),
				("TuTh 11:00AM - 12:15PM"),
				("Fr 9:00AM - 11:30AM"),
				("Mo 10:00AM - 11:40AM"),
				("N/A"),
				("N/A"),
				("MoWe 8:00AM - 9:15AM"),
				("Tu 1:15PM - 2:55PM"),
				("N/A"),
				("N/A"),
				("Fr 12:00PM - 2:30PM"),
				("N/A"),
				("Mo 4:00PM - 5:40PM"),
				("TuTh 6:00PM - 7:15PM"),
				("N/A"),
				("N/A"),
				("MoWe 4:00PM - 5:40PM"),
				("TuTh 11:00AM - 12:15PM"),
				("MoWe 12:30PM - 1:45PM"),
				("MoWe 12:30PM - 1:45PM"),
				("TuTh 11:00AM - 12:15PM"),
				("Tu 2:00PM - 4:30PM"),
				("N/A"),
				("MoWe 11:00AM - 12:15PM")
		};
		
		instructor = new String[] {
				("Patrick Fleming"),
				("Henry Stalica"),
				("David Yang"),
				("Jiaofei Zhong"),
				("Xiaojun Ruan"),
				("Barbara Hecker"),
				("Ahmed Banafa"),
				("Alex Sumarsono"),
				("James Tandon"),
				("Roger Doering"),
				("Roger Doering"),
				("N/A"),
				("N/A"),
				("Roger Doering"),
				("Alex Sumarsono"),
				("N/A"),
				("N/A"),
				("James Tandon"),
				("N/A"),
				("Farnaz Ganjeizadeh"),
				("Saeid Motavalli"),
				("N/A"),
				("N/A"),
				("Sharon Buckley"),
				("Bianca Lopez"),
				("Massoud Malek"),
				("Sharon Buckley"),
				("Jesus Oliver"),
				("Dallas Burton"),
				("N/A"),
				("Farnaz Ganjeizadeh")
		};

		
		add(numberL);
		add(nameL);
		add(dateTimeL);
		add(instructorL);
		
		int size = CEWindow1.classesNotTakenSize();
		checkBox = new JCheckBox[size]; 
		for(int i = 0; i < size; i++) {
			checkBox[i] = new JCheckBox( CEWindow1.classesNotTaken.get(i) );
			add( checkBox[i] );
			add(new JLabel( name[i] ) );
			add(new JLabel( dateTime[i] ) );
			add(new JLabel( instructor[i] ) );
		}
	}
}
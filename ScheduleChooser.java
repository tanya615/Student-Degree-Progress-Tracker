import javax.swing.*; //swing classes
import java.awt.event.*; //listener interface
import java.awt.*; //for color class
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class ScheduleChooser extends JFrame {
final static int WINDOW_WIDTH = 910;
final static int WINDOW_HEIGHT = 510;
JFrame scheduleChooser;
JButton back;
JButton next;
private JCheckBox[] classes;
public static ArrayList<String> classesAvailable = new ArrayList<String>();

public ScheduleChooser() {
scheduleChooser = new JFrame("Student Degree Progress Tracker");
scheduleChooser.setLayout(new BorderLayout()); 
scheduleChooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
scheduleChooser.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);


//top logo that is placed on north part of window 
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

 JPanel blank = new JPanel();
	blank.setBackground(Color.WHITE);
	icon.add(blank);
	icon.add(cs);
scheduleChooser.add(icon, BorderLayout.NORTH);

//panel for displaying course options 

JPanel classList = new JPanel(new GridLayout (1,3));





	
}





}

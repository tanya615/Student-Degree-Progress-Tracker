import javax.swing.*; //swing classes
import java.awt.event.*; //listener interface
import java.awt.*; //for color class
import java.io.*;
import java.net.URL;
import javax.imageio.ImageIO;

public class MainWindow extends JFrame{
	final static int WINDOW_WIDTH = 910;
	final static int WINDOW_HEIGHT = 510;
	JButton compSciButton;
	JButton compEngButton;
	JFrame homeScreen;
	
	public MainWindow() {
		homeScreen = new JFrame("Student Degree Progress Tracker");
		homeScreen.setLayout(new GridLayout(3,1)); 
		homeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//top graphic
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
		 top.add(logo);
		 homeScreen.add(top);
		 
		 //center
		 JPanel center = new JPanel();
		 center.setBackground(Color.WHITE);
		 JLabel messageLabel = new JLabel("Please select degree path: ");
		 messageLabel.setFont(new Font("Serif", Font.BOLD, 33));
		 center.add(messageLabel);
		 homeScreen.add(center);	 
		 
		 //bottom
		 JPanel bottom = new JPanel();
		 bottom.setBackground(Color.WHITE);
		compSciButton = new JButton("Computer Science");
		compEngButton = new JButton("Computer Engineering");
		bottom.add(compSciButton,BorderLayout.WEST);
		bottom.add(compEngButton,BorderLayout.EAST);
		homeScreen.add(bottom);
		compSciButton.addActionListener(new choiceListener());
		compEngButton.addActionListener(new choiceListener());
		 
		 homeScreen.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);		
		 homeScreen.setVisible(true);  
	}
	
	private class choiceListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == compSciButton) {
				homeScreen.setVisible(false);
				//CSWindow1 cs = new CSWindow1();
				//cs.setVisible(true);
				//createCSchecklist();
				new CSWindow1();
				
			}if(e.getSource() == compEngButton) {
//				createCEchecklist();
				homeScreen.setVisible(false);		
				//CEWindow1 ce = new CEWindow1();
				//ce.setVisible(true);
				new CEWindow1();	
			}
		}
	}

	public static void main(String[] args) {
		new MainWindow();
	}
}



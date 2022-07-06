package in.codersclub.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo extends JFrame implements ActionListener {
//ActionListener is an interface which has one method action performer
	private JLabel labelCountry;
	private JButton buttonIndia, buttonFrance, buttonUSA, buttonBangladesh;
	private ImageIcon imageIndia, imageFrance, imageUSA, imageBangladesh;
	
	public JButtonDemo() {
		
		setLayout( new FlowLayout());
		//constructor to set FlowLayout
		
		imageIndia= new ImageIcon("C:\\Users\\nikit\\OneDrive\\Desktop\\coders\\images\\India.png");
		buttonIndia= new JButton(imageIndia);
		buttonIndia.setActionCommand("INDIA");
		buttonIndia.addActionListener(this);
		
//setActionCommand is used to display the label we will retrieve through the action performer method
//this indicates that the implementation of ActionListener method is available in the same class

		
		imageUSA= new ImageIcon("C:\\Users\\nikit\\OneDrive\\Desktop\\coders\\images\\USA.png");
		buttonUSA= new JButton(imageUSA);
		buttonUSA.setActionCommand("United states of america");
		buttonUSA.addActionListener(this);
		
		
		imageFrance= new ImageIcon("C:\\Users\\nikit\\OneDrive\\Desktop\\coders\\images\\France.png");
		buttonFrance= new JButton(imageFrance);
		buttonFrance.setActionCommand("France");
		buttonFrance.addActionListener(this);
		
		
		imageBangladesh= new ImageIcon("C:\\Users\\nikit\\OneDrive\\Desktop\\coders\\images\\Bangladesh.png");
		buttonBangladesh= new JButton(imageBangladesh);
		buttonBangladesh.setActionCommand("Bangladesh");
		buttonBangladesh.addActionListener(this);
		
		labelCountry = new JLabel("Choose a Flag");//creating the label
		add(labelCountry);
		
		//adding buttons
		add(buttonIndia);
		add(buttonFrance);
		add(buttonUSA);
		add(buttonBangladesh);
		
		setTitle("JButtonDemo");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		labelCountry.setText("You selected " +ae.getActionCommand());
	}
	
	public static void main(String[] args) {
		new JButtonDemo();
	}

}

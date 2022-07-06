package in.codersclub.swing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class JRadioButtonDemo  extends JFrame implements ActionListener {
	private JLabel label;
	private ButtonGroup buttonGroup;
	private JRadioButton button1;
	private JRadioButton button2;
	private JRadioButton button3;
	
	 public JRadioButtonDemo(){
		 setLayout( new FlowLayout());
		 
		 //creating components 
		 button1= new JRadioButton("A");
		 button2= new JRadioButton("B");
		 button3= new JRadioButton("C");
		 label = new JLabel("select one ");
		 buttonGroup= new ButtonGroup();
		 
		 //adding action listener to the buttons
		 button1.addActionListener(this);
		 button2.addActionListener(this);
		 button3.addActionListener(this);
		 
		 // defining the button group
		 buttonGroup.add(button1);
		 buttonGroup.add(button2);
		 buttonGroup.add(button3);
		 
		 add(button1);
		 add(button2);
		 add(button3);
		 add(label);
		 
		 setTitle("JRadioButton");
		 setSize(600,500);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 
	 }
	public void actionPerformed(ActionEvent ae) {
		label.setText("you selected " +ae.getActionCommand());
	}
	public static void main(String[] args) {
	 new JRadioButtonDemo();

	}

}

package in.codersclub.swing;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class JToggleButtonDemo extends JFrame {
	private JLabel label;
	private JToggleButton toggleButton;
	
	public JToggleButtonDemo() {
		setLayout( new FlowLayout());
		
		//CREATING LABEL
		label = new JLabel("Button if OFF.");
		toggleButton = new JToggleButton("ON/OFF");
		
		//add an item listener for toggle button
		//Anonymous inner class ,class which doesn't have any name.
		toggleButton.addItemListener(new ItemListener(){
			//itemListener is an interface which has only one method itemStateChange and takes itemEvent as one of the parameter.
			public void itemStateChanged(ItemEvent event) {
				if(toggleButton.isSelected())
					label.setText("Button is ON"); 
				else
					label.setText("Button is OFF");
			}
		});
		add(toggleButton);
		add(label);
		
		setTitle("JToggleButtonDemo");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	public static void main(String[] args) {
		new JToggleButtonDemo();
	}

}

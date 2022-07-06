package in.codersclub.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldDemo extends JFrame{
	//defining components 
		private JLabel labelName;
		private JTextField textName;
		
		public JTextFieldDemo() {
			setLayout(new FlowLayout());
			
			labelName= new JLabel("Name");
			textName=  new JTextField(15);
			add(labelName);
			add(textName);

			setTitle("JTextFieldDemo");
			setSize(600,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			
		}
		public static void main(String[] args) {
			new JTextFieldDemo();

		}
}

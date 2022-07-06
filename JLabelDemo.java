package in.codersclub.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JLabelDemo extends JFrame {

		private JLabel label;
		private JLabel labelName;
		private JTextField textName;
		
		public JLabelDemo() {
			label = new JLabel("SignUp",JLabel.CENTER);
			add(label);
			setTitle("JLabelDemo");
			setSize(600,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}
		public static void main(String[] args) {
			new JLabelDemo();
		}
	}



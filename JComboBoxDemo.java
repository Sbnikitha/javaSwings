package in.codersclub.swing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import in.codersclub.swing.TouchMe2.MyAction;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JComboBoxDemo extends JFrame{
	private JLabel label;
	private JComboBox comboBox;
	private String flags[]= {"India","France","USA","Bangladesh"};
	
	public JComboBoxDemo(){
		 setLayout( new FlowLayout());
		 
		 label = new JLabel(new ImageIcon("C:\\Users\\nikit\\OneDrive\\Desktop\\coders\\images\\"+"India.png"));
		 comboBox= new JComboBox(flags);
		 
		 comboBox.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae) {
				 String s=(String)comboBox.getSelectedItem();
				label.setIcon(new ImageIcon("C:\\Users\\nikit\\OneDrive\\Desktop\\coders\\images\\"+s+".png"));
			 } 
		 });
		 add(comboBox);
		 add(label);
		setTitle("JcomboBox");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
	
	public static void main(String[] args) {
		new JComboBoxDemo();

	}

}

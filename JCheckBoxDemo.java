package in.codersclub.swing;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JCheckBoxDemo extends JFrame implements ItemListener {
	private JLabel label;
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;
	private JCheckBox box4;
	
	 public JCheckBoxDemo(){
		 
		 setLayout( new FlowLayout());
		 //creating the components
		 box1= new JCheckBox ("php");
		 box2= new JCheckBox ("python");
		 box3= new JCheckBox ("java");
		 box4= new JCheckBox ("c++");
		 
		 label= new JLabel ("Select the languages");
		 // adding boxes to item listener
		 box1.addItemListener(this);
		 box2.addItemListener(this);
		 box3.addItemListener(this);
		 box4.addItemListener(this);
		 
		 add(box1);
		 add(box2);
		 add(box3);
		 add(box4);
		 add(label);
		 
		 setTitle("JCheckBox");
		 setSize(600,500);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
	 }
	 public void itemStateChanged(ItemEvent ie) {
		 JCheckBox checkBox=(JCheckBox)ie.getItem();
		 if(checkBox.isSelected())	
			 label.setText(checkBox.getText()+" is selected");
		 else
			 label.setText(checkBox.getText()+" is cleared");
	 }
	public static void main(String[] args) {
		new JCheckBoxDemo();

	}

}

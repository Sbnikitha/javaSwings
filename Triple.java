package in.codersclub.swing;
//using lambda expression
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Triple extends JFrame {
	private JLabel labelValue;
	private JButton buttonClick;
	private int n;
	 public Triple() {
	     setLayout( new FlowLayout());
			 
		 labelValue = new JLabel("1");
		 buttonClick= new JButton("click");
		 buttonClick.addActionListener((ae)->{
			 String s=labelValue.getText();
				n=Integer.parseInt(s);
				n=n*3;
				labelValue.setText(""+n);
		 });
		 add(buttonClick);
		 add(labelValue);
		 setTitle("Double");
		 setSize(600,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
	
	
	 }
	public static void main(String[] args) {
		new Triple();

	}

}

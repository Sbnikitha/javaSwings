package in.codersclub.swing;
//using anonymous inner class
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Double extends JFrame {
	private JLabel labelValue;
	private JButton buttonClick;
	private int n;
	
	 public Double() {
	     setLayout( new FlowLayout());
			 
		 labelValue = new JLabel("1");
		 buttonClick= new JButton("click");
		 buttonClick.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent ae) {
					String s=labelValue.getText();
					n=Integer.parseInt(s);
					n=n*2;
					labelValue.setText(""+n);
				}
		 });
		 add(buttonClick);
		 add(labelValue);
		 setTitle("Double");
		 setSize(600,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 
	 }

		 
	public static void main(String[] args) {
		new Double();

	}

}

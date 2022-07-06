package in.codersclub.swing;
//using inner class
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class decrement extends JFrame {
	private JLabel labelCount;
	private JButton buttonClick;
	private int n;
	
	//constructor 
	 public decrement() {
	     setLayout( new FlowLayout());
			 
		 labelCount = new JLabel("20");
		 buttonClick = new JButton("click");
		 
		 buttonClick.addActionListener(new MyAction());
		 
		 add(buttonClick);
		 add(labelCount);
		 setTitle("Decrement");
		 setSize(600,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
	 }
	private class MyAction implements ActionListener{	 
		public void actionPerformed(ActionEvent ae) {
			String s=labelCount.getText();
			n=Integer.parseInt(s);
			n--;
			labelCount.setText(""+n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new decrement();
	}

}

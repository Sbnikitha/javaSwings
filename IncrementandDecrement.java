package in.codersclub.swing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JButton;
public class IncrementandDecrement extends JFrame{
	private JLabel labelCount;
	private JButton increment;
	private JButton decrement;
	private int n;
	
	public IncrementandDecrement() {
		setLayout( new FlowLayout());
		 
		 increment = new JButton("Increment");
		 labelCount = new JLabel("20");
		 decrement = new JButton("Decrement");
		 
		 increment.addActionListener(new MyAction1());
		 decrement.addActionListener(new MyAction2());
		 add(increment);
		 add(decrement);
		 add(labelCount);
		 setTitle("Increment and Decrement");
		 setSize(600,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
	}
	private class MyAction1 implements ActionListener{	 
		public void actionPerformed(ActionEvent ae) {
			String s=labelCount.getText();
			n=Integer.parseInt(s);
			n++;
			labelCount.setText(""+n);
		}
	}
	private class MyAction2 implements ActionListener{	 
		public void actionPerformed(ActionEvent ae) {
			String s=labelCount.getText();
			n=Integer.parseInt(s);
			n--;
			labelCount.setText(""+n);
		}
	}
	public static void main(String[] args) {
		new IncrementandDecrement();

	}

}

package in.codersclub.swing;
//using action listener 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Increment extends JFrame implements ActionListener {
	private JLabel labelCount;
	private JButton buttonClick;
	private int n;
	
	//constructor 
	 public Increment() {
		 setLayout( new FlowLayout());
		 
		 labelCount = new JLabel("0");
		 buttonClick = new JButton("click");
		 
		 buttonClick.addActionListener(this);
		 
		 add(buttonClick);
		 add(labelCount);

		setTitle("Increment");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
	public void actionPerformed(ActionEvent ae) {
		String s=labelCount.getText();
		n=Integer.parseInt(s);
		n++;
		labelCount.setText(""+n);
	}
	public static void main(String[] args) {
		new Increment();
	}

}

package in.codersclub.swing;
//using adapter class and  anonymous inner class
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import in.codersclub.swing.TouchMe4.MyAction;

public class TouchMe5 extends JFrame {
	private JLabel labelCount;
	private JButton buttonTouch;
	private int counter;
	
	 public TouchMe5(){
		 setLayout( new FlowLayout());
		 counter=0;
		 labelCount = new JLabel(" "+counter);
		 buttonTouch = new JButton("Touch Me");
		 buttonTouch.addMouseListener(new MouseAdapter(){
			 @Override
				public void mouseEntered(MouseEvent me){
					counter++;
					labelCount.setText(" "+counter);
				}
		 });
		 
		 add(buttonTouch);
		 add(labelCount);

		setTitle("TouchMe5");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}


	public static void main(String[] args) {
		new TouchMe5();

	}

}

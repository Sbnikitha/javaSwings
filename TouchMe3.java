package in.codersclub.swing;
//using anonymous inner class
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import in.codersclub.swing.TouchMe2.MyAction;

public class TouchMe3 extends JFrame {
	private JLabel labelCount;
	private JButton buttonTouch;
	private int counter;
	 public TouchMe3(){
		 setLayout( new FlowLayout());
		 counter=0;
		 labelCount = new JLabel(" "+counter);
		 buttonTouch = new JButton("Touch Me");
		 buttonTouch.addMouseListener(new MouseListener() {
			 @Override
				public void mouseClicked(MouseEvent me){
					
				}
				@Override
				public void mouseEntered(MouseEvent me){
					counter++;
					labelCount.setText(" "+counter);
				}
				@Override
				public void mouseExited(MouseEvent me){
					
				}
				@Override
				public void mousePressed(MouseEvent me){
					
				}
				@Override
				public void mouseReleased(MouseEvent me){
					
				}
		 }
				 );
		 
		 add(buttonTouch);
		 add(labelCount);

		setTitle("TouchMe3");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	 }
	public static void main(String[] args) {
		new TouchMe3();

	}

}

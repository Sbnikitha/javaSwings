package in.codersclub.swing;
//using action listener interface
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TouchMe1  extends JFrame implements MouseListener {
	private JLabel labelCount;
	private JButton buttonTouch;
	private int counter;
	 public TouchMe1(){
		 setLayout( new FlowLayout());
		 counter=0;
		 labelCount = new JLabel(" "+counter);
		 buttonTouch = new JButton("Touch Me");
		 
		 buttonTouch.addMouseListener(this);
		 
		 add(buttonTouch);
		 add(labelCount);

		setTitle("TouchMe1");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
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
	 	 
	public static void main(String[] args) {
		new TouchMe1();

	}

}

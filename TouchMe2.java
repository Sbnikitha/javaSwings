package in.codersclub.swing;
//using inner class
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TouchMe2 extends JFrame{
	private JLabel labelCount;
	private JButton buttonTouch;
	private int counter;
	 public TouchMe2(){
		 setLayout( new FlowLayout());
		 counter=0;
		 labelCount = new JLabel(" "+counter);
		 buttonTouch = new JButton("Touch Me");
		 buttonTouch.addMouseListener(new MyAction());
		 
		 add(buttonTouch);
		 add(labelCount);

		setTitle("TouchMe2");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
		 
class MyAction implements MouseListener{
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
	public static void main(String[] args) {
		new TouchMe2();

	}

}

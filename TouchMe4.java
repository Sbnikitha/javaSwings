package in.codersclub.swing;
//using adapter class and  inner class
/*there are three listeners in this class
 * MouseListener(5 methods)
 * MouseMotionListener(2 methods)
 * MouseWheelListener( 1 method)
 * 
 * MouseAdapter(8 methods )
 * no need to write all the empty implementations for all other methods 
 * 
 */
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import in.codersclub.swing.TouchMe2.MyAction;

public class TouchMe4 extends JFrame {
	private JLabel labelCount;
	private JButton buttonTouch;
	private int counter;
	 public TouchMe4(){
		 setLayout( new FlowLayout());
		 counter=0;
		 labelCount = new JLabel(" "+counter);
		 buttonTouch = new JButton("Touch Me");
		 buttonTouch.addMouseListener(new MyAction());
		 
		 add(buttonTouch);
		 add(labelCount);

		setTitle("TouchMe4");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
class MyAction extends MouseAdapter{
		 @Override
			public void mouseEntered(MouseEvent me){
				counter++;
				labelCount.setText(" "+counter);
			}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TouchMe4();
	}

}

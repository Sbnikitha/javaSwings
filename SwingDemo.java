package in.codersclub.swing;
import javax.swing.JFrame;

public class SwingDemo extends JFrame {
	public SwingDemo() {
		setTitle("SwingDemo");
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SwingDemo();
	}

}

package in.codersclub.swing;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class JScrollPaneDemo extends JFrame{
	private JScrollPane scrollPane;
	private JPanel panel;
	
	public JScrollPaneDemo() {
		panel= new JPanel();
		panel.setLayout(new GridLayout(20,20));
		int b=0;
		for(int i=0; i<20;i++) {
			for(int j=0; j<20;j++) {
				panel.add(new JButton("Button "+ b));
				++b;
			}
		}
		scrollPane=new JScrollPane(panel);
		add (scrollPane, BorderLayout.CENTER);
		setTitle("JScrollPane");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JScrollPaneDemo();

	}

}

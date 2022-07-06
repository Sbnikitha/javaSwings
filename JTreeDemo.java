package in.codersclub.swing;
import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeDemo extends JFrame {
	private JTree tree;
	private JLabel label;
	private DefaultMutableTreeNode top,a,b,a1,a2,b1,b2,b3;
	private JScrollPane scrollPane;

	public JTreeDemo()  {
		top = new DefaultMutableTreeNode("options");
		a = new DefaultMutableTreeNode("A");
	    b = new DefaultMutableTreeNode("B");
		a1 = new DefaultMutableTreeNode("A1");
		a2 = new DefaultMutableTreeNode("A2");
		b1 = new DefaultMutableTreeNode("B1");
		b2 = new DefaultMutableTreeNode("B2");
		b3 = new DefaultMutableTreeNode("B3");
		//add a and b to top
		top.add(a);
		top.add(b);
		a.add(a1);
		a.add(a2);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		tree = new JTree(top);
		scrollPane= new JScrollPane(tree);
		label= new JLabel();
		
		//handle tree section  events
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent tse) {
				label.setText("Selection is "+tse.getPath());
			}
		});
		add(scrollPane);
		add(label, BorderLayout.SOUTH);
		setTitle("JTreeDemo");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
				
	}	
	
	public static void main(String[] args) {
		new JTreeDemo();

	}

}

package in.codersclub.swing;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame {
	private JLabel label;
	private JList list;
	private JScrollPane scrollPane;
	String cities[]= {"Bangalore","NewYork","London","California","Chicago","Paris","New Delhi"};
	
	public JListDemo(){
		setLayout( new FlowLayout());
		
		list= new JList(cities);
		scrollPane= new JScrollPane(list);
		label= new JLabel("choose a city");
		// set the list for single selection 
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// set the dimension for the scrollPane
		scrollPane.setPreferredSize(new Dimension(150,100));
		//adding listener for the list
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent le) {
				int index= list.getSelectedIndex();
				label.setText("Current selection is "+ cities[index]);
			}
		});
		add(scrollPane);
		add(label);
		setTitle("JListDemo");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JListDemo();

	}

}

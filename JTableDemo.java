package in.codersclub.swing;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
public class JTableDemo extends JFrame {
	private JTable table;
	private JScrollPane scrollPane;
	
	public JTableDemo() {
		//INITIALIZE column headings
		String[] columnHeadings= {"Name","Extensions","ID"};
		//Initialize the data
		Object[][] data= {
				{"niki","123","1"},
				{"pranay","234","2"},
				{"navya","345","2"},
				{"Ram","456","3"}
		};
		table= new JTable (data,columnHeadings);
		scrollPane= new JScrollPane(table);
		add(scrollPane);
		setTitle("JTableDemo");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JTableDemo();

	}

}

package in.codersclub.swing;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;

public class JTabbedPaneDemo extends JFrame {
	private JTabbedPane tabbedPane;
	
	public JTabbedPaneDemo() {
		tabbedPane= new JTabbedPane();
		tabbedPane.addTab("Cities", new CitiesPanel());
		tabbedPane.addTab("Languages", new LanguagesPanel());
		tabbedPane.addTab("Colors", new ColorsPanel());
		
		add(tabbedPane);
		setTitle("JTabbedPane");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	class CitiesPanel extends JPanel{
		private JButton button1,button2,button3,button4;
		public CitiesPanel() {
		button1 = new JButton("New York");
		button2 = new JButton("London");
		button3 = new JButton("Californiak");
		button4 = new JButton("Paris");
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		}	

	}
	class LanguagesPanel extends JPanel{
		private JCheckBox box1;
		private JCheckBox box2;
		private JCheckBox box3;
		private JCheckBox box4;
		public LanguagesPanel() {
			 box1= new JCheckBox ("php");
			 box2= new JCheckBox ("python");
			 box3= new JCheckBox ("java");
			 box4= new JCheckBox ("c++");	
			 
				 add(box1);
				 add(box2);
				 add(box3);
				 add(box4);

		}
	}
	class ColorsPanel extends JPanel{
		private JComboBox comboBox;
		public ColorsPanel() {
			comboBox=new JComboBox();
			comboBox.addItem("white");
			comboBox.addItem("Black");
			comboBox.addItem("Blue");
			comboBox.addItem("Red");
			comboBox.addItem("Orange");
			
			add(comboBox);
			
		}
	}
	public static void main(String[] args) {
		new JTabbedPaneDemo();

	}

}

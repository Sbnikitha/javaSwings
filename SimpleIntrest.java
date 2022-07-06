package in.codersclub.swing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SimpleIntrest extends JFrame implements ActionListener{
	 private JLabel lblPrinciple; 
	 private JTextField txtPrinciple;
	 private JLabel lblTerm; 
	 private JTextField txtTerm;
	 private JLabel lblRate; 
	 private JTextField txtRate;
	 private JButton btnSubmit;
	 private JLabel lblResult;
	 
	 public SimpleIntrest() {
		 setLayout( new FlowLayout());
		 
		 lblPrinciple= new JLabel(" Principle :" );
		 txtPrinciple= new JTextField(5);
		 lblTerm= new JLabel(" Term :" );
		 txtTerm= new JTextField(5);
		 lblRate= new JLabel("Rate :" );
		 txtRate= new JTextField(5);
		 btnSubmit=new JButton("submit");
		 lblResult = new JLabel();
		 
		 add(lblPrinciple);
		 add(txtPrinciple);
		 
		 add(lblTerm);
		 add(txtTerm);
		 
		 add(lblRate);		 
		 add(txtRate);
		 add(btnSubmit);
		 add(lblResult);
		 
		 btnSubmit.addActionListener(this);
		 
		 setTitle("SimpleIntrest");
		 setSize(600,500);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
	 }
	 @Override
		public void actionPerformed(ActionEvent ae) { 
			String principle= txtPrinciple.getText();
			int p = Integer.parseInt(principle);
			String Term= txtTerm.getText();
			int t= Integer.parseInt(Term);
			String Rate= txtPrinciple.getText();
			int r = Integer.parseInt(Rate);
			int si=(p*t*r)/100;
			lblResult.setText("The Simple Intrest is "+si);
	 }
				
	public static void main(String[] args) {
		new SimpleIntrest();

	}

}

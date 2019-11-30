import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustNewGUI extends JFrame implements ActionListener {
	static JFrame NewCustGui = new JFrame("Create Account Info");
	static JButton Create = new JButton("Create Account");
	static JTextField UserInput  = new JTextField(20);
	static JTextField PassInput  = new JTextField(20);
	static JLabel Userlab = new JLabel("Username:");
	static JLabel Passlab = new JLabel("Password:");
	static JLabel Header = new JLabel("Customer Signup:");
	static JLabel TestOutputU = new JLabel ("User:");
	static JLabel TestOutputP = new JLabel ("Pass:");
	static JLabel CurrDate = new JLabel(Mains.date);
	public static String User;
	public static String Pass;
	
	
	CustNewGUI(){
		JPanel pan = new JPanel();
		pan.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagConstraints c = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = GridBagConstraints.REMAINDER;
		Header.setFont(new Font("Serif", Font.PLAIN, 30));
		Header.setForeground(Color.RED);
		NewCustGui.setBackground(Color.CYAN);
		c.gridx = 1;
		pan.add(Header,gbc);
		pan.add(Userlab);
		pan.add(UserInput,gbc);
		pan.add(Passlab);
		pan.add(PassInput,gbc);
		pan.add(Create,c);
		gbc.gridx = 1;
		pan.add(TestOutputU,c);
		pan.add(TestOutputP,c);
		
		GridBagConstraints q = new GridBagConstraints();
		q.gridx = 2;
		q.anchor = GridBagConstraints.LAST_LINE_END;
		q.insets = new Insets(50, 0, 0, 0);
		pan.add(CurrDate,q);
		
		NewCustGui.add(pan);
		NewCustGui.setSize(325,325); 
		NewCustGui.setLocation (805, 100);
		NewCustGui.setVisible(true); 
		
		
		
	
		
	}//end of CustNewGUI

	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("Create Account")) {
			User = UserInput.getText();
			Pass = PassInput.getText();
			TestOutputU.setText("Username: " + User);
			TestOutputP.setText("Password: " + Pass);
			//User and Pass is used for variables
		}// end of if 

	
	}//end of actionpreformed
}//end of class

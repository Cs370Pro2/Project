import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CustSigIn  extends JFrame implements ActionListener{
	static JButton Login = new JButton("Login");
	static JButton NewUser = new JButton("Create Account");
	static JTextField UserInput  = new JTextField(20);
	static JTextField PassInput  = new JTextField(20);
	static JFrame CustLog = new JFrame("Customer Login:");
	static JLabel Userlab = new JLabel("Username:");
	static JLabel Passlab = new JLabel("Password:");
	static JLabel Header = new JLabel("Customer Login:");
	static JLabel TestOutputU = new JLabel ("User:");
	static JLabel TestOutputP = new JLabel ("Pass:");
	static JLabel CurrDate = new JLabel(Mains.date);
	public static String User;
	public static String Pass;
	
	
	CustSigIn(){
		JPanel pan = new JPanel();
		pan.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagConstraints c = new GridBagConstraints();
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = GridBagConstraints.REMAINDER;
		Header.setFont(new Font("Serif", Font.PLAIN, 30));
		Header.setForeground(Color.RED);
		CustLog.setBackground(Color.CYAN);
		c.gridx = 1;
		pan.add(Header,gbc);
		pan.add(Userlab);
		pan.add(UserInput,gbc);
		pan.add(Passlab);
		pan.add(PassInput,gbc);
		pan.add(Login,c);
		gbc.gridx = 1;
		pan.add(NewUser,gbc);
		pan.add(TestOutputU,c);
		pan.add(TestOutputP,c);
		
		GridBagConstraints q = new GridBagConstraints();
		q.gridx = 2;
		q.anchor = GridBagConstraints.LAST_LINE_END;
		q.insets = new Insets(30, 0, 0, 0);
		pan.add(CurrDate,q);
		CustLog.add(pan);
	    CustLog.setSize(325,300); 
	    CustLog.setLocation (0, 100);
	    CustLog.setVisible(true); 
		
		
		
		
	} //end of CustSigIn
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		if(s.equals("Login")) {
			User = UserInput.getText();
			Pass = PassInput.getText();
			TestOutputU.setText("Username: " + User);
			TestOutputP.setText("Password: " + Pass);
			//User and Pass is used for variables
		}
		if(s.equals("Create Account")) {
			// runs the "Create User Gui"
			
		}
		
	}//end of actionpreformed
}//end of class

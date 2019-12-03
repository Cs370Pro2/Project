import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*; 

public class SearchGUI  extends JFrame implements ActionListener {
	static JTextField search = new JTextField(30);
	static JFrame frame = new JFrame("Search Engine"); 
	static JButton btn = new JButton("Search");
	static JLabel Lab = new JLabel("This is where results will be displayed");
	static JLabel label = new JLabel("Search for Flight:");
	static JLabel space = new JLabel("");
	static JLabel results1 = new JLabel("");
	static JLabel results2 = new JLabel("");
	static JLabel results3 = new JLabel("");
	static JButton reserve1 = new JButton("Reserve Flight1");
	static JButton reserve2 = new JButton("Reserve Flight2");
	static JButton reserve3 = new JButton("Reserve Flight3");
	static JButton reserveinfo1 = new JButton("Flight1 Info");
	static JButton reserveinfo2 = new JButton("Flight2 Info");
	static JButton reserveinfo3 = new JButton("Flight3 Info");
	static JLabel comment = new JLabel();
	static JLabel empty = new JLabel("");
	static JLabel CurrDate = new JLabel(Mains.date);
	public static String search_input;

	SearchGUI(){

	JPanel pan = new JPanel();
	
	//sets layout of panel to GridBagLayout (Using it to create new lines and spacing)
	pan.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagConstraints c = new GridBagConstraints();
	GridBagConstraints v = new GridBagConstraints();
	
	gbc.gridwidth = GridBagConstraints.REMAINDER; //used to create new line 
	v.gridx = 1;
	
	label.setFont(new Font("Serif", Font.PLAIN, 30)); //font for the "Search for Flight" text
	
	//adds Text Fields, Buttons, and Labels to GUI
	pan.add(label,gbc);
	pan.add(search,gbc);
	gbc.insets = new Insets(10, 0, 0, 0); //spacing
	pan.add(btn,gbc);
	pan.add(Lab,gbc);
	gbc.insets = new Insets(5, 0, 0, 0);
	//result 1
	pan.add(results1,gbc);
	if(Mains.isadmin == true) pan.add(reserveinfo1,v); //adds button if admin
	pan.add(reserve1,gbc);
	reserve1.setVisible(false);
	reserveinfo1.setVisible(false);

	//result 2
	pan.add(results2,gbc);
	if(Mains.isadmin == true) pan.add(reserveinfo2,v); //adds button if admin
	pan.add(reserve2,gbc);
	reserve2.setVisible(false);
	reserveinfo2.setVisible(false);
	
	//result 3
	pan.add(results3,gbc);
	if(Mains.isadmin == true) pan.add(reserveinfo3,v); //adds button if admin
	pan.add(reserve3,gbc);
	reserve3.setVisible(false);
	reserveinfo3.setVisible(false);
	
	space.setForeground(Color.RED); //changing the input text to red
	c.insets = new Insets(10,0,0,0);
	pan.add(space,c);
	pan.add(comment,c);
	//empty.setFont(new Font("Serif", Font.PLAIN, 100)); //font
	pan.add(empty,gbc);
	GridBagConstraints q = new GridBagConstraints();
	q.gridx = 2;
	q.anchor = GridBagConstraints.LAST_LINE_END;
	q.insets = new Insets(150, 0, 0, 0);
	pan.add(CurrDate,q);
	
	// adding panel to frame, and frame sizing
	frame.add(pan);
    frame.setSize(550,575); 
    frame.setLocation (250, 80);
    frame.setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent ae) {
		 String s = ae.getActionCommand(); 
	        if (s.equals("Search")) { 
	        	
	        	//search_input will be a string that holds the input typed in to the searchbar
	        	search_input = search.getText();
	        	
	        	//displays results when button is clicked (Will change later)
	        	results1.setText("*Display first result*");
	        	reserve1.setVisible(true);
	        	reserveinfo1.setVisible(true);
	        	//reserve1.setText("Reserve Flight1");
	        	results2.setText("*Display second result*");
	        	reserve2.setVisible(true);
	        	reserveinfo2.setVisible(true);
	        	//reserve2.setText("Reserve Flight2");
	        	results3.setText("*Display third result*");
	        	reserve3.setVisible(true);
	        	reserveinfo3.setVisible(true);
	        	//reserve3.setText("Reserve Flight3");
	        	
	        	//printing the variable (Used for testing, will remove later)
	        	space.setText(search_input);
	        	
	        	comment.setText(": Will be used as a variable. (search_input for now)(String)");
	  
	            // set the text of field to blank 
	            search.setText("  "); 
	            
	        }//end of if statement (if search button is clicked)
	        
			if(s.equals("Reserve Flight1")) {
				int Flight1res = JOptionPane.showConfirmDialog(null, "Would you like to reserve a seat for this flight?");
		        // 0=yes, 1=no, 2=cancel
			}// end of Flight1

			if(s.equals("Reserve Flight2")) {
				int Flight2res = JOptionPane.showConfirmDialog(null, "Would you like to reserve a seat for this flight?");
				// 0=yes, 1=no, 2=cancel
			}// end of Flight2
			
			if(s.equals("Reserve Flight3")) {
				int Flight3res = JOptionPane.showConfirmDialog(null, "Would you like to reserve a seat for this flight?");
				// 0=yes, 1=no, 2=cancel
			}// end of Flight3
			
			if(s.equals("Flight1 Info")) {
				
			}// end of Flight1 Info

			if(s.equals("Flight2 Info")) {
				
			}// end of Flight2 Info
			
			if(s.equals("Flight3 Info")) {
				
			}// end of Flight3 Info
	}// end of action listener
	
}//end of class

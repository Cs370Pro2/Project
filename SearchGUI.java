
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*; 

public class SearchGUI  extends JFrame implements ActionListener {
	static JTextField search = new JTextField(30);
	static JFrame frame = new JFrame("Test Name"); 
	static JButton btn = new JButton("Search");
	static JLabel Lab = new JLabel("This is where results will be displayed");
	static JLabel label = new JLabel("Search for Flight:");
	static JLabel space = new JLabel("");
	static JLabel results1 = new JLabel("");
	static JLabel results2 = new JLabel("");
	static JLabel results3 = new JLabel("");
	static JLabel comment = new JLabel();
	public static String search_input;

	SearchGUI(){

	JPanel pan = new JPanel();
	
	//sets layout of panel to GridBagLayout (Using it to create new lines and spacing)
	pan.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	GridBagConstraints c = new GridBagConstraints();
	
	gbc.gridwidth = GridBagConstraints.REMAINDER; //used to create new line 
	
	label.setFont(new Font("Serif", Font.PLAIN, 30)); //font for the "Search for Flight" text
	
	//add to panel
	pan.add(label,gbc);
	pan.add(search,gbc);
	gbc.insets = new Insets(10, 0, 0, 0); //spacing
	pan.add(btn,gbc);
	pan.add(Lab,gbc);
	gbc.insets = new Insets(5, 0, 0, 0);
	pan.add(results1,gbc);
	pan.add(results2,gbc);
	pan.add(results3,gbc);
	
	space.setForeground(Color.RED); //changing the input text to red
	c.insets = new Insets(10,0,0,0);
	pan.add(space,c);
	pan.add(comment,c);
	
	// adding panel to frame, and frame sizing
	frame.add(pan);
    frame.setSize(400, 400); 
    frame.setLocation (350, 100);
    frame.setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent ae) {
		 String s = ae.getActionCommand(); 
	        if (s.equals("Search")) { 
	        	
	        	//search_input will be a string that holds the input typed in to the searchbar
	        	search_input = search.getText();
	        	
	        	//displays results when button is clicked (Will change later)
	        	results1.setText("*Display first result*");
	        	results2.setText("*Display second result*");
	        	results3.setText("*Display third result*");
	        	
	        	//printing the variable (Used for testing, will remove later)
	        	space.setText(search_input);
	        	
	        	comment.setText(": Will be used as a variable. (search_input for now)");
	  
	            // set the text of field to blank 
	            search.setText("  "); 
	            
	        }//end of if statement (if search button is clicked)

	}// end of action listener
	
}//end of class
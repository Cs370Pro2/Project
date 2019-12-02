import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FlightRaidGUI extends JFrame implements ActionListener{
	static JFrame airframe = new JFrame("FlightRaid Info");
	static JLabel airlabel = new JLabel("FlightRaid Info:");
	static JLabel flight1 = new JLabel("Fight info for first flight. Can use string variables to replace");
	static JLabel flight2 = new JLabel("Fight info for second flight. Can use string variables to replace");
	static JLabel flight3 = new JLabel("Fight info for third flight. Can use string variables to replace");
	static JButton cancelflight1 = new JButton("Cancel Flight1");
	static JButton cancelflight2 = new JButton("Cancel Flight2");
	static JButton cancelflight3 = new JButton("Cancel Flight3");
	static JLabel CurrDate = new JLabel(Mains.date);
	static JButton insert = new JButton("Insert Addtional Flight:");
	static JButton insert2= new JButton("Insert Addtional Fare:");
	
	
	FlightRaidGUI(){
		//adds Text Fields, Buttons, and Labels to GUI
		JPanel pan = new JPanel();
		pan.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.insets = new Insets(10, 0, 0, 0);
		airlabel.setFont(new Font("Serif", Font.PLAIN, 30));
		airlabel.setForeground(Color.MAGENTA);
		pan.add(airlabel,gbc);
		pan.add(flight1,gbc);
		if(Mains.isadmin == true) pan.add(cancelflight1,gbc);
		pan.add(flight2,gbc);
		if(Mains.isadmin == true) pan.add(cancelflight2,gbc);
		pan.add(flight3,gbc);
		if(Mains.isadmin == true) pan.add(cancelflight3,gbc);
		//wrap this button in an if statement, only visible by admin
		if(Mains.isadmin == true) { 
		pan.add(insert,c);
		c.gridx = 1;
		c.gridwidth = GridBagConstraints.REMAINDER;
		pan.add(insert2,c);
		}//end of if(isadmin)	
		GridBagConstraints q = new GridBagConstraints();
		q.gridx = 2;
		q.anchor = GridBagConstraints.LAST_LINE_END;
		q.insets = new Insets(30, 0, 0, 0);
		pan.add(CurrDate,q);	
		airframe.add(pan);
		airframe.setSize(550,550); 
		airframe.setLocation (500, 100);
		airframe.setVisible(true); 
		
	}

	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("Cancel Flight1")) {
			
		}// end of Flight1
		
		if(s.equals("Cancel Flight2")) {
			
		}// end of Flight2
		
		if(s.equals("Cancel Flight3")) {
			
		}// end of Flight3
		
		if(s.equals("Insert Addtional Flight:")) {
			
		}// end of Insert

	
	}//end of actionpreformed
		
	
}

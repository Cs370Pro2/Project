import javax.swing.JOptionPane;

public class Mains {
	public static String month,day,year,date;
	public static int intmonth,intday,intyear;
	public static boolean isadmin = true;
//	public static String date = "11/29/2019";
	public static void main(String args[]) {
		month = JOptionPane.showInputDialog("Input month:");
		intmonth = Integer.parseInt(month);
		day = JOptionPane.showInputDialog("Input day:");
		intday = Integer.parseInt(day);
		year = JOptionPane.showInputDialog("Input year:");
		intyear = Integer.parseInt(year);
		date = ("Current date: " + month + "/" + day + "/" + year);

		//Opens Sign-In Page
		CustSigIn cl = new CustSigIn();
		CustSigIn.Login.addActionListener(cl);
		CustSigIn.NewUser.addActionListener(cl);
		
		//Opens Search Engine
		SearchGUI se = new SearchGUI();
		SearchGUI.btn.addActionListener(se);
		SearchGUI.reserve1.addActionListener(se);
		SearchGUI.reserve2.addActionListener(se);
		SearchGUI.reserve3.addActionListener(se);
		SearchGUI.reserveinfo1.addActionListener(se);
		SearchGUI.reserveinfo2.addActionListener(se);
		SearchGUI.reserveinfo3.addActionListener(se);
		
		//Opens FlightRaid GUI
		FlightRaidGUI fr = new FlightRaidGUI();
		FlightRaidGUI.cancelflight1.addActionListener(fr);
		FlightRaidGUI.cancelflight2.addActionListener(fr);
		FlightRaidGUI.cancelflight3.addActionListener(fr);
		FlightRaidGUI.insert.addActionListener(fr);
		FlightRaidGUI.insert2.addActionListener(fr);
		
		//Opens Red Bird GUI
		RedBirdGUI rb = new RedBirdGUI();
		RedBirdGUI.cancelflight1.addActionListener(rb);
		RedBirdGUI.cancelflight2.addActionListener(rb);
		RedBirdGUI.cancelflight3.addActionListener(rb);
		RedBirdGUI.insert.addActionListener(rb);
		RedBirdGUI.insert2.addActionListener(rb);
		
		//Opens Humming Dart GUI
		HummingDartGUI hd = new HummingDartGUI();
		HummingDartGUI.cancelflight1.addActionListener(hd);
		HummingDartGUI.cancelflight2.addActionListener(hd);
		HummingDartGUI.cancelflight3.addActionListener(hd);
		HummingDartGUI.insert.addActionListener(hd);
		HummingDartGUI.insert2.addActionListener(hd);

	}
}

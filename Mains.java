
public class Mains {
	public static String date = "11/29/2019";
	public static void main(String args[]) {
		CustSigIn cl = new CustSigIn();
		CustSigIn.Login.addActionListener(cl);
		CustSigIn.NewUser.addActionListener(cl);
		
		SearchGUI se = new SearchGUI();
		SearchGUI.btn.addActionListener(se);
		
//		CustSigIn cl = new CustSigIn();
//		CustSigIn.Login.addActionListener(cl);
//		CustSigIn.NewUser.addActionListener(cl);
		
		AirlineGUI ag = new AirlineGUI();
		
		//moved to Customer Sign GUI
//		CustNewGUI cn = new CustNewGUI();
//		CustNewGUI.Create.addActionListener(cn);
				
	}
}

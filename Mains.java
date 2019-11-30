
public class Mains {
	public static String date = "11/29/2019";
	public static void main(String args[]) {
		SearchGUI se = new SearchGUI();
		SearchGUI.btn.addActionListener(se);
		
		CustSigIn cl = new CustSigIn();
		CustSigIn.Login.addActionListener(cl);
		CustSigIn.NewUser.addActionListener(cl);
		
		CustNewGUI cn = new CustNewGUI();
		CustNewGUI.Create.addActionListener(cn);
		
	}
}

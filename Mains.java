
public class Mains {
	public static void main(String args[]) {
		SearchGUI se = new SearchGUI();
		SearchGUI.btn.addActionListener(se);
		
		CustSigIn cl = new CustSigIn();
		CustSigIn.Login.addActionListener(cl);
		CustSigIn.NewUser.addActionListener(cl);
		
	}
}

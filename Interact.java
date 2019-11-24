import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Interact {
		public Interact() {
			JOptionPane.showMessageDialog(null, "This is a test");
			JButton btnClose = new JButton("Close");
			btnClose.addActionListener(e -> System.exit(0));
			System.exit(0);
		}
}

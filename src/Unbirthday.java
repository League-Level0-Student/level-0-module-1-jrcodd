import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday;
		birthday = JOptionPane.showInputDialog("What is Your Birthday(mm/dd)");
		if (birthday.equals("12/19")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		}

		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}
	}
}

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String jackson = "jackson";
		String wendy = "wendy";
		String name;
		name = JOptionPane.showInputDialog("What is your name(use lowercase)");
		if (name.equals(wendy)) {
			JOptionPane.showMessageDialog(null, "You ar ean awesome teacher " + wendy);
		}

		else if (name.equals(jackson)) {
			JOptionPane.showMessageDialog(null, "You are an awesome coder " + jackson);
		}

		else {
			JOptionPane.showMessageDialog(null, "I don't know you " + name);
		}
	}
}

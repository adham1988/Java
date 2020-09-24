package exercice2;

import javax.swing.*;

public class DialogBox {

	JFrame f;

	DialogBox(String message) {
		f = new JFrame();
		JOptionPane.showMessageDialog(f, message);
	}

	public static void main(String[] args) {
		//new DialogBox();
	}

}

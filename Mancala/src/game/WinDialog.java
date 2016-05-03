package game;

import javax.swing.JOptionPane;

public class WinDialog extends JOptionPane {

	private static final long serialVersionUID = 4598436296065501578L;
	
	Object[] options = {"New Game", "Quit"};

	WinDialog(String winner) {
		createDialog("You Won!");
		setMessage(winner + " won!\nPlay again?");
		setOptions(options);
		setMessageType(JOptionPane.PLAIN_MESSAGE);
		this.setVisible(true);
	}
}
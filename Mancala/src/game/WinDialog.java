package game;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class WinDialog extends JOptionPane {

	private static final long serialVersionUID = 4598436296065501578L;
	JButton quitGame = new JButton("Quit");
	Object[] options = {"New game", quitGame};

	WinDialog(String winner) {
		createDialog("You Won!");
		setMessage(winner + " won!\nPlay again?");
		setOptions(options);
		setMessageType(JOptionPane.PLAIN_MESSAGE);
		this.setVisible(true);
	}
	
	public void addQuitListener(ActionListener QuitListener) {
		quitGame.addActionListener(QuitListener);
	}
}
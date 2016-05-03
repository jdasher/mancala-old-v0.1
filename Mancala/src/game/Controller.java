package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * @author Jonathan Dasher
 *
 */
public class Controller {
	private BoardModel model;
	private BoardView view;
	
	public void setModel(BoardModel model) {
		this.model = model;		
	}

	public void setView(BoardView view) {
		this.view = view;
		// Menu button listeners
		this.view.addNewGameListener(new NewGameListener());
		this.view.addSaveGameListener(new SaveGameListener());
		this.view.addLoadGameListener(new LoadGameListener());
		this.view.addExitGameListener(new ExitGameListener());
		// Game button listeners
		this.view.addPit1Listener(new Pit1Listener());
		this.view.addPit2Listener(new Pit2Listener());
		this.view.addPit3Listener(new Pit3Listener());
		this.view.addPit4Listener(new Pit4Listener());
		this.view.addPit5Listener(new Pit5Listener());
		this.view.addPit6Listener(new Pit6Listener());
		this.view.addPit7Listener(new Pit7Listener());
		this.view.addPit8Listener(new Pit8Listener());
		this.view.addPit9Listener(new Pit9Listener());
		this.view.addPit10Listener(new Pit10Listener());
		this.view.addPit11Listener(new Pit11Listener());
		this.view.addPit12Listener(new Pit12Listener());
		
		this.view.player1Turn();
	}

	class NewGameListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			model.newGame();
			view.player1Turn();
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}

	class SaveGameListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}
	}
	
	class LoadGameListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}
	}
	
	class ExitGameListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	class Pit1Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit1");
			boolean playAgain = model.movePit1();
			if(playAgain) {
				view.player1Turn();
			} else {
				view.player2Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {	
			System.out.println("Pit2");
			boolean playAgain = model.movePit2();
			if(playAgain) {
				view.player1Turn();
			} else {
				view.player2Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit3Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit3");
			boolean playAgain = model.movePit3();
			if(playAgain) {
				view.player1Turn();
			} else {
				view.player2Turn();	
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit4Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit4");
			boolean playAgain = model.movePit4();
			if(playAgain) {
				view.player1Turn();
			} else {
				view.player2Turn();	
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit5Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit5");
			boolean playAgain = model.movePit5();
			if(playAgain) {
				view.player1Turn();
			} else {
				view.player2Turn();	
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit6Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit6");
			boolean playAgain = model.movePit6();
			if(playAgain) {
				view.player1Turn();
			} else {
				view.player2Turn();	
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit7Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit7");
			boolean playAgain = model.movePit7();
			if(playAgain) {
				view.player2Turn();
			} else {
				view.player1Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit8Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit8");
			boolean playAgain = model.movePit8();
			if(playAgain) {
				view.player2Turn();
			} else {
				view.player1Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit9Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit9");
			boolean playAgain = model.movePit9();
			if(playAgain) {
				view.player2Turn();
			} else {
				view.player1Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	} 
	
	class Pit10Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit10");
			boolean playAgain = model.movePit10();
			if(playAgain) {
				view.player2Turn();
			} else {
				view.player1Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit11Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit11");
			boolean playAgain = model.movePit11();
			if(playAgain) {
				view.player2Turn();
			} else {
				view.player1Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}
	
	class Pit12Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit12");
			boolean playAgain = model.movePit12();
			if(playAgain) {
				view.player2Turn();
			} else {
				view.player1Turn();
			}
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
			view.setPit1(model.getPit1());
			view.setPit2(model.getPit2());
			view.setPit3(model.getPit3());
			view.setPit4(model.getPit4());
			view.setPit5(model.getPit5());
			view.setPit6(model.getPit6());
			view.setPit7(model.getPit7());
			view.setPit8(model.getPit8());
			view.setPit9(model.getPit9());
			view.setPit10(model.getPit10());
			view.setPit11(model.getPit11());
			view.setPit12(model.getPit12());
			view.setPlayer1(model.getPlayer1());
			view.setPlayer2(model.getPlayer2());
		}
	}

	public void gameOver() {
		System.out.println("Game Over");
		int player1Score = Integer.parseInt(model.getPit1()) +
				Integer.parseInt(model.getPit2()) +
				Integer.parseInt(model.getPit3()) +
				Integer.parseInt(model.getPit4()) +
				Integer.parseInt(model.getPit5()) +
				Integer.parseInt(model.getPit6());
		int player2Score = Integer.parseInt(model.getPit7()) +
				Integer.parseInt(model.getPit8()) +
				Integer.parseInt(model.getPit9()) +
				Integer.parseInt(model.getPit10()) +
				Integer.parseInt(model.getPit11()) +
				Integer.parseInt(model.getPit12());

		Object[] options = {"New Game", "Quit"};
		
		if (player1Score == 0) {
			System.out.println("Player 1 Wins");
			WinDialog win = new WinDialog("Player 1");
			JDialog win1 = win.createDialog(view.mainFrame, "You Won!");
			win1.setVisible(true);
		}
		if(player2Score == 0) {
			System.out.println("Player 2 Wins");
			WinDialog win = new WinDialog("Player 2");
			JDialog win1 = win.createDialog(view.mainFrame, "You Won!");
			win1.setVisible(true);
		}
	}
}
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JDialog;

/**
 * @author Jonathan Dasher
 *
 */
public class Controller {
	// Model and view set from driver
	private BoardModel model;
	private BoardView view;
	// Needed for save/load game
	private int playerTurn;

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
		playerTurn = 1;
	}

	class NewGameListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			model.newGame();
			view.player1Turn();
			playerTurn = 1;
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
			ArrayList<Object> stuffToSave = new ArrayList<Object>();
			stuffToSave.add(model.getPit1());
			stuffToSave.add(model.getPit2());
			stuffToSave.add(model.getPit3());
			stuffToSave.add(model.getPit4());
			stuffToSave.add(model.getPit5());
			stuffToSave.add(model.getPit6());
			stuffToSave.add(model.getPit7());
			stuffToSave.add(model.getPit8());
			stuffToSave.add(model.getPit9());
			stuffToSave.add(model.getPit10());
			stuffToSave.add(model.getPit11());
			stuffToSave.add(model.getPit12());
			stuffToSave.add(model.getPlayer1());
			stuffToSave.add(model.getPlayer2());
			stuffToSave.add(playerTurn);
			FileOutputStream fileStream;
			ObjectOutputStream out = null;
			try {			
				fileStream = new FileOutputStream(".save");
				out = new ObjectOutputStream(fileStream);
				out.writeObject(stuffToSave);
			} catch (IOException e1) {
				//TODO
			} 
		}
	}

	class LoadGameListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ArrayList<Object> savedStuff = new ArrayList<Object>();
			FileInputStream fileStream;
			ObjectInputStream in = null;
			try {
			fileStream = new FileInputStream(".save");
			in = new ObjectInputStream(fileStream);
			savedStuff = (ArrayList<Object>) in.readObject();
			int pit1 = Integer.parseInt((String) savedStuff.get(0));
			int pit2 = Integer.parseInt((String) savedStuff.get(1));
			int pit3 = Integer.parseInt((String) savedStuff.get(2));
			int pit4 = Integer.parseInt((String) savedStuff.get(3));
			int pit5 = Integer.parseInt((String) savedStuff.get(4));
			int pit6 = Integer.parseInt((String) savedStuff.get(5));
			int pit7 = Integer.parseInt((String) savedStuff.get(6));
			int pit8 = Integer.parseInt((String) savedStuff.get(7));
			int pit9 = Integer.parseInt((String) savedStuff.get(8));
			int pit10 = Integer.parseInt((String) savedStuff.get(9));
			int pit11 = Integer.parseInt((String) savedStuff.get(10));
			int pit12 = Integer.parseInt((String) savedStuff.get(11));
			int player1 = Integer.parseInt((String) savedStuff.get(12));
			int player2 = Integer.parseInt((String) savedStuff.get(13));
			playerTurn = (int) savedStuff.get(14);
			
			model.resumeGame(pit1, pit2, pit3, pit4, pit5, pit6, pit7, pit8,
					pit9, pit10, pit11, pit12, player1, player2);
			
			if(playerTurn == 1) 
				view.player1Turn();
			else 
				view.player2Turn();
			
			} catch (IOException e1) {
				// TODO
			} catch (ClassNotFoundException e1) {
				// TODO
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
				playerTurn = 1;
			} else {
				view.player2Turn();
				playerTurn = 2;
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
			
			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {	
			System.out.println("Pit2");
			boolean playAgain = model.movePit2();
			if(playAgain) {
				view.player1Turn();
				playerTurn = 1;
			} else {
				view.player2Turn();
				playerTurn = 2;
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
			

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit3Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit3");
			boolean playAgain = model.movePit3();
			if(playAgain) {
				view.player1Turn();
				playerTurn = 1;
			} else {
				view.player2Turn();	
				playerTurn = 2;
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
			

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit4Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit4");
			boolean playAgain = model.movePit4();
			if(playAgain) {
				view.player1Turn();
				playerTurn = 1;
			} else {
				view.player2Turn();	
				playerTurn = 2;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit5Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit5");
			boolean playAgain = model.movePit5();
			if(playAgain) {
				view.player1Turn();
				playerTurn = 1;
			} else {
				view.player2Turn();	
				playerTurn = 2;
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


			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit6Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit6");
			boolean playAgain = model.movePit6();
			if(playAgain) {
				view.player1Turn();
				playerTurn = 1;
			} else {
				view.player2Turn();	
				playerTurn = 2;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit7Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit7");
			boolean playAgain = model.movePit7();
			if(playAgain) {
				view.player2Turn();
				playerTurn = 2;
			} else {
				view.player1Turn();
				playerTurn = 1;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit8Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit8");
			boolean playAgain = model.movePit8();
			if(playAgain) {
				view.player2Turn();
				playerTurn = 2;
			} else {
				view.player1Turn();
				playerTurn = 1;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit9Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit9");
			boolean playAgain = model.movePit9();
			if(playAgain) {
				view.player2Turn();
				playerTurn = 2;
			} else {
				view.player1Turn();
				playerTurn = 1;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	} 

	class Pit10Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit10");
			boolean playAgain = model.movePit10();
			if(playAgain) {
				view.player2Turn();
				playerTurn = 2;
			} else {
				view.player1Turn();
				playerTurn = 1;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit11Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit11");
			boolean playAgain = model.movePit11();
			if(playAgain) {
				view.player2Turn();
				playerTurn = 2;
			} else {
				view.player1Turn();
				playerTurn = 1;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	class Pit12Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Pit12");
			boolean playAgain = model.movePit12();
			if(playAgain) {
				view.player2Turn();
				playerTurn = 2;
			} else {
				view.player1Turn();
				playerTurn = 1;
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
		

			if(model.checkForWin()) {
				Controller.this.gameOver();
			}
		}
	}

	public void gameOver() {
		System.out.println("Game Over");
		int gameOver1 = Integer.parseInt(model.getPit1()) +
				Integer.parseInt(model.getPit2()) +
				Integer.parseInt(model.getPit3()) +
				Integer.parseInt(model.getPit4()) +
				Integer.parseInt(model.getPit5()) +
				Integer.parseInt(model.getPit6());
		int gameOver2 = Integer.parseInt(model.getPit7()) +
				Integer.parseInt(model.getPit8()) +
				Integer.parseInt(model.getPit9()) +
				Integer.parseInt(model.getPit10()) +
				Integer.parseInt(model.getPit11()) +
				Integer.parseInt(model.getPit12());
		int player1Score = Integer.parseInt(model.getPlayer1());
		int player2Score = Integer.parseInt(model.getPlayer2());

		if(gameOver1 == 0 || gameOver2 == 0) {
			JDialog win1 = new JDialog();
			WinDialog win;
			if(player1Score > player2Score) {
				System.out.println("Player 1 Wins");
				win = new WinDialog("Player 1");
				win.addQuitListener(new QuitListener());
				win1 = win.createDialog(view.mainFrame, "You Won!");
				win1.setVisible(true);
			} else {
				System.out.println("Player 2 Wins");
				win = new WinDialog("Player 2");
				win.addQuitListener(new QuitListener());
				win1 = win.createDialog(view.mainFrame, "You Won!");
				win1.setVisible(true);
			}
			model.newGame();
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
			view.player1Turn();
			playerTurn = 1;
		}
	}

	class QuitListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}
package game;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * Main Frame to display game board
 * @author Jonathan Dasher
 */
public class BoardView {
	// Main display frame and panel
	private JFrame mainFrame = new JFrame();
	private JPanel menuPanel = new JPanel();
	private JPanel boardPanel = new JPanel(new GridBagLayout());
	private JPanel mainPanel = new JPanel(new BorderLayout());
	private GridBagConstraints gridCon = new GridBagConstraints();
	
	// Menu bar and items
	private JMenuBar mainMenu = new JMenuBar();
	private JMenu optionsMenu = new JMenu();
	private JMenuItem newGame = new JMenuItem();
	private JMenuItem saveGame = new JMenuItem();
	private JMenuItem loadGame = new JMenuItem();
	private JMenuItem exitGame = new JMenuItem();
	
	// Model
	private BoardModel model;
	
	// Buttons to represent game board
	private JButton pit1 = new JButton("4");
	private JButton pit2 = new JButton("4");
	private JButton pit3 = new JButton("4");
	private JButton pit4 = new JButton("4");
	private JButton pit5 = new JButton("4");
	private JButton pit6 = new JButton("4");
	private JButton pit7 = new JButton("4");
	private JButton pit8 = new JButton("4");
	private JButton pit9 = new JButton("4");
	private JButton pit10 = new JButton("4");
	private JButton pit11 = new JButton("4");
	private JButton pit12 = new JButton("4");
	// Buttons for player values
	private JLabel player1Score = new JLabel("0");
	private JLabel player2Score = new JLabel("0");
	// Labels for player scores
	private JLabel player1Label = new JLabel("Player 1");
	private JLabel player2Label = new JLabel("Player 2");
	
	
	public BoardView() {
		// Set text for buttons
		newGame.setText("New");
		saveGame.setText("Save");
		loadGame.setText("Load");
		exitGame.setText("Exit");
		optionsMenu.setText("Game");
		
		// Add new and save game options to options menu
		optionsMenu.add(newGame);
		optionsMenu.add(saveGame);
		optionsMenu.add(loadGame);
		optionsMenu.add(exitGame);
		
		// Add Options menu to main bar
		mainMenu.add(optionsMenu);
		menuPanel.add(mainMenu);
		
		// Buttons 1-12
		gridCon.gridx = 1;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit12,gridCon);

		gridCon.gridx = 2;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit11,gridCon);

		gridCon.gridx = 3;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit10,gridCon);

		gridCon.gridx = 4;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit9,gridCon);
		
		gridCon.gridx = 5;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit8,gridCon);

		gridCon.gridx = 6;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit7,gridCon);

		gridCon.gridx = 1;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit1,gridCon);

		gridCon.gridx = 2;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit2,gridCon);
		
		gridCon.gridx = 3;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit3,gridCon);

		gridCon.gridx = 4;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit4,gridCon);

		gridCon.gridx = 5;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit5,gridCon);

		gridCon.gridx = 6;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit6,gridCon);
		
		// Player pit scores
		gridCon.gridx = 0;
		gridCon.gridy = 2;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(player2Score, gridCon);
		
		gridCon.gridx = 7;
		gridCon.gridy = 2;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(player1Score, gridCon);
		
		// Player pit labels
		gridCon.gridx = 0;
		gridCon.gridy = 3;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(player2Label, gridCon);

		gridCon.gridx = 7;
		gridCon.gridy = 3;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(player1Label, gridCon);
		
		// Constructs main panel and adds to main frame
		mainPanel.add(menuPanel,BorderLayout.WEST);
		mainPanel.add(boardPanel,BorderLayout.SOUTH);
		mainFrame.add(mainPanel);
		mainFrame.setTitle("Mancala");
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setModel(BoardModel model) {
		// Sets model
		this.model = model;
	}
	
	class Pit1Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit3Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}	
	class Pit4Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit5Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit6Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}	
	class Pit7Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit8Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit9Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}	
	class Pit10Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit11Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Pit12Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Player1Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class Player2Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void addNewGameListener(ActionListener newGameListener) {
		newGame.addActionListener(newGameListener);
	}

	public void addSaveGameListener(ActionListener saveGameListener) {
		saveGame.addActionListener(saveGameListener);
	}
	
	public void addLoadGameListener(ActionListener loadGameListener) {
		loadGame.addActionListener(loadGameListener);
	}
	
	public void addExitGameListener(ActionListener exitGameListener) {
		exitGame.addActionListener(exitGameListener);
	}

	public void addPit1Listener(ActionListener pit1Listener) {
		pit1.addActionListener(pit1Listener);
	}

	public void addPit2Listener(ActionListener pit2Listener) {
		pit2.addActionListener(pit2Listener);
	}

	public void addPit3Listener(ActionListener pit3Listener) {
		pit3.addActionListener(pit3Listener);
	}

	public void addPit4Listener(ActionListener pit4Listener) {
		pit4.addActionListener(pit4Listener);
	}

	public void addPit5Listener(ActionListener pit5Listener) {
		pit5.addActionListener(pit5Listener);
	}

	public void addPit6Listener(ActionListener pit6Listener) {
		pit6.addActionListener(pit6Listener);
	}

	public void addPit7Listener(ActionListener pit7Listener) {
		pit7.addActionListener(pit7Listener);
	}

	public void addPit8Listener(ActionListener pit8Listener) {
		pit8.addActionListener(pit8Listener);
	}

	public void addPit9Listener(ActionListener pit9Listener) {
		pit9.addActionListener(pit9Listener);
	}

	public void addPit10Listener(ActionListener pit10Listener) {
		pit10.addActionListener(pit10Listener);
	}

	public void addPit11Listener(ActionListener pit11Listener) {
		pit11.addActionListener(pit11Listener);
	}
	
	public void addPit12Listener(ActionListener pit12Listener) {
		pit12.addActionListener(pit12Listener);
	}
	
	// Grays out buttons when its not your turn
	public void player1Turn() {
		pit1.setEnabled(true);
		pit2.setEnabled(true);
		pit3.setEnabled(true);
		pit4.setEnabled(true);
		pit5.setEnabled(true);
		pit6.setEnabled(true);
		pit7.setEnabled(false);
		pit8.setEnabled(false);
		pit9.setEnabled(false);
		pit10.setEnabled(false);
		pit11.setEnabled(false);
		pit12.setEnabled(false);
	}
	public void player2Turn() {
		pit1.setEnabled(false);
		pit2.setEnabled(false);
		pit3.setEnabled(false);
		pit4.setEnabled(false);
		pit5.setEnabled(false);
		pit6.setEnabled(false);
		pit7.setEnabled(true);
		pit8.setEnabled(true);
		pit9.setEnabled(true);
		pit10.setEnabled(true);
		pit11.setEnabled(true);
		pit12.setEnabled(true);
	}

	public void setPit1(String num) {
		pit1.setText(num);
	}
	
	public void setPit2(String num) {
		pit2.setText(num);
	}

	public void setPit3(String num) {
		pit3.setText(num);
	}
	
	public void setPit4(String num) {
		pit4.setText(num);
	}

	public void setPit5(String num) {
		pit5.setText(num);
	}
	
	public void setPit6(String num) {
		pit6.setText(num);
	}

	public void setPit7(String num) {
		pit7.setText(num);
	}
	
	public void setPit8(String num) {
		pit8.setText(num);
	}

	public void setPit9(String num) {
		pit9.setText(num);
	}
	
	public void setPit10(String num) {
		pit10.setText(num);
	}

	public void setPit11(String num) {
		pit11.setText(num);
	}
	
	public void setPit12(String num) {
		pit12.setText(num);
	}
	
	public void setPlayer1(String num) {
		player1Score.setText(num);
	}
	
	public void setPlayer2(String num) {
		player2Score.setText(num);
	}
}
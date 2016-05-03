package game;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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
	
	// Model
	private BoardModel model;
	
	// TODO
	// Temp buttons to represent game board
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
		newGame.setText("New Game");
		saveGame.setText("Save Game");
		optionsMenu.setText("Options");
		
		// Add new and save game options to options menu
		optionsMenu.add(newGame);
		optionsMenu.add(saveGame);
		
		// Add Options menu to main bar
		mainMenu.add(optionsMenu);
		menuPanel.add(mainMenu);
		
		
		// TODO
		// Temp button set up for testing
		// Buttons 1-12
		gridCon.gridx = 1;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit1,gridCon);

		gridCon.gridx = 2;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit2,gridCon);

		gridCon.gridx = 3;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit3,gridCon);

		gridCon.gridx = 4;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit4,gridCon);
		
		gridCon.gridx = 5;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit5,gridCon);

		gridCon.gridx = 6;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit6,gridCon);

		gridCon.gridx = 1;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit7,gridCon);

		gridCon.gridx = 2;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit8,gridCon);
		
		gridCon.gridx = 3;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit9,gridCon);

		gridCon.gridx = 4;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit10,gridCon);

		gridCon.gridx = 5;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit11,gridCon);

		gridCon.gridx = 6;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		boardPanel.add(pit12,gridCon);
		
		
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
		
		
		
		mainPanel.add(menuPanel,BorderLayout.WEST);
		mainPanel.add(boardPanel,BorderLayout.SOUTH);
		mainFrame.add(mainPanel);
		mainFrame.setTitle("Mancala");
		mainFrame.pack();
		mainFrame.setVisible(true);
	}


	public void setModel(BoardModel model) {
		this.model = model;
	}
}
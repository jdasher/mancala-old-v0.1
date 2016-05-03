package game;

/**
 * @author Jonathan Dasher
 *
 */
public class BoardModel {
	// 12 Mancala pits
	int pit1;
	int pit2;
	int pit3;
	int pit4;
	int pit5;
	int pit6;
	int pit7;
	int pit8;
	int pit9;
	int pit10;
	int pit11;
	int pit12;

	// 2 player pits
	int player1;
	int player2;

	/**
	 * Constructor
	 */
	public BoardModel() {	
	// Initializes all board pieces
	pit1 = 4;
	pit2 = 4;
	pit3 = 4;
	pit4 = 4;
	pit5 = 4;
	pit6 = 4;
	pit7 = 4;
	pit8 = 4;
	pit9 = 4;
	pit10 = 4;
	pit11 = 4;
	pit12 = 4;

	player1 = 0;
	player2 = 0;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit1() {
		int temp = pit1;
		pit1 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit2;
				--temp;
				// If pit 2 was empty, player 1 gets all in in pit 2 and 
				// in opposite pit too
				if(pit2 == 1) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player1 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++player1;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player1 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit2() {
		int temp = pit2;
		pit2 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player1 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++player1;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player1 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}

	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit3() {
		int temp = pit3;
		pit3 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player1 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++player1;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player1 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit4() {
		int temp = pit4;
		pit4 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player1 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++player1;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player1 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit5() {
		int temp = pit5;
		pit5 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player1 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++player1;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player1 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit6() {
		int temp = pit6;
		pit6 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++player1;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player1 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player1 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}

	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit7() {
		int temp = pit7;
		pit7 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player2 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++player2;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player2 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit8() {
		int temp = pit8;
		pit8 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player2 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++player2;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player2 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit9() {
		int temp = pit9;
		pit9 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player2 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++player2;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player2 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit10() {
		int temp = pit10;
		pit10 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player2 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++player2;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player2 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit11() {
		int temp = pit11;
		pit11 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player2 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++player2;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player2 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
	
	/**
	 * Method that is called for a turn from pit 1 to take place
	 * @return boolean True if player gets to go again
	 */
	public boolean movePit12() {
		int temp = pit12;
		pit12 = 0;

		// Cycles through all marbles in pit, dropping one at a time
		while(temp > 0) {	
			if(temp > 0) {
				++player2;
				--temp;
				if(temp == 0)
					return true;
			}
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1) {
					player2 += pit7 += pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1) {
					player2 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}
		}
		// Player picked an empty pit
		return false;
	}
}
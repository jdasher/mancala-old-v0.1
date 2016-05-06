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

	public String getPit1() { 
		return Integer.toString(pit1);
	}

	public String getPit2() { 
		return Integer.toString(pit2);
	}

	public String getPit3() { 
		return Integer.toString(pit3);
	}

	public String getPit4() { 
		return Integer.toString(pit4);
	}

	public String getPit5() { 
		return Integer.toString(pit5);
	}

	public String getPit6() { 
		return Integer.toString(pit6);
	}

	public String getPit7() { 
		return Integer.toString(pit7);
	}

	public String getPit8() { 
		return Integer.toString(pit8);
	}

	public String getPit9() { 
		return Integer.toString(pit9);
	}

	public String getPit10() { 
		return Integer.toString(pit10);
	}

	public String getPit11() { 
		return Integer.toString(pit11);
	}

	public String getPit12() { 
		return Integer.toString(pit12);
	}
	
	public String getPlayer1() {
		return Integer.toString(player1);
	}
	
	public String getPlayer2() {
		return Integer.toString(player2);
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
				if(pit2 == 1 && temp == 0) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
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
				if(pit7 == 1 && temp == 0) {
					player1 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1 && temp == 0) {
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
				if(pit3 == 1 && temp == 0) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
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
				if(pit7 == 1 && temp == 0) {
					player1 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1 && temp == 0) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
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
				if(pit4 == 1 && temp == 0) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
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
				if(pit7 == 1 && temp == 0) {
					player1 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1 && temp == 0) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
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
				if(pit5 == 1 && temp == 0) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
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
				if(pit7 == 1 && temp == 0) {
					player1 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1 && temp == 0) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
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
				if(pit6 == 1 && temp == 0) {
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
				if(pit7 == 1 && temp == 0) {
					player1 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1 && temp == 0) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
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
				if(pit5 == 1 && temp == 0) {
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
				if(pit7 == 1 && temp == 0) {
					player1 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player1 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player1 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player1 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player1 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
					player1 += pit12 + pit1;
					pit12 = 0;
					pit1 = 0;
					return false;
				}
			}	
			if(temp > 0) {
				++pit1;
				--temp;
				if(pit1 == 1 && temp == 0) {
					player1 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player1 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player1 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player1 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player1 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
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
				if(pit8 == 1 && temp == 0) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
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
				if(pit1 == 1 && temp == 0) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1 && temp == 0) {
					player2 += pit7 + pit6;
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
				if(pit9 == 1 && temp == 0) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
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
				if(pit1 == 1 && temp == 0) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1 && temp == 0) {
					player2 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
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
				if(pit10 == 1 && temp == 0) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
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
				if(pit1 == 1 && temp == 0) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1 && temp == 0) {
					player2 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
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
				if(pit11 == 1 && temp == 0) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
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
				if(pit1 == 1 && temp == 0) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1 && temp == 0) {
					player2 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
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
				if(pit12 == 1 && temp == 0) {
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
				if(pit1 == 1 && temp == 0) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1 && temp == 0) {
					player2 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
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
				if(pit1 == 1 && temp == 0) {
					player2 += pit1 + pit12;
					pit1 = 0;
					pit12 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit2;
				--temp;
				if(pit2 == 1 && temp == 0) {
					player2 += pit2 + pit11;
					pit2 = 0;
					pit11 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit3;
				--temp;
				if(pit3 == 1 && temp == 0) {
					player2 += pit3 + pit10;
					pit3 = 0;
					pit10 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit4;
				--temp;
				if(pit4 == 1 && temp == 0) {
					player2 += pit4 + pit9;
					pit4 = 0;
					pit9 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit5;
				--temp;
				if(pit5 == 1 && temp == 0) {
					player2 += pit5 + pit8;
					pit5 = 0;
					pit8 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit6;
				--temp;
				if(pit6 == 1 && temp == 0) {
					player2 += pit6 + pit7;
					pit6 = 0;
					pit7 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit7;
				--temp;
				if(pit7 == 1 && temp == 0) {
					player2 += pit7 + pit6;
					pit7 = 0;
					pit6 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit8;
				--temp;
				if(pit8 == 1 && temp == 0) {
					player2 += pit8 + pit5;
					pit8 = 0;
					pit5 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit9;
				--temp;
				if(pit9 == 1 && temp == 0) {
					player2 += pit9 + pit4;
					pit9 = 0;
					pit4 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit10;
				--temp;
				if(pit10 == 1 && temp == 0) {
					player2 += pit10 + pit3;
					pit10 = 0;
					pit3 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit11;
				--temp;
				if(pit11 == 1 && temp == 0) {
					player2 += pit11 + pit2;
					pit11 = 0;
					pit2 = 0;
					return false;
				}
			}
			if(temp > 0) {
				++pit12;
				--temp;
				if(pit12 == 1 && temp == 0) {
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

	public boolean checkForWin() {
		if ((pit1 + pit2 + pit3 + pit4 + pit5 + pit6 == 0) || 
				(pit7 + pit8 + pit9 + pit10 + pit11 + pit12 == 0)) {
			return true;
		}
		return false;
	}

	public void newGame() {
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
	
	public void resumeGame(int pit1, int pit2, int pit3,
			int pit4, int pit5, int pit6, int pit7, int pit8,
			int pit9, int pit10, int pit11, int pit12, 
			int player1, int player2) {
		this.pit1 = pit1;
		this.pit2 = pit2;
		this.pit3 = pit3;
		this.pit4 = pit4;
		this.pit5 = pit5;
		this.pit6 = pit6;
		this.pit7 = pit7;
		this.pit8 = pit8;
		this.pit9 = pit9;
		this.pit10 = pit10;
		this.pit11 = pit11;
		this.pit12 = pit12;
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public int endGamePlayer1() {
		int ret = pit1 + pit2 + pit3 + pit4 + pit5 + pit6;
		
		player1 += ret;
		pit1 = 0;
		pit2 = 0;
		pit3 = 0;
		pit4 = 0;
		pit5 = 0;
		pit6 = 0;
		
		return ret;
	}
	
	public int endGamePlayer2() {
		int ret = pit7 + pit8 + pit9 + pit10 + pit11 + pit12;

		player2 += ret;
		pit7 = 0;
		pit8 = 0;
		pit9 = 0;
		pit10 = 0;
		pit11 = 0;
		pit12 = 0;
		
		return ret;
	}
}
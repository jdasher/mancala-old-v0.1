package game;

public class AI {
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

	public void AITurn(BoardModel model) {
		pit1 = model.pit1;
		pit2 = model.pit2;
		pit3 = model.pit3;
		pit4 = model.pit4;
		pit5 = model.pit5;
		pit6 = model.pit6;
		pit7 = model.pit7;
		pit8 = model.pit8;
		pit9 = model.pit9;
		pit10 = model.pit10;
		pit11 = model.pit11;
		pit12 = model.pit12;

		player1 = model.player1;
		player2 = model.player2;
		
		boolean playAgain = true;
		while(playAgain) {
			playAgain = move(model);
		}
	}
	
	private boolean move(BoardModel model) {
		// TODO
		// Write AI algorithm to beat mancala
		// Plays randomly off the time right now
		boolean ret = false;
		long move = System.currentTimeMillis()%6;
		
		System.out.println("AI move: " + (move+1));
		
		if(move+1 == 1) {
			ret = model.movePit7();
		}
		
		if(move+1 == 2) {
			ret = model.movePit8();
		}
		
		if(move+1 == 3) {
			ret = model.movePit9();
		}
		
		if(move+1 == 4) {
			ret = model.movePit10();
		}
		
		if(move+1 == 5) {
			ret = model.movePit11();
		}
		
		if(move+1 == 6) {
			ret = model.movePit12();
		}
		
		
		return ret;
	}
}
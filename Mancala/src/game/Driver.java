package game;

/**
 * @author Jonathan Dasher
 * @version 0.1
 */
public class Driver {
	/** Static MVC variables */
	static BoardModel model = new BoardModel();
	static BoardView view = new BoardView();
	static Controller controller = new Controller();
	
	/**
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		// Linking model to view
		view.setModel(model);
		// Linking model to controller
		controller.setModel(model);
		// Linking view to controller
		controller.setView(view);
	}
}
package guessingGame;
/**
 * This is main method to compile game console.
 * @author supisara
 *
 */
public class Main {
	/** create objects and start the game */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	
	}
}
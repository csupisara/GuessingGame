package Lab1;

import java.util.Scanner;
/**
 * Console of a game
 * @author supisara
 *
 */
public class GameConsole {
	Scanner scan = new Scanner(System.in);
	
	/**
	 * The default constructor. 
	 */
	public GameConsole(){
	}
	
	/**
	 * The play method plays a game using input from a user.
	 * @param game is GuessingGame that declare from the main class.
	 * @return the number that user guess correctly
	 */
	public int play(GuessingGame game){
		String title = "Guessing Game";
		String prompt = "Your guess? ";
		int number = 0;
		boolean guessCheck;

		System.out.println(title);
		System.out.println(game.getHint());

		do{
			System.out.print(prompt);
			number = scan.nextInt();

			guessCheck = game.guess(number);
			System.out.println(game.getHint());
		} while(!guessCheck);

		System.out.println("You used " + game.getCount() + " guesses.");
		return number;
	}
}
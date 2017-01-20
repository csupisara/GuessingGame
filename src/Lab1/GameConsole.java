package Lab1;

import java.util.Scanner;

public class GameConsole {
	Scanner scan = new Scanner(System.in);
	public GameConsole(){

	}
	public int play(GuessingGame game){
		String title = "Guessing Game";
		String prompt = "Your guess?";

		System.out.println(title);
		System.out.println(game.getHint());

		System.out.println(prompt);
		int number = scan.nextInt();

		game.setUpperBound(number);
		game.guess(number);
		game.setCount();
		System.out.println(game.getHint());

		while(!game.guess(number)){
			game.getHint();
			System.out.println(prompt);
			number = scan.nextInt();

			game.setUpperBound(number);
			game.guess(number);
			game.getHint();
			System.out.println(game.getHint());
			game.setCount();

		}
		System.out.println("You used " + game.getCount() + " guesses.");
		return game.getSecret();
	}
}
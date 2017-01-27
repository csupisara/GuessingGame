package lab1;
import java.util.Random; //for random number
/**
 * Game of guessing a secret number.
 * @author supisara
 */
public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count;
	
	/**
	 * The default constructor. 
	 */
	public GuessingGame(){
		/*properties of a guessing game*/
		this.upperBound = 0;
		this.secret = 0;
		this.hint = "";
		this.count = 0;
	}

	/**
	 * Initialize a new game.
	 * @param upperBound is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound){
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound + ".";
		this.count = 0;
	}

	/**
	 * Create a random number between 1 and limit
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit) +1;
	}

	/**
	 * Check whether the number match to the secret or not
	 * @param number is the number that user input
	 * @return a boolean that it match or not
	 */
	public boolean guess(int number){
		if(number == secret){
			count++;
			setHint("Correct. The secret is " + number);
			return true;
		}
		else if(number < secret){	
			count++;
			setHint("Sorry, your guess is too small.");
			return false;
		}
		else{
			count++;
			setHint("Sorry, your guess is too large.");
			return false;
		}
	}
	
	/**
	 * Set the hint
	 * @param hint tell the range of the random number.
	 */
	protected void setHint(String hint){
		this.hint = hint;
	}
	
	/**
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess.
	 */
	public String getHint(){
		return this.hint;
	}
	
	/**
	 * Return a number of count based on all the guesses.
	 * @return number of count based on all the guesses.
	 */
	public int getCount(){
		return count;
	}
}

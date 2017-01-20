package Lab1;
import java.util.Random;

public class GuessingGame {
	private int upperBound;
	private int secret;
	private String hint;
	private int count = 0;

	public GuessingGame(){
	}

	public GuessingGame(int upperBound){
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		this.hint = "I'm thinking of a number between 1 and " + upperBound + ".";
	}

	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit) +1;
	}

	public boolean guess(int number){
		if(number == secret){
			this.hint = "Correct. The secret is " + this.upperBound;
			return true;
		}
		else if(number < secret){	
			this.hint = "Sorry, your guess is too small.";
			return false;
		}
		else{
			this.hint = "Sorry, your guess is too large.";
			return false;
		}
	}
	
	public void setCount(){
		count++;
	}
	
	public int getCount(){
		return count;
	}

	public String getHint(){
		return this.hint;
	}

	protected void setHint(String hint){
		this.hint = hint;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	public int getSecret() {
		return secret;
	}

	public void setSecret(int secret) {
		this.secret = secret;
	}
	
	

}

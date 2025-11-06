/**
 * 
 */
package computerGameMaster;

import java.util.Scanner;

/**
 * 
 */
public class ComputerGameMaster {
	private int number;
	private static int[] bounds = {1,100};
	
	public int getNumber(){
		return number;
	}

	public void generateRandomNumber(){
		// source: https://www.baeldung.com/java-generating-random-numbers
		number = (int) ((Math.random() * (bounds[1] - bounds[0])) + bounds[0]);
	}
	
	/**
	 * @param scnr Scanner object to use for input.
	 * Performs a game on the terminal when called.
	 */
	public void terminalGame(Scanner scnr){
		// start the game by generating a random number
		generateRandomNumber();

		System.out.println("I'm thinking of a number...");

		// set guess to a default number, outside of bounds
		int guess = bounds[0]-1;

		// main game loop - keep going until the scanner hits the number
		while (guess != number) {
			String input = scnr.next();
			// try to parse input
			try {
				guess=Integer.parseInt(input);
			} 
			// if there's a problem...
			catch (NumberFormatException e) {
				System.out.println("Not a number. Try again.");
				continue;
			}
			
			// else, give feedback
			if (guess > bounds[1] || guess < bounds[0]) {
				System.out.println("Out of bounds.");
			}
			else if (guess > number) {
				System.out.println("Too high.");
			}
			else if (guess < number) {
				System.out.println("Too low.");
			}
		}

		// the code reaches here if the guess was hit,
		// ending the loop
		System.out.println("Congratulations! The number was indeed " + number);

	}

	/**
	 * @param args
	 * FOR TESTING ONLY
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerGameMaster gm = new ComputerGameMaster();
		gm.generateRandomNumber();
	
		System.out.println(gm.getNumber());

	}

}

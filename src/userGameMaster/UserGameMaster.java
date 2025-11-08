package userGameMaster;

import java.util.Scanner;

public class UserGameMaster {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min = 1;
		int max = 100;
		int attempts = 0;
		boolean found = false;
		
		System.out.println("Think of a number between 1 & 100.");
		System.out.println("I will try to guess it in 7 attempts. Type 'yes' and enter.");
		
		scanner.nextLine();
		
		while (attempts < 7 && !found) { //Loop that keeps going until the number is guessed or ran out of attempts
			attempts++;
			int computerGuess = min + (max - min) / 2;
			
			System.out.println("My guess is: " + computerGuess);
			System.out.println("Is my guess 'too high', 'too low', or 'correct'?"); //There can be only 3 options
			
			String answer = scanner.nextLine().toLowerCase();
			
			if (answer.equals("correct")) {
				found = true;
				System.out.println("Yes! I guessed your number " + computerGuess + " in " + attempts + " attempts.");
			}
			else if (answer.equals("too high")) {
				max = computerGuess + 1;
			}
			else if (answer.equals("too low")) {
				min = computerGuess - 1;
			}
			else { //Will not let you type anything else except the 3 options that are given to you
				System.out.println("Invalid. Please type 'too high', 'too low', or 'correct'.");
				attempts--;
			}
			if (min > max) { //It will not let you go under 1 or over 100 
				System.out.println("It seems there's an inxonsistency in your answer. Let's try again.");
				min = 1;
				max = 100;
				attempts = 0;
			}
		}
		if (!found) { //Will stop at 7 attempts on guessing your number 
			System.out.println("Oh no, I coundn't guess your number in 7 attempts.");
			
		}
		scanner.close();

	}

}

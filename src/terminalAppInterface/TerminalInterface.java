/**
 * 
 */
package terminalAppInterface;

import computerGameMaster.ComputerGameMaster;
import java.util.Scanner;

/**
 * 
 */
public class TerminalInterface {
	/**
	 * String options for the terminal menu.
	 */
	private static String[] menuOptions = {
		"I (Computer) pick a number",
		"You pick a number"
	};

	/**
	 * Prints the menu options for the terminal app.
	 */
	private static void printMenuOptions(){
		// For each option in field "menuOptions"
		for (int i = 0; i < menuOptions.length; i++) {
			String option = menuOptions[i];

			// Print the index
			System.out.print(i+1);

			// print the option itself
			System.out.println(" ) "+ option);

			// "1 ) Play on this option"
		}

		// Print quit option
		System.out.println("q ) Quit");
	}

	/**
	 * Calls the associated terminal method for the selected option.
	 * @param optionIdx The integer index of the desired game option (-1 refers to quit)
	 * @param scnr Scanner for the game to use.
	 * @return An boolean that signals whether or not to continue the program loop (false -> quit, true -> continue)
	 */
	private static boolean callMenuOption(int optionIdx, Scanner scnr){
		switch (optionIdx) {
			case -1:
				return false;
			case 1:
				ComputerGameMaster comGameMaster = new ComputerGameMaster();
				comGameMaster.terminalGame(scnr);
				break;
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		printMenuOptions();
		boolean result = callMenuOption(scnr.nextInt(), scnr);
		System.out.println();
		System.out.println(result);
	}

}

/**
 * 
 */
package terminalAppInterface;

/**
 * 
 */
public class TerminalInterface {
	/**
	 * String options for the terminal menu.
	 */
	private static String[] menuOptions = {
		"I pick a number",
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
	 * @return An boolean that signals whether or not to continue the program loop (false -> quit, true -> continue)
	 */
	private static boolean callMenuOption(int optionIdx){
		switch (optionIdx) {
			case -1:
				return false;
			case 1:
				
				break;
		}
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMenuOptions();
	}

}

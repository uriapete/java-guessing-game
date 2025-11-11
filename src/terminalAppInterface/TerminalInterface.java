/**
 * 
 */
package terminalAppInterface;

/**
 * 
 */
public class TerminalInterface {
	/*
	 * String options for the terminal menu.
	 */
	private static String[] menuOptions = {
		"I pick a number",
		"You pick a number"
	};

	/*
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
	}

	private static boolean callMenuOption(int optionIdx){
		switch (optionIdx) {
			case 1:
				
				break;
			default:
				throw new AssertionError();
		}
		return false;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMenuOptions();
	}

}

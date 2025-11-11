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

	private static void printMenuOptions(){
		for (int i = 0; i < menuOptions.length; i++) {
			String option = menuOptions[i];
			System.out.print(i+1);
			System.out.println(" ) "+ option);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * 
 */
package computerGameMaster;

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

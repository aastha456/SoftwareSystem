package exc_lab;
/**
 * 
 * A driver class is introduced to test the ArrayProcessor
 *
 */
public class Driver{
	/**
	 * A main method to test the instance of ArrayProcessor
	 * 
	 * @param args command-line argument
	 */

	public static void main(String[] args) {
		
		//creating instance of arrayprocessor and calling its method to get the size of an array provided
		ArrayProcessor ap = new ArrayProcessor();
		int len = ap.getAarrayLength(new String[] {"one", "two", "three"});
		System.out.println("Array length is " + len);
		
		//creating instance of menu class and doing several calls 
		Menu menu = new Menu();
        
		for (int i = 1; i <= 5; i++) {
			try {
				menu.displayMenuOption(i);
			} catch (InvalidOptionException e) {
				System.out.println("Caught exception: " + e.getMessage());
			}
		}

	}

}

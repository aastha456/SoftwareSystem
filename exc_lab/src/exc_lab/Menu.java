package exc_lab;
/**
 * 
 * A class that is introduced to display menu
 *
 */

public class Menu {
	/**
	 * display the selected menu
	 * 
	 * @param opt menu option to be displayed
	 * @throws InvalidOptionException if the menu option is not within the valid range 
	 */
    public void displayMenuOption(int opt) throws InvalidOptionException{
    	if(opt == 1) {
    		System.out.println("Option 1 is selected");
    		
    	}else if (opt == 2){
    		System.out.println("Option 2 is selected");
    	}else if (opt == 3) {
    		System.out.println("Option 3 is selected");
    	}else {
    		throw new InvalidOptionException("Menu option invalid");
    	}
    	
    }


}

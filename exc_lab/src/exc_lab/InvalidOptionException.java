package exc_lab;
/**
 * 
 * Custom exception class for handling errors
 *
 */
public class InvalidOptionException extends Exception {
	/**
	 * Constructs the InvaidOptionException with the specified detailed message
	 * 
	 * @param message the detailed message is displayed
	 */
	public InvalidOptionException(String message) {
		super(message);
	}


}

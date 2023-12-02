package Email;
/**
 * 
 * Creating class to test the EmailStore class
 *
 */
public class EmailDriver {
	/**
	 * Main method of the entry point 
	 * @param args makes multiple calls of the method of testing
	 */
	public static void main (String[] args) {
		//creating an instance of email store
		EmailStore emailStore = new EmailStore();
		
		System.out.println(emailStore.addEmail("harry@yahoo.com"));
		System.out.println(emailStore.addEmail("ciara@gmail.com"));
		System.out.println(emailStore.addEmail("harry@yahoo.com"));
		System.out.println(emailStore.addEmail("johnny@yahoo.com"));
		
		emailStore.displayEmails();
		//Testing wordcounter
        WordCounter wc = new WordCounter();
		
		wc.addSentence("This sentence has the word has in it twice ");
		wc.outputResults();

		
	}

}

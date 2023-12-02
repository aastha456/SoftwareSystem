package Email;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * A class which is going to manipulate a number of unique of String type variable
 *
 */
public class EmailStore {
	//set to store unique email address
       private Set<String> emailAddresses = new HashSet<String>();
       
       /**
        * add given email address to the store
        * 
        * @param email email address to be added
        * @return true if email address was added 
        */
       public boolean addEmail(String email) {
    	   return emailAddresses.add(email);
    	   
       }
       /**
        * checks whether the email is already stored
        * 
        * @param email email address to be check
        * @return true if email address is already stored
        */
       public boolean hasEmail(String email) {
		return emailAddresses.contains(email);
       }
       
       /**
        * displays the stored email
        */
       public void displayEmails() {
    	   System.out.println("Sorted email address: ");
    	   for(String email : emailAddresses) {
    		   System.out.println(email);
    	   }
    		   
    	   
       }
}

package Manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Creating a class called namemanager which manages list of names 
 * 
 *
 */
public class NameManager {
	//add attribute that stores a list of string type element 
	List<String> names = new ArrayList<String>();
	/**
	 * Adds a name to the list
	 * @param name name is added in the list 
	 */
	public void addName(String name) {
		names.add(name);
	}
	/**
	 * prints all the name in the list 
	 */
	public void printNames() {
		for (int i = 0; i < names.size(); i++)
		{
            System.out.println(names.get(i));
        }
	}
	/**
	 * removes long name in the list 
	 */
	public void removeLongNames() {
		Iterator<String> longnames= names.iterator();
		
		while(longnames.hasNext()) {
			
			if(longnames.next().length() > 15) {
				longnames.remove();
			}
			
		}
		
	}
	
	
}

package Manager;
/**
 * 
 * Creating a driver class 
 *
 */
public class Driver {
    /**
     * creating instance of driver class
     * 
     * @param args the command-line arguments
     */
	public static void main(String[] args) {
	
			NameManager manager = new NameManager();
			manager.addName("M.Mickleson");
			manager.addName ("Johnua Taylor Biggs");
			manager.addName ("P.Smith");
			manager.addName ("Peter Jonathan Smythton");
			manager.addName ("P.Thompson");
			
			System.out.println("Initial list of names: ");
			manager.printNames();
			manager.removeLongNames();
			manager.printNames();
			//Creating instance of number sorter
			NumberSorter sorter = new NumberSorter();
			sorter.sort(new int [] {1,9,2,3,10,8,12,1, 99, 2, 43, 68, 109, 0}, true);
			
			sorter.sort(new int [] {1,2,3,4}, false);
			
			sorter.sort(new int [] {4,3,2,1}, false);


		}


	}



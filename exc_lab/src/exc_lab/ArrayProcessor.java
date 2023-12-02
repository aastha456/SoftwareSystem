package exc_lab;
/**
 * 
 * Arrayprocessor class is introduced for processing arrays
 *
 */
public class ArrayProcessor {
	/**
	 * Procesed the length of array
	 * 
	 * @param a the array to be processed
	 * @return the length of array
	 */
	public int getAarrayLength(Object [] a) {
		int count = 0;
		while (count < a.length) {
			Object t = a[count];
			count++;
		}
		return count;
	}
	
	
	
	
}

package Lab;

import java.util.Arrays;
/**
 * 
 * A class is created for performing statistical operations of array of integers.
 */


public class Stats {

    int[] data; // array to store integer value
	int count; // number of elements stored in an array

	/**
	 * Adds the value to the array
	 * 
	 * @param value adds the value to array
	 */
	public void addValue(int value) {
         data[count] = value;
         count++;
         }
	/**
	 * 
	 * @return length of data
	 */

	public int getCount() {
     return data.length;
	}
	/**
	 * Getting the maximum value 
	 * 
	 * @return the maximum value
	 */

	public int getA() {

		int max = data[0];	

		for (int i = 1; i < data.length; i++) {
            if (data[i] > max)				
            max = data[i];		
           }

		return max;
	}
	/**
	 * Getting the minimum value
	 * 
	 * @return the minimum value
	 */

	public int getB() {
		int min = data[0]; 

	for (int i = 1; i < data.length; i++) {

		if (data[i] < min)
			min = data[i];
		}

		return min;
	}
	/**
	 * getting the total of all element in the array
	 * 
	 * @return the total element in the array
	 */
	
	public int getTotal() {
		
		int total = 0;
		
		// total all values within the array
		for (int i = 0; i < data.length; i++) {
			total += data[i];
		}		return total;
	}
	/**
	 * Getting the average of all elements
	 * 
	 * @return the average of all elements
	 */
	
	public double get() {
		
		int x = 0;
		   for (int i = 0; i < data.length; i++) {
			x += data[i];
		}
		
		double y = x/(double)data.length;
		
        return y;
	}
	/**
	 * Getting the average of all the elements 
	 * 
	 * @return the average of all elements 
	 */
	public double getAverage() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += data[i];
        }
        return (double) sum / count;
    }
	
	/**
	 * returns the representative of data string
	 * 
	 * @return the representative of string
	 */

	@Override
	public String toString() {
		return Arrays.toString(data);
	}
	
    /**
     * Stats object is constructed in given capacity 
     * 
     * @param capacity capacity of stats object
     */
	public Stats(int capacity) {
		data = new int[capacity];
	}

}

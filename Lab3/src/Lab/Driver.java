package Lab;

import java.util.Random;
/**
 * A driver class is created to test the Stats class
 *
 */

public class Driver {
	public static void main(String[] args) {final int VALUES = 10;

		Stats stats = new Stats(VALUES);

Random random = new Random();
		
		for (int i = 0; i < VALUES; i++) {
			
			stats.addValue(random.nextInt(100));
		}

        System.out.println("Datas stored : ");
		System.out.println(stats);
		
        System.out.println("Average = " + stats.getAverage());
		System.out.println("Count = " + stats.getCount());
	    System.out.println("Total = " + stats.getTotal());
		System.out.println("Minimum value = " + stats.getB());
        System.out.println("Maximum value = " + stats.getA());
	}}
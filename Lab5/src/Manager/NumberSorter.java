package Manager;

import java.util.Stack;
/**
 * 
 * A numbersorter class is introduced to implement a simple sorting algorithm
 *
 */
public class NumberSorter {
	/**
	 * sort an array using stack
	 * 
	 * @param numbers the array of number to be sorted
	 * @param ascending A boolean flag indicating whether to sort in ascending order
	 */
	
	public void sort(int [] numbers, boolean ascending)
	{
		// The source stack, from which the numbers are popped
		Stack<Integer> srcStack = new Stack<Integer>();
		
		// The dest stack, to which the numbers are pushed
		Stack<Integer> destStack = new Stack<Integer>();
		
		// Add the initial array of numbers to the source stack.
		for (int number : numbers)
			srcStack.push(number);
		
		while(srcStack.size() > 0)
		{
			int next = srcStack.pop();
			
			if (ascending)
			{
				while(destStack.size() > 0 && destStack.peek() > next)
				{
					srcStack.push(destStack.pop());
				}
				destStack.push(next);
			}
			else
			{
				while(destStack.size() > 0 && destStack.peek() < next)
				{
					srcStack.push(destStack.pop());
				}
				destStack.push(next);
			}
		}
		//print sorted number
		for (int i: destStack)
		{
			System.out.println(i);
		}

	}
	}




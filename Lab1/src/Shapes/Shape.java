package Shapes;

/**
 * Shape class. Designed to act as an abstract base class to other shapes.
 * class marked as 'abstract' since it is not designed to be instantiated directly
 * 
 */
abstract class Shape {

	/**
	 * The number of sides within the shape.
	 */
	private int sides;
	
	/**
	 * Gets the number of sides within the shape.
	 * 
	 * @return returns the number of sides within the shape.
	 */
	public int getSides()
	{
		return sides;
	}
	
	/**
	 * Sets the number of sides within  the shape.
	 *	
	 * @param sides the number of sides within the shape.
	 */
	public void setSides(int sides)
	{
		this.sides = sides;
	}
	
	/**
	 * Gets the area of the shape.	
	 * 
	 * @return returns the area of the given shape.
	 */
	abstract public double getArea();
	
	/**
	 * Parameterized Constructor.
	 * 
	 * @param sides the number of sides within the shape.
	 */
	Shape(int sides)
	{
		this.sides = sides;
	}	
}


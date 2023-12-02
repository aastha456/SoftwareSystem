package Shapes;
/**
 * 
 * A circle class that extends shape
 *
 */
public class Circle extends Shape{
	
	/**
	 * The radius of the Circle.
	 */
	private int radius;
	
	/**
	 * This method gets the value of the radius of the Circle.
	 * 
	 * @return returns the value of the radius of the Circle.
	 */
	public int getRadius()
	{
		return radius;
	}
	
	/**
	 * This method sets the value of the radius of the Circle.
	 * 
	 * @param radius the radius of the circle.
	 */
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	
	/**
	 * Constructor
	 * 
	 * @param sides the number of sides within a circle.
	 */
	public Circle(int sides) {
		super(sides);
		
	}
	
	/**
	 * This method gets the value of the are of the Circle.
	 * This method is abstract method in super-class and is implemented in Circle class.
	 * 
	 * @return returns the area of circle.
	 */
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/**
	 * Returns a string representation of the Circle object, including its radius,number of sides, 
	 * and its area.
	 * 
	 * @return A string representation of the Circle object.
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Radius = " + radius + ", Sides = " + this.getSides() + ", area of circle = \n\n" + this.getArea();
	}

}

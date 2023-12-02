package Shapes;
/**
 * 
 * A rectangle class is introduced that extends shape class
 *
 */
public class Rectangle extends Shape{
	/**
	 * The width of the rectangle.
	 */
	private int width;
	
	/**
	 * The height of the rectangle.
	 */
	private int height;

	/**
	 * Constructor
	 * 
	 * Sets the number of sides for Rectangle object by passing the sides value to the super-class Shape.
	 * 
	 * @param sides the number of sides within the Rectangle Shape.
	 */
	public Rectangle(int sides) {
		super(sides);
	}
	
	/**
	 * Gets the width of the Rectangle.
	 * 
	 * @return returns the value of the width of the Rectangle.
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the width of the Rectangle.
	 * 
	 * @param width the value of the width of the Rectangle.
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Gets the height of the Rectangle.
	 * 
	 * @return returns the value of the height of the Rectangle.
	 */
	public int getHeight() {
		return height;
	}

	
	/**
	 * Sets the height of the Rectangle.
	 * 
	 * @param height the value of the height of the Rectangle.
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Gets the value of the are of the rectangle.
	 * This method is abstract method in super-class and is implemented in Rectangle class.
	 * 
	 * @return returns the width and height multiplied.
	 */
	@Override
	public double getArea() {
		return width * height;
	}
	
	/**
	 * Returns a string representation of the Rectangle object, including its width, height,
	 * number of sides, and its area.
	 * 
	 * @return A string representation of the Rectangle object.
	 */
	@Override
	public String toString() {
		return "width = " + width + ", height = " + height + ", sides = " + this.getSides() + ", area of rectangle = \n\n" + this.getArea();
	}
	

}

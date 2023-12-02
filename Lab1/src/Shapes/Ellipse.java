package Shapes;
/**
 * This class represents an ellipse which extends rectangle class
 *
 */
public class Ellipse extends Rectangle{
	/**
	 * Constructor.
	 * 
	 * @param sides the number of sides within Ellipse.
	 */
	public Ellipse(int sides) {
		super(sides);
	}
	
	/**
	 * This method sets the radius length of the Ellipse.
	 * 
	 * @param radiusLength an integer value indicating the radius length of the ellipse (x axis).
	 */
	public void setRadiusLength(int radiusLength) {
		super.setWidth(radiusLength);
	}
	
	/**
	 * This method sets the radius height of the Ellipse.
	 * 
	 * @param radiusHeight an integer value indicating the radius height of the ellipse (y axis).
	 */
	public void setRadiusHeight(int radiusHeight) {
		super.setHeight(radiusHeight);
	}
	
	/**
	 * This method gets the area of the Ellipse.
	 * This method is abstract method in super-class and is implemented in Ellipse class.
	 * 
	 * @return returns the area of the Ellipse.
	 */
	@Override
	public double getArea() {
		return Math.PI * super.getWidth() * super.getHeight();
	}
	
	/**
	 * Returns a string representation of the Ellipse object, including its radiusLength, radiusHeight,
	 * number of sides, and its area.
	 * 
	 * @return A string representation of the Ellipse object.
	 */
	@Override
	public String toString() {
		return "Radius length = " + getWidth() + ", Radius height = " + getHeight() + ", sides = " + getSides() + ", Area of ellipse = \n\n" + getArea();
	}
}

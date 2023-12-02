package Shapes;
/**
 * It demonstrates the variety of usage of shape classes
 * 
 *
 */
public class Driver {
	public static void main(String[] args) {
		// Instantiating Rectangle class.
				Rectangle rectangle1 = new Rectangle(4);
				
				// Setting up the attributes of Rectangle.
				rectangle1.setWidth(9);
				rectangle1.setHeight(10);
				System.out.println(rectangle1.getArea());
				System.out.println(rectangle1.getSides());
				System.out.println(rectangle1.toString());
				
				
				Rectangle rectangle2 = new Rectangle(4);
				rectangle2.setWidth(6);
				rectangle2.setHeight(9);
				System.out.println(rectangle2.getArea());
				System.out.println(rectangle2.getSides());
				System.out.println(rectangle2.toString());
				
				Circle circle = new Circle(0);
				circle.setRadius(20);
				System.out.println(circle.getArea());
				System.out.println(circle.getSides());
				System.out.println(circle.toString());
				
				Circle circle2 = new Circle(0);
				circle2.setRadius(20);
				System.out.println(circle2.getArea());
				System.out.println(circle2.getSides());
				System.out.println(circle2.toString());
				
				
				Ellipse ellipse = new Ellipse(0);
				ellipse.setRadiusLength(8);
				ellipse.setRadiusHeight(16);
				System.out.println(ellipse.getArea());
				System.out.println(ellipse.getSides());
				System.out.println(ellipse.toString());		
				
				Ellipse ellipse2 = new Ellipse(0);
				ellipse2.setRadiusLength(9);
				ellipse2.setRadiusHeight(13);
				System.out.println(ellipse2.getArea());
				System.out.println(ellipse2.getSides());
				System.out.println(ellipse2.toString());	
		
        

	}

}

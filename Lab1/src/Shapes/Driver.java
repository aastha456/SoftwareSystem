package Shapes;

public class Driver {
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(7.0, 6.0);
        Rectangle rectangle2 = new Rectangle(3.0, 7.0);
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(5.0);
        Ellipse ellipse1 = new Ellipse(6.0, 4.0);
        Ellipse ellipse2 = new Ellipse(8.0, 3.0);

        
        System.out.println("Area of rectangle1: " + rectangle1.getArea());
        System.out.println("Area of rectangle2: " + rectangle2.getArea());


        rectangle1.setWidth(6.0);
        rectangle1.setHeight(8.0);


        System.out.println("Updated area of rectangle1: " + rectangle1.getArea());
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Area of ellipse1: " + ellipse1.getArea());
        System.out.println("Area of ellipse2: " + ellipse2.getArea());
        

	}

}

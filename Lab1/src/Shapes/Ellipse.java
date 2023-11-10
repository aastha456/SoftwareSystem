package Shapes;

public class Ellipse extends Rectangle{
	public Ellipse(double width, double height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        // Calculate the area of an ellipse using the formula π * (width/2) * (height/2)
        return Math.PI * (getWidth() / 2) * (getHeight() / 2);
    }
    @Override
    public String toString() {
        return "Ellipse - Width: " + getWidth() + ", Height: " + getHeight() + ", Area: " + getArea();
    }

}

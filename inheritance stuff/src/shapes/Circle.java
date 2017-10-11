package shapes;

public class Circle extends Shape
{
	private double radius;
	
	public Circle(double radius)
	{
		super("Circle");
		
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double area()
	{
		return Math.PI * radius * radius;
	}
	
	public String toString()
	{
		return super.toString() + ", radius = " + radius;
	}
}

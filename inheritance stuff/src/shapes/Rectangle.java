package shapes;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		super("rectangle");
		
		this.length = length;
		this.width = width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	public double area()
	{
		return length * width;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public String toString()
	{
		//print the name of this shape and then the length/width
		String output = super.toString(); //retrieve the toString() result from the parent class
		output += ", width = " + width + ", length = " + length;
		
		return output;
	}
}









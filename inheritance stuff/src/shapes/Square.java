package shapes;

public class Square extends Rectangle
{
	//no fields here!?!?!
	
	public Square(double side)
	{
		super(side, side);
	}

	public void setLength(double length)
	{
		super.setLength(length);
		super.setWidth(length);
	}

	public void setWidth(double width)
	{
		super.setLength(width);
		super.setWidth(width);
	}
	
	public String toString()
	{
		return "Shape: square, width = " + getWidth() + 
				", length = " + getLength();
	}
}

package driver;

import shapes.*;

public class TestShapes 
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle(10, 20);
		Square square = new Square(4.0);
		Circle circle = new Circle(10.0);
		
		//group together our shapes
		
		Shape[] shapes = {rect, square, circle};
		
		//loops and do stuff
		
		for (int i = 0; i < shapes.length; i++)
		{
			System.out.println(shapes[i].getName());
			System.out.println("Area: " + shapes[i].area());
		}
	}
}

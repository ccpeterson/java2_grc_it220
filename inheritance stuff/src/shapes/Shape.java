package shapes;

public abstract class Shape 
{
	//store "triangle", "square", "rhombus", ...
	private String name;
	
	public Shape(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract double area();
	
	public String toString()
	{
		return "Shape: " + name;
	}
}


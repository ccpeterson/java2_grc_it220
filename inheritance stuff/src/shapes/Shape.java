package shapes;

public abstract class Shape 
{
	//store "triangle", "square", "rhombus", ...
	private Type name;
	
	public Shape(Type name)
	{
		this.name = name;
	}
	
	public Type getName()
	{
		return name;
	}
	
	public abstract double area();
	
	public String toString()
	{
		return "Shape: " + name;
	}
}


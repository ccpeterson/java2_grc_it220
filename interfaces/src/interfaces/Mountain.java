package interfaces;

public class Mountain implements Viewable
{
	//fields
	private double height;
	private String location;
	//constructors
	public Mountain(double height, String location)
	{
		this.height = height;
		this.location = location;
	}	
	//methods
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public void view()
	{
		System.out.println("You view a mountain "+ height + " tall");
	}
	public String toString()
	{
		return location;
	}

}

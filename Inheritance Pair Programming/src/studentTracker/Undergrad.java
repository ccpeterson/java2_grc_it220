package studentTracker;

public class Undergrad extends Student
{
	//Fields
	private String degreeType;
	
	//Constructor
	public Undergrad(int newID, String newFName, String newLName, String newMajor, String newDegreeType)
	{
		super(newID , newFName , newLName , newMajor);
		degreeType = newDegreeType;		
	}
	public String getDegreeType()
	{
		return degreeType;
	}
	
	public String toString()
	{
		return (super.toString()+ " " + degreeType);
	} 
}


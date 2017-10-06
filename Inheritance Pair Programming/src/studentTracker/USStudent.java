package studentTracker;

public class USStudent extends Undergrad
{
	private String SSN;
	
	public USStudent(int newID, String newFName, String newLName, String newMajor, String newDegreeType, String newSSN)
	{
		super(newID , newFName , newLName , newMajor, newDegreeType);
		SSN = newSSN;
	}
	
	public String getSSN()
	{
		return SSN;
	}
	public String toString()
	{
		return (super.toString()+ " " + SSN);
	}
}

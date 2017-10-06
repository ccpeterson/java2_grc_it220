package studentTracker;

public class ForeignStudent extends Undergrad
{
	private String visa;
	private String originCountry;
	
	public ForeignStudent(int newID, String newFName, String newLName, String newMajor, String newDegreeType, String newVisa, String newOriginCountry)
	{
		super(newID , newFName , newLName , newMajor, newDegreeType);
		visa = newVisa;
		originCountry = newOriginCountry;
	}
	
	public String getVisa()
	{
		return visa;
	}
	
	public String getOriginCountry()
	{
		return originCountry;
	}
	
	public String toString()
	{
		return (super.toString()+ " " + visa + " " + originCountry);
	}
}

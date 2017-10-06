package studentTracker;

public class Student 
{
	//fields
	private int id;
	private String fName;
	private String lName;
	private String major;
	
	//Constructor
	
	/**
	 * Creates a student with the inputed parameters
	 * @param newID The students ID#
	 * @param newFName The students first name
	 * @param newLName The students last name
	 * @param newMajor The students major
	 */
	public Student(int newID, String newFName, String newLName, String newMajor)
	{
		id = newID;
		fName = newFName;
		lName = newLName;
		major = newMajor;		
	}
	
	//methods
	
	public int getID()
	{
		return id;
	}
	
	public String getFullName()
	{
		return (fName + " " + lName);
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String toString()
	{
		return (id + " " + fName + " " + lName + " " + major);
	} 
}

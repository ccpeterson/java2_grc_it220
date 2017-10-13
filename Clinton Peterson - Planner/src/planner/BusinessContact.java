package planner;

public class BusinessContact extends Contact
{
	//fields
	private String company;
	private String position;
	private String phoneNumber;
	
	//constructor
	public BusinessContact (String newFirstName, String newLastName, String newEmail, Boolean newGender, String newCompany, String newPosition, String newPhoneNumber)
	{
		super(newFirstName, newLastName, newEmail, newGender);
		company = newCompany;
		position = newPosition;
		phoneNumber = newPhoneNumber;
	}
	
	//methods
	public String getCompany()
	{
		return company;
	}
	
	public String getPosition()
	{
		return position;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void printContact()
	{
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		return company;
	}
}

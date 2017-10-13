package planner;

public class Contact
{
	//fields
	private String firstName;
	private String lastName;
	private String email;
	private Boolean gender;
	
	//constructor
	public Contact(String newFirstName, String newLastName, String newEmail, Boolean newGender)
	{
		firstName = newFirstName;
		lastName = newLastName;
		email = newEmail;
		gender = newGender;
	}
	
	//methods
	public String getName()
	{
		return (firstName + " " + lastName);
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public Boolean getGender()
	{
		return gender;
	}
	
	public void printContact()
	{
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		return firstName;
	}
}

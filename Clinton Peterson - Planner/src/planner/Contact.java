package planner;

/**
 * Project: Planner Assignment
 * Contact.java
 * 10/13/17
 * @author Clinton Peterson 
 */

public class Contact
{
	//fields
	private String firstName;
	private String lastName;
	private String email;
	private Boolean gender;
	
	//constructor
	/**
	 * Constructs a Contact.
	 * @param newFirstName The first name of the contact. 
	 * @param newLastName The last name of the contact.
	 * @param newEmail The email of the contact.
	 * @param newGender The gender of the contact, true for male, false for female.
	 */
	public Contact(String newFirstName, String newLastName, String newEmail, Boolean newGender)
	{
		firstName = newFirstName;
		lastName = newLastName;
		email = newEmail;
		gender = newGender;
	}
	
	//methods
	/**
	 * Gets the name of the contact.
	 * @return A string that is the first and last name combined with a space.
	 */
	public String getName()
	{
		return (firstName + " " + lastName);
	}
	
	/**
	 * Returns the email of the contact.
	 * @return The email of the contact.
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * Returns the gender of the contact.
	 * @return true is male, false is female.
	 */
	public Boolean getGender()
	{
		return gender;
	}
	
	/**
	 * Prints the results of toString to the console
	 */
	public void printContact()
	{
		System.out.println(this.toString());
	}
	
	/**
	 * Combines all the fields and returns a string.
	 * @return A string containing the name, email and gender of the contact. 
	 */
	public String toString()
	{
		//taking the gender boolean and setting a string appropriately 
		String printGender;
		if (gender == true)
		{
			printGender = "male";
		}
		else if (gender == false)
		{
			printGender = "female";
		}
		else
		{
			printGender = "unknown";
		}
		
		return (firstName + " " + lastName + " (" + email + "), " + printGender);
	}
}
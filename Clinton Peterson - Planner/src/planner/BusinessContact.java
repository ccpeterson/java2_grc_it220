package planner;

/**
 * Project: Planner Assignment
 * BusinessContact.java
 * 10/13/17
 * @author Clinton Peterson 
 */

public class BusinessContact extends Contact
{
	//fields
	private String company;
	private String position;
	private String phoneNumber;
	
	//constructor
	/**
	 * Constructs a new business contact 
	 * @param newFirstName The first name of the contact. 
	 * @param newLastName The last name of the contact.
	 * @param newEmail The email of the contact.
	 * @param newGender The gender of the contact, true for male, false for female.
	 * @param newCompany The company the contact works for
	 * @param newPosition The contact's position 
	 * @param newPhoneNumber The contact's phone number
	 */
	public BusinessContact (String newFirstName, String newLastName, String newEmail, Boolean newGender, String newCompany, String newPosition, String newPhoneNumber)
	{
		super(newFirstName, newLastName, newEmail, newGender);
		company = newCompany;
		position = newPosition;
		phoneNumber = newPhoneNumber;
	}
	
	//methods
	/**
	 * Returns the contacts company.
	 * @return The contacts company.
	 */
	public String getCompany()
	{
		return company;
	}
	
	/**
	 * Returns the contact's position.
	 * @return The contact's position.
	 */
	public String getPosition()
	{
		return position;
	}
	
	/**
	 * Returns the contact's phone number.
	 * @return The contact's phone number.
	 */
	public String getPhoneNumber()
	{
		return phoneNumber;
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
	 * @return A string containing the name, email, gender, company, position, and phone number of the contact. 
	 */
	public String toString()
	{
		return ("Business Contact: " + super.toString() + ", " + company + " (" + position + "), " + phoneNumber);
	}
}
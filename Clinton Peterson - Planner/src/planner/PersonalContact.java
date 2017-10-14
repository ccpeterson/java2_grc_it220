package planner;

import java.time.LocalDateTime;

/**
 * Project: Planner Assignment
 * PersonalContact.java
 * 10/13/17
 * @author Clinton Peterson 
 */

public class PersonalContact extends Contact
{
	//fields
	private LocalDateTime birthDate;
	private String address;
	
	
	//constructor
	/**
	 * 
	 * @param newFirstName The first name of the contact. 
	 * @param newLastName The last name of the contact.
	 * @param newEmail The email of the contact.
	 * @param newGender The gender of the contact, true for male, false for female.
	 * @param newBirthDate The birthdate of the contact in LocalDateTime format.
	 * @param newAddress The contact's address.
	 */
	public PersonalContact (String newFirstName, String newLastName, String newEmail, Boolean newGender, LocalDateTime newBirthDate, String newAddress)
	{
		super(newFirstName, newLastName, newEmail, newGender);
		birthDate = newBirthDate;
		address = newAddress;
	}
	
	//methods
	/**
	 * Returns the contact's birthdate.
	 * @return The contact's birthdate.
	 */
	public LocalDateTime getBirthDate()
	{
		
		return birthDate;
	}
	
	/**
	 * Returns the contact's address.
	 * @return The contact's address.
	 */
	public String getAddress()
	{
		return address;
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
		return ("Personal Contact: " + super.toString() + ", " + birthDate.toLocalDate() + ", " + address); 
	}
}
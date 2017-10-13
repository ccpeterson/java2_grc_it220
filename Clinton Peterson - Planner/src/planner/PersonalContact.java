package planner;

import java.time.LocalDateTime;

public class PersonalContact extends Contact
{
	//fields
	private LocalDateTime birthDate;
	private String address;
	
	
	//constructor
	public PersonalContact (String newFirstName, String newLastName, String newEmail, Boolean newGender, LocalDateTime newBirthDate, String newAddress)
	{
		super(newFirstName, newLastName, newEmail, newGender);
		birthDate = newBirthDate;
		address = newAddress;
	}
	
	//methods
	public LocalDateTime getBirthDate()
	{
		
		return birthDate;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void printContact()
	{
		System.out.println(this.toString());
	}
	
	public String toString()
	{
		return ("Personal Contact: " + super.toString() + ", " + birthDate.toLocalDate() + ", " + address); 
	}
}

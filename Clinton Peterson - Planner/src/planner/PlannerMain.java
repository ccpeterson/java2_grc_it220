package planner;

import java.util.Scanner;
import java.time.LocalDateTime;

public class PlannerMain
{	
	//initializes a scanner for console input
	private static Scanner console = new Scanner(System.in);
	
	private static Contact[] contacts = new Contact[6];
	
	public static void main(String[] args)
	{	
		// wrote a method to keep the contact info in the main but down at the bottom
		fillContacts();
		
		//standard menu loop
		boolean done = false;
		while (!done)
		{
			//display the menu choices
			showMenu();
			//get their choice
			int choice = console.nextInt();
			//run appropriate program
			if (choice == 1)
			{
				printContacts();
			}
			else if (choice == 2)
			{
				printStats();
			}
			else if (choice == 3)
			{
				done = true;
			}
			else
			{
				System.out.println("Please choose one of listed options");
			}
		}
		console.close();
	}	
	
	private static void fillContacts()
	{		 
		contacts[0] = new PersonalContact
				("Joe", "Smith", "jsmith@gmail.com", true, LocalDateTime.of(2010, 3, 16, 00, 00), "100 Evergreen Ave, Seattle, WA, 98999");
		contacts[1] = new PersonalContact
				("Lawrence", "Williams", "lolawrence@yahoo.com", true, LocalDateTime.of(2000, 10, 1, 00, 00), "1501 1st St, Tacoma, WA 98100");
		contacts[2] = new PersonalContact
				("Rachel", "Garcia", "gargar@comcast.net", false, LocalDateTime.of(1996, 2, 20, 00, 00), "12 Forest Drive, Los Angelos, CA, 99301");
		contacts[3] = new BusinessContact
				("Gregory", "Smith", "gregsmith@livemail.com", true, "Amazon.com", "Sales Representative", "222-333-4444");
		contacts[4] = new BusinessContact
				("Susie", "Adams", "sadams@gmail.com", false, "Group Health", "Database Administrator", "333-444-5555");
		contacts[5] = new BusinessContact
				("Jerome", "Bradley", "bradleyj@yahoo.com", true, "Costco", "Software Developer", "555-666-7777");		
	}

	private static void printContacts() 
	{
		for (int i = 0; i < contacts.length; i++)
		{
			contacts[i].printContact();
		}
		System.out.println();//new line
	}

	private static void printStats()
	{
		int personalCount = 0;
		int businessCount = 0;
		int maleCount = 0;
		int femaleCount = 0;
		
		for (int i = 0; i < contacts.length; i++)
		{
			if (contacts[i].getClass().getSimpleName().contains("Personal"))
			{
				personalCount++;
			}
			else if (contacts[i].getClass().getSimpleName().contains("Business"))
			{
				businessCount++;
			}
			if (contacts[i].getGender() == true)
			{
				maleCount++;
			}
			if (contacts[i].getGender() == false)
			{
				femaleCount++;
			} 
		}		
		
		System.out.println("Number of contacts: " + contacts.length);
		System.out.println("Number of personal contacts: " + personalCount);
		System.out.println("Number of business contatcs: " + businessCount);
		System.out.println("Number of male contacts: " + maleCount);
		System.out.println("Number of female contacts: " + femaleCount);
		System.out.println();//new line		
	}

	private static void showMenu()
	{
		System.out.println("Welcome to the planner!");
		System.out.println("1 - Print planner contacts");
		System.out.println("2 - Print statistics");
		System.out.println("3 - exit");
		System.out.println();//new line
	}
}
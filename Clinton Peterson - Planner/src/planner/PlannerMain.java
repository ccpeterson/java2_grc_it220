package planner;

import java.util.Scanner;
import java.time.LocalDateTime;

public class PlannerMain
{	
	//initializes a scanner for console input
	private static Scanner console = new Scanner(System.in);
			
	public static void main(String[] args)
	{	
		fillContacts();
		boolean done = false;
		while (!done)
		{
			//display a menu for the user
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
		Contact[] contacts = new Contact[6]; 
		contacts[0] = new PersonalContact
				("Joe", "Smith", "jsmith@gmail.com", true, LocalDateTime.of(2010, 3, 16, 00, 00), "100 Evergreen Ave, Seattle, WA, 98999");
		contacts[1] = new PersonalContact
				("Lawrence", "Williams", "lolawrence@yahoo.com", true, LocalDateTime.of(2000, 10, 1, 00, 00), "1501 1st St, Tacoma, WA 98100");
		contacts[2] = new PersonalContact
				("Rachel", "Garcia", "gargar@comcast.net",false, LocalDateTime.of(1996, 2, 20, 00, 00), "12 Forest Drive, Los Angelos, CA, 99301");
		contacts[3] = new BusinessContact
				("Gregory", "Smith", "gregsmith@livemail.com", true, "Amazon.com", "Sales Representative", "222-333-4444");
		contacts[4] = new BusinessContact
				("Gregory", "Smith", "gregsmith@livemail.com", true, "Amazon.com", "Sales Representative", "222-333-4444");
		contacts[5] = new BusinessContact
				("Gregory", "Smith", "gregsmith@livemail.com", true, "Amazon.com", "Sales Representative", "222-333-4444");		
	}

	private static void printContacts() 
	{
		System.out.println("printing contacts");		
	}

	private static void printStats()
	{
		System.out.println("printing stats");
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
package random;

import java.util.Random;
import java.util.Scanner;

public class RandomMain {

	private static final int DICE_TYPE = 6;
	
	private static Scanner console = new Scanner(System.in);
	private static Random hat = new Random();
	
	public static void main(String[] args)
	{		
		boolean done = false;
		while (!done)
		{
			//display a menu for the user
			showMenu();
			//get their choice
			int choice = console.nextInt();
			
			if (choice == 1)
			{
				colorMenu();
				int colorChoice = console.nextInt();
				if (colorChoice == 1)
				{
					randomColor();
				}
				else if (colorChoice == 2)
				{
					randomRGB();
				}
				else if (colorChoice == 3)
				{
					randomGray();				
				}
				else
				{
					System.out.println("choose better next time");
				}
			}
			else if (choice == 2)
			{
				coinFlip();
			}
			else if (choice == 3)
			{
				randomArray();
			}
			else if (choice == 4)
			{
				done = true;
			}
			else
			{
				System.out.println("choose better");
			}
		}
		console.close();
	}
	
	private static void showMenu()
	{
		System.out.println("Welcome to the thing, please pick something from the menu.");
		System.out.println("1 - Create a random color");
		System.out.println("2 - Flip a coin");
		System.out.println("3 - Generate an array of random numbers");
		System.out.println("4 - exit");
		System.out.println();//new line
	}
	private static void colorMenu()
	{
		System.out.println("Welcome to the thing, please pick something from the menu.");
		System.out.println("1 - Get a random color from my list");
		System.out.println("2 - Generate a random RGB color");
		System.out.println("3 - Generate a random grayscale color");
		System.out.println();//new line
	}
	private static void coinFlip()
	{		
		System.out.println("Rolling a dice");
		int number = hat.nextInt(DICE_TYPE) + 1;
		System.out.println("You rolled a "+number);
		System.out.println();//new line
	}
	private static void randomArray()
	{
		System.out.println("how many dice?");
		int numDice = console.nextInt();
		
		
	}
	private static void randomColor()
	{
		System.out.println("snake eyes");
		while (true)
		{			
			int die1 = hat.nextInt(DICE_TYPE) + 1;
			int die2 = hat.nextInt(DICE_TYPE) + 1;
			
			System.out.println("You rolled a " + die1 + " and a "+ die2);
			
			if (die1 + die2 ==2)
			{
				break;				
			}
		}
	}
	private static void randomRGB()
	{
		
	}
	private static void randomGray()
	{
		
	}
}

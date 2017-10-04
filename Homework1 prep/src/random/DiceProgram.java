package random;

import java.util.Random;
import java.util.Scanner;

public class DiceProgram {

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
				rollADie();
			}
			else if (choice == 2)
			{
				rollSeveralDice();
			}
			else if (choice == 3)
			{
				snakeEyes();
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
		System.out.println("1 - Roll a die");
		System.out.println("2 - Roll several dice");
		System.out.println("3 - Snake eyes");
		System.out.println("4 - exit");
		System.out.println();//new line
	}
	private static void rollADie()
	{		
		System.out.println("Rolling a dice");
		int number = hat.nextInt(DICE_TYPE) + 1;
		System.out.println("You rolled a "+number);
		System.out.println();//new line
	}
	private static void rollSeveralDice()
	{
		System.out.println("how many dice?");
		int numDice = console.nextInt();
		
		for (int i = 1; i <= numDice; i++)
		{
			rollADie();
		}
	}
	private static void snakeEyes()
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
}

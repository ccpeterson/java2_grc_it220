package random;
/**
 * Random Number Generator Program
 * 6 Oct 2017
 * @author Clinton Peterson
 * @version 1.0
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomMain 
{	
	//constants
	private static final int COLORS = 256;
	private static final int IN_A_ROW = 3;	
	//initializes a scanner for console input
	private static Scanner console = new Scanner(System.in);
    // Initialize the random number generator 
    private static Random hat = new Random();	
	public static void main(String[] args)
	{	
		//loops through menu until they choose to quit
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
				colorMenu();
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
				System.out.println("Please choose one of listed options");
			}
		}
		console.close();
	}
	
	/**
	 * Prints out the main menu
	 */
	private static void showMenu()
	{
		System.out.println("Welcome to the random thing, please pick something from the menu.");
		System.out.println("1 - Create a random color");
		System.out.println("2 - Flip a coin");
		System.out.println("3 - Generate an array of random numbers");
		System.out.println("4 - exit");
		System.out.println();//new line
	}
	
	/**
	 * Prints out the color sub-menu and runs the appropriate color program
	 */
	private static void colorMenu()
	{
		//loops through color menu until they choose to quit
		boolean colorDone = false;
		while (!colorDone)
		{
			System.out.println("Welcome to the thing, please pick something from the menu.");
			System.out.println("1 - Get a random color from my list");
			System.out.println("2 - Generate a random RGB color");
			System.out.println("3 - Generate a random grayscale color");
			System.out.println("4 - Return to the main menu");
			System.out.println();//new line
			//runs the appropriate color program
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
			else if (colorChoice == 4)
			{
				colorDone = true;
			}
			else
			{
				System.out.println("choose better next time");
			}
		}		
	}
	
	/**
	 * flips a coin until the same side comes up 3 times in a row
	 */
	private static void coinFlip()
	{		
		System.out.println("Flipping a coin until we get the same result " + IN_A_ROW + " three times in a row!");
		//the coin 
		boolean coin;
		//running counters
		int headCount = 0;
		int tailCount = 0;
		//"in a row" counters
		int headRepeat = 0;
		int tailRepeat = 0;
		//loops until threeInARow is true
		boolean threeInARow = false;
		while (!threeInARow)
		{
			//flip that coin
			coin = hat.nextBoolean();			
			//bump head counters and resets tail "in a row"
			if (coin == true)
			{
				headCount++;
				headRepeat++;
				tailRepeat = 0;
				System.out.print("Heads! ");				
			}
			//bump tail counters and resets head "in a row"
			else if (coin == false)
			{
				tailCount++;
				tailRepeat++;
				headRepeat = 0;
				System.out.print("Tails! ");				
			}
			//check if either "in a row" counter hits the number we want
			if (headRepeat == IN_A_ROW || tailRepeat == IN_A_ROW)
			{
				System.out.println(" ");
				threeInARow = true;
			}	
		}
		//output
		System.out.println("Total heads: " + headCount);
		System.out.println("Total tails: " + tailCount);
		System.out.println(" ");		
	}
	
	/**
	 * Creates and prints a random array of numbers from the user input
	 */
	private static void randomArray()
	{
		//getting info from user
		System.out.println("I am going to print out a random array of numbers to your specs");
		System.out.println("How many elements?");
		int elements = console.nextInt();
		System.out.println("Min Value?");
		int minVal = console.nextInt();
		System.out.println("Max Value?");
		int maxVal = console.nextInt();
		//creating array and filling it with random numbers
		int[] randomArray = new int[elements];
		for (int i=0; i < elements; i++)
		{
			randomArray[i] = hat.nextInt(maxVal - minVal + 1) + minVal;
		}
		//printing out array
		System.out.println(Arrays.toString(randomArray));		
	}
	
	/**
	 * prints one of the random color names from the list
	 */
	private static void randomColor()
	{
		//there is a string array and it picks one at random
		System.out.println("Picking a random color from a list of colors");
		String[] colorList = {"black", "blue", "cyan", "gray", "green", "magenta", "orange", "pink", "red", "white", "yellow" };
		int listChoice = hat.nextInt(colorList.length);
		String colorChoice = colorList[listChoice];
		System.out.println(colorChoice);		
	}
	
	/**
	 * prints a random RGB color
	 */
	private static void randomRGB()
	{	
		//just spits of 3 random numbers, all from 0 to 255
		System.out.println("Creating a random color.");
		int redValue = hat.nextInt(COLORS);
		int greenValue = hat.nextInt(COLORS);
		int blueValue = hat.nextInt(COLORS);
		System.out.println("Here is your random color - [red="+redValue+", blue="+blueValue+", green="+greenValue+"]");
		System.out.println();//new line
	}
	
	/**
	 * prints a random grayscale color using RGB values
	 */
	private static void randomGray()
	{	
		//spits out one random number, but 3 times
		System.out.println("Creating a random grayscale color.");
		int grayValue = hat.nextInt(COLORS);
		System.out.println("Here is your random  grayscale color - [red="+grayValue+", blue="+grayValue+", green="+grayValue+"]");
		System.out.println();//new line
	}
}
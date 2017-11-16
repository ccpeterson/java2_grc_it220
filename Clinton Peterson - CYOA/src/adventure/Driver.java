package adventure;

/**
 * Project: CYOA 
 * 11/15/17
 * @author Clinton Peterson
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
	//console used for user input
	private static Scanner console = new Scanner(System.in);
	//int used for which story is to be used
	private static int story = 0;
	//string used for the filename of the story selected
	private static String storyFile = "";
	//int which will be the number of lines in the file
	private static int numLines = 0;
	
	public static void main(String[] args)
	{	
		//displays the menu
		menu();
		//creates a new adventure object with the info gathered in the menu
		Adventure adventure1 = new Adventure(storyFile, numLines);
		//start the adventure
		adventure1.start();
	}
	
	/**
	 * Gets the user to pick the story they want to do, sets the storyFile and numLines 
	 */
	private static void menu()
	{
		//loops until it gets a good response for player type
		boolean done = false; 
		while (!done)
		{
			System.out.println("Which adventure do you wish to have?");
			System.out.println("1) Zombies!");
			System.out.println("2) Other Adventure!");
			story = console.nextInt();
			//these could be made to constants probably
			if (story == 1)
			{
				storyFile = "files/zombies.txt";
				done = true;
			}
			else if (story == 2)
			{
				storyFile = "files/other.txt";
				done = true;
			}
			else {
				System.out.println("Please enter a valid response");				
			}
		}
		//gotta do this since the file might not be there
		try
		{
			numLines = howManyLines(storyFile);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
	}
	
	/**
	 * 
	 * @param filename The file to be checked for line count
	 * @return an int with the amount of lines in the file
	 * @throws FileNotFoundException 
	 */
	private static int howManyLines(String filename) throws FileNotFoundException
	{
		//opening the file
		Scanner reader = new Scanner(new FileInputStream(filename));
		//int initialized at 0 to be used as a counter of lines in the file 
		int lineCount = 0;
		
		//runs through the file until there are no more lines, increments the counter each time
		while(reader.hasNextLine())
		{
			reader.nextLine();
			lineCount++;
		}
		//close that reader!
		reader.close();
		
		return lineCount;
	}
}
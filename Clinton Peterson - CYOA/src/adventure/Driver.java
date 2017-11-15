package adventure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver
{
	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{		
		boolean done = false; //loops until it gets a good response for player type
		int story = 0;
		String storyFile = "";
		int numLines = 0;
		while (!done)
		{
			System.out.println("Which adventure do you wish to have?");
			System.out.println("1) Zombies!");
			System.out.println("2) Other Adventure!");
			story = console.nextInt();
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
		
		try
		{
			numLines = howManyLines("files/zombies.txt");
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		System.out.println("Number of lines: " + numLines);
		
		Adventure adventure1 = new Adventure(storyFile, numLines);
		adventure1.start();
	}
	
	public static int howManyLines(String filename) throws FileNotFoundException
	{
		Scanner reader = new Scanner(new FileInputStream(filename));
		int lineCount = 0;
		while(reader.hasNextLine())
		{
			reader.nextLine();
			lineCount++;
		}
		reader.close();
		return lineCount;
	}
}

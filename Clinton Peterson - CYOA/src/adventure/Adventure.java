package adventure;

/**
 * Project: CYOA 
 * 11/15/17
 * @author Clinton Peterson
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Adventure
{
	//fields
	private String[] steps =  new String[1];
	private int position = 0;
	
	/**
	 * 
	 * @param fileName A string that is the path and filename of the text file containing the formatted story
	 * @param lines An int that is the number of lines in the file
	 */
	public Adventure(String fileName, int lines)
	{	
		//initializing the reader outside of the try/catch
		Scanner reader = null; 
		//copying the array to itself, but with the correct size
		steps = Arrays.copyOf(steps, lines);
		//try catch because i have to
		try
		{
			//accesses the file given to the constructor
			reader = new Scanner(new FileInputStream(fileName));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		//adds each line of the text file as an element of the steps array
		while(reader.hasNextLine())
		{
			for (int i = 0; i < lines; i++)
			{
				steps[i] = reader.nextLine();
			}			
		}
		//close that reader!
		reader.close();		
	}
	
	/**
	 * runs the story
	 */
	public void start()
	{
		Scanner console = new Scanner(System.in);
		//loops through until broken
		while (true)
		{
			// splits the line into 2, statement and options
			String[] statement = steps[position].split(":");
			//prints out the statement of the current position
			System.out.println(statement[0]); 
			//splits the options into the options an their numbers
			String[] options = statement[1].split("=|\\|"); 
			
			//prints out the options, they should be the even indexed parts of the array, also adds numbers ahead of them
			for (int i = 0; i < options.length / 2 ; i++) 
			{
				System.out.println(i+1 + " - " + options[i*2]);
			}
			
			//checks if you are in the "dead" position
			if (Integer.parseInt(options[1].trim()) == -1)
			{
				System.out.println("Game over, you lose!");
				break;
			}
			
			//checks if you are in the "win" position
			if (Integer.parseInt(options[1].trim()) == -2)
			{
				System.out.println("Game over, you win!");
				break;
			}
			
			//gets the users choice and validating it
			int choice = 0;
			boolean done = false;
			while (!done)
			{
				choice = console.nextInt();				
				if (choice > 0 && choice <= options.length / 2)
				{
					done = true;
				}				
				else {
					System.out.println("Please enter a valid response");				
				}
			}			
			//int choice = console.nextInt();
			
			//uses that choice to get the corresponding page they want to go to
			int choice2 = Integer.parseInt(options[choice*2-1].trim());
			//sets position to the correct page
			position = choice2;			
		}
		//close that console!
		console.close();
	}
}
package adventure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Adventure
{
	//fields
	private String[] steps =  new String[1];
	private int position;
	
	public Adventure(String fileName, int lines)
	{		
		Scanner reader = null;
		steps = Arrays.copyOf(steps, lines);
		try
		{
			reader = new Scanner(new FileInputStream(fileName));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}
		while(reader.hasNextLine())
		{
			for (int i = 0; i < lines; i++)
			{
				steps[i] = reader.nextLine();
			}			
		}
		reader.close();
		
		
	}
	
	public void start()
	{
		Scanner console = new Scanner(System.in);
		position = 0;
		
		boolean done = false;
		while (!done)
		{
			System.out.println(steps[position]);
			int choice = console.nextInt();
			position = choice;
			
		}
	}
}
package wrting_to_files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class UsingPrintWriter {

	public static void main(String[] args)
	{
		writingFilesInJava7();
	}
	
	
	private static void writingFilesInJava7()
	{
		//you can place classes that use the autocloseable interface in the paranthesis
		try(PrintWriter writer = new PrintWriter(new FileOutputStream("output.txt")))
		{
			for (int i = 2; i <= 100; i += 2)
			{
				writer.println(i);
			}
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Write Error: " + e.getMessage());
		}
	}
	
	private static void writingToFiles()
	{
		PrintWriter writer = null;
		try
		{
			writer = new PrintWriter(new FileOutputStream("foo.txt", true));
			
			writer.println("Favorite movie: Star Wars");
			writer.println("Favorite number");
			writer.println(42);
			writer.println(true);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Write Error: " + e.getMessage());
		}
		finally // will always run
		{
			if (writer != null)
			{
				writer.close();	
			}
		}
	}
}
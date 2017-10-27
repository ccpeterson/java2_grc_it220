package filesandstuff;
/**
 * Project: PP Files
 * 10/26/17
 * @author Clinton Peterson
 * @author Diana Carranza
 */
import java.io.File;

public class filesDriver {

	public static void main(String[] args)
	{
		//printPermissions("randomfiles/contact.php");
		//printDirectory("randomfiles");
		//printFileStats("randomfiles/contact.php");
		printChallenge("randomfiles");
	}
	
	private static void printPermissions(String path)
	{
		File toCheck = new File(path);
		String readable = "", writeable ="", executable="";
		if (toCheck.canRead())
		{
			readable = "r";
		}
		if (toCheck.canWrite())
		{
			writeable = "w";
		}
		if (toCheck.canExecute())
		{
			executable = "x";
		}
		System.out.println("Permissions: " + readable + writeable + executable );
	}
	
	private static void printDirectory(String path)
	{
		File dir = new File(path);
		File[] directoryContents = dir.listFiles();
		
		for (int i = 0; i < directoryContents.length; i++)
		{
			File currentFileDir = directoryContents[i];
			if (currentFileDir.isHidden())
			{
				System.out.println(currentFileDir.getName() + "(hidden)");
			}
			else
			{
				System.out.println(currentFileDir.getName());
			}
		}
	}
	
	private static void printFileStats(String path)
	{
		File toCheck = new File(path);
		if (toCheck.exists())
		{
			String isDir = "";
			if (toCheck.isDirectory())
			{
				isDir = " (dir)";
			}
			System.out.println("File Attributes");
			System.out.println("***************");
			System.out.println("Name: " + toCheck.getName() + isDir);
			System.out.println("Path from root: " + toCheck.getAbsoluteFile());
			System.out.println("Length in bytes: " + toCheck.length());
			printPermissions(path);
		}
		else
		{
			System.out.println("No such file or folder exists");
		}
	}
	private static void printChallenge(String path)
	{
		File dir = new File(path);
		if (dir.isDirectory())
		{
			File[] directoryContents = dir.listFiles();			
			for (int i = 0; i < directoryContents.length; i++)
			{
				File currentFileDir = directoryContents[i];
				if (currentFileDir.isDirectory())
				{
					System.out.println(currentFileDir.getName() + "(directory)");
					System.out.println("Directory Contents of " + currentFileDir.getAbsolutePath());
					System.out.println("******************");
					printChallenge(currentFileDir.toString());
					System.out.println("******************");
				}
				else
				{
					System.out.println(currentFileDir.getName());
				}
			}
		}
		else
		{
			System.out.println("You didn't give me a directory");
		}
	}
}
package filesandstuff;

import java.io.File;

public class filesDriver {

	public static void main(String[] args)
	{
		//printPermissions("C:/stuff/bar.txt");
		//printDirectory("c:/windows");
		printFileStats("C:/stuff/bar.txt");
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
		System.out.println("File Attributes");
		System.out.println("***************");
		System.out.println("Name: " + toCheck.getName());
		System.out.println("Path from root: " + toCheck.getPath());
		System.out.println("Length in bytes: " + toCheck.length());
		printPermissions(path);
	}
}

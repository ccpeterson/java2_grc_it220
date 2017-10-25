package file_class;

import java.io.File;
import java.io.IOException;

public class PracticeWithFileClass {

	public static void main(String[] args)
	{		
		moreFileStuff();
	}
	public static void moreFileStuff()
	{
		File dir = new File("c:/windows");
		File[] directoryContents = dir.listFiles();
		
		int dirCount = 0, fileCount = 0;
		for (int i = 0; i < directoryContents.length; i++)
		{
			File currentFileDir = directoryContents[i];
			if (currentFileDir.isFile())
			{
				fileCount++;
			}
			else
			{
				dirCount++;
			}
		}
		System.out.println("Directories found: " + dirCount);
		System.out.println("Files found: " + fileCount);
	}
	
	public static void creatingStuff()
	{
		try
		{
			File dir = new File("c:/stuff");
			dir.mkdir();
			boolean results =  ensureFileExists("c:/stuff/bar.txt");
			if (results)
			{
				System.out.println("New File created");
			}
			else
			{
				System.out.println("file already exists");
			}
		}
		catch (IOException ex)
		{
			System.out.println("Error creating file: " + ex.getMessage());
		}
	}
	
	public static boolean ensureFileExists(String path) throws IOException
	{
		File file = new File(path);
		
		if (file.exists())
		{
			return false;
		}
		else
		{
			file.createNewFile();
			return true;
		}
	}

}

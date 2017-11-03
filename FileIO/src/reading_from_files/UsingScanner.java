package reading_from_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args)
	{
		try
		{
			int numLines = howManyLines();
			System.out.println("Number of lines: " + numLines);
			int numWords = howManyWords();
			System.out.println("Number of words: " + numWords);
			int soLong = longestWord();
			System.out.println("Number of words: " + soLong);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex);
		}

	}
	public static int howManyLines() throws FileNotFoundException
	{
		Scanner reader = new Scanner(new FileInputStream("files/input/war_and_peace.txt"));
		int lineCount = 0;
		while(reader.hasNextLine())
		{
			reader.nextLine();
			lineCount++;
		}
		reader.close();
		return lineCount;
	}
	public static int howManyWords() throws FileNotFoundException
	{
		Scanner reader = new Scanner(new FileInputStream("files/input/war_and_peace.txt"));
		int wordCount = 0;
		while(reader.hasNextLine())
		{
			String line = 	reader.nextLine();
			if (line.length() != 0)
			{
				String[] words = line.split(" ");
				wordCount = wordCount + words.length;
			}
			
		}
		reader.close();
		return wordCount;
		
	}
	public static int longestWord() throws FileNotFoundException
	{
		Scanner reader = new Scanner(new FileInputStream("files/input/war_and_peace.txt"));
		int largestSoFar = 0;
		String foundWord = null;
		while(reader.hasNextLine())
		{
			String line = reader.nextLine();
			String[] words = line.split(" ");
			for (int i = 0; i < words.length; i++)
			{
				if (words[i].length() > largestSoFar)
				{
					largestSoFar = words[i].length();
					foundWord = words[i];
				}
			}
			
			
		}
		reader.close();
		System.out.println(foundWord);
		return largestSoFar;
	}

}

package recursion_hw_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args)
	{
		HashMap<String, Integer> wordCounts = new HashMap<>();
		List<String> fileContents = getFileContents();
				
		for (int i = 0; i < fileContents.size(); i++)
		{
			String line = fileContents.get(i);
			String[] parts = line.split(" ");
			for (int j = 0; j <  parts.length; j++)
			{
				String word = parts[j];
				if (!wordCounts.containsKey(word))
				{
					wordCounts.put(word, 1);
				}
				else
				{
					wordCounts.put(word, wordCounts.get(word) + 1);
				}
			}			
		}
		
		for (String word : wordCounts.keySet())
		{
			System.out.println(word + " " + wordCounts.get(word));
		}
		
	}
	private static void wordAnalysis()
	{
		ArrayList<String> words = new ArrayList<>();
		TreeSet<String> uniqueWords = new TreeSet<>();
				
		List<String> fileContents = getFileContents();
				
		for (int i = 0; i < fileContents.size(); i++)
		{
			String line = fileContents.get(i);
			String[] parts = line.split(" ");
			for (int j = 0; j <  parts.length; j++)
			{
				words.add(parts[j]);
				uniqueWords.add(parts[j]);
			}			
		}
		System.out.println("words: " + words.size() + " unique: " + uniqueWords.size() );
		
	}
	
	private static void readingLists()
	{
		List<String> fileContents = getFileContents();
		System.out.println("Number of lines: " + fileContents.size());
		
		for (int i = 0; i < fileContents.size(); i++)
		{
			String line = fileContents.get(i);
			if (!line.equals(""))
			{
				System.out.println(line);
			}
		}
	}
	private static List<String> getFileContents()
	{
		ArrayList<String> lines = new ArrayList<>();
		try (Scanner reader = new Scanner(new FileInputStream("files/war_and_peace.txt")))
		{
			while (reader.hasNextLine())
			{
				String line = reader.nextLine();
				lines.add(line);
			}			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Read Error: " + e.getMessage());
		}		
		//System.out.println("Number of lines: " + lines.size());
		
		return lines;
	}

}

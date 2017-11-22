package sets_and_maps;

import java.util.HashSet;

public class FunWithSets {

	public static void main(String[] args)
	{
		// java gives you a TreeSet and a HashSet
		HashSet<String> wordsWithNoDuplicates = new HashSet<>();
		
		wordsWithNoDuplicates.add("poop");
		wordsWithNoDuplicates.add("butt");
		wordsWithNoDuplicates.add("ass");
		wordsWithNoDuplicates.add("ass");
		
		for (String word : wordsWithNoDuplicates)
		{
			System.out.println(word);
		}

	}

}

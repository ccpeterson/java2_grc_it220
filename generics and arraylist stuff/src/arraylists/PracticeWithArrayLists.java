package arraylists;

import java.util.ArrayList;

public class PracticeWithArrayLists {

	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.println("adding");
		for (int i = 1; i <= 1000; i++)
		{
			numbers.add(i);
		}
		
		System.out.println("done adding");
		
		System.out.println(numbers);
		
		for (int i = 0; i < numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
		}
		
		for (int number : numbers)
		{
			System.out.println(number);
		}
	}

}

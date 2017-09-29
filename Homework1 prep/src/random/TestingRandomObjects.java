package random;

import java.util.Random;

public class TestingRandomObjects
{
	private static Random hat = new Random();
	public static void main(String[] args)
	{
		int number = hat.nextInt(10);
		
		for (int i = 1; i<= 100; i++)
		{
			number = nextInt(12,13);
			System.out.println(number);
		}		
	}
	
	public static int nextInt(int low, int high)
	{
		int number = hat.nextInt(high - low + 1) + low;
		return number;
	}
}

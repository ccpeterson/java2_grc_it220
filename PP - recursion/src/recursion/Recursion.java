package recursion;

public class Recursion {

	public static void main(String[] args)
	{
		System.out.println(powerN(3,1));
		System.out.println(powerN(3,2));
		System.out.println(powerN(3,3));
		
		System.out.println(bunnyEars(0));
		System.out.println(bunnyEars(1));
		System.out.println(bunnyEars(2));
		
		System.out.println(crazyBunnyEars(0));
		System.out.println(crazyBunnyEars(1));
		System.out.println(crazyBunnyEars(2));
		System.out.println(crazyBunnyEars(3));
		System.out.println(crazyBunnyEars(4));
	}
	
	public static int powerN(int base, int power)
	{
		//base 
		if (power == 1)
		{
			return base;
		}
		else
		{
			return base * powerN(base, power-1);			
		}
	}
	public static int bunnyEars(int numBunnies)
	{
		//base
		if (numBunnies == 0)
			{
			return 0;
			}
		else if(numBunnies == 1)
		{
			return 2;
		}
		else
		{
			return 2 + bunnyEars(numBunnies-1);
		}
	}
	
	public static int crazyBunnyEars(int numBunnies)
	{
		//base case
		if (numBunnies == 0)
		{
			return 0;
		}
		else if(numBunnies == 1)
		{
			return 2;
		}
		else
		{
			if (numBunnies % 2 == 0)
			{
				return 3 + crazyBunnyEars(numBunnies-1);
			}
			else
			{
				return 2 + crazyBunnyEars(numBunnies-1);
			}
			
		}
	}
	
	public static boolean checkParens(String check)
	{
		if (check.length() % 2 != 0)
		{
			return false;
		}
		
		if (check == "")
		{
			return true;
		}
		
		else if(check.startsWith("("))
		{
			return 
		}
	}

}

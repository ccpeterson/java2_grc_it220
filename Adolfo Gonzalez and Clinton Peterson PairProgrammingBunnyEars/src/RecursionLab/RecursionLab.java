package RecursionLab;

public class RecursionLab
{

	public static void main(String[] args)
	{
	
		System.out.println("Two to the power of 5 is: " + powerN(2, 5));
		System.out.println("5 Bunnies have a total of " + bunnyEars(5) + " ears.");
		System.out.println("Crazy bunny ears of 5 bunnies: " + crazyBunnyEars(5));
		System.out.println("Are all these closed? \"(())\": " + checkParens("(())"));
		System.out.println("Are all these closed? \"(())()\": " + checkParens("(())()"));
		System.out.println("Are all these closed? \"(((x))\": " + checkParens("(((x))"));
		// The above method does not account for "()()" or "()(x)()" which should
		// technically pass.
	}
	
	public static int powerN(int base, int power)
	{
		//base case
		if(power == 1)
		{
			return base;
		}
		
		//call itself
		else 
		{
			return base * powerN(base, power -1);
		}
	}

	public static int bunnyEars(int numBunnies){
		{
			//base case
			if (numBunnies == 1)
			{
				return 2;
			}
			//call itself
			else
			{
				return 2 + bunnyEars(numBunnies -1);
			}
		}
	}
	
	public static int crazyBunnyEars(int numBunnies)
	{
		//base case
		if(numBunnies == 1)
		{
			return 2;
		}
		
		//call itself
		if(numBunnies % 2 == 0)
		{
			return 3 + crazyBunnyEars(numBunnies -1);
		}
		else
		{
			return 2 + crazyBunnyEars(numBunnies -1);
		}
	}
	
	public static boolean checkParens(String check)
	{
		int lastIndex = check.length()-1;
		//base case
		if(check.length()==1)
		{
			if(check.charAt(0)== '(' || check.charAt(0)==')')
			{
				return false;
			}
			else 
			{
				return true;
			}
		}
		else if (check.length()== 2)
		{
			if (check.charAt(0) == '(' && check.charAt(lastIndex) == ')')
			{
				return true;
			}
			else if(check.charAt(0) == '(' && check.charAt(lastIndex) != ')')
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
		//call itself
		return (check.charAt(0)=='(' && check.charAt(lastIndex) == ')') && 
				checkParens(check.substring(1, lastIndex));
	}
	
	public static int countHi(String check)
	{
		int counter = 0;
		//base case
		if (!check.contains("hi"))
			{
			return 0;
			}
		//call itself
		else 
		{
			//check.contains("hi")
			return 1;
		}
		
	}
	
	public int sumDigits(int number)
	{
		//base case 
		
		//call itself
		return 0;
	}
	
}

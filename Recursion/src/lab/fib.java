package lab;

public class fib 
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("fib of " + i + " is " + fib(i));
		}
	}

	public static double fib(double n)
	{
		if (n <=1)
		{
			return 1;
		}
		else
		{
			return (fib(n-1) + fib(n - 2));
		}
	}
}
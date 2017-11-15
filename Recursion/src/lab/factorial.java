package lab;

public class factorial 
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println(fac(i));
		}
	}

	public static double fac(double n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			return (n * fac(n - 1));
		}
	}
}
package advent3;

public class Advent3 {

	public static void main(String[] args)
	{
		int x=0;
		int y=0;
		for (int i=1; i <=20; i++)
		{
			if (i%2 != 0)
			{
				x= x + (i/2+1);
				System.out.println(x);
			}
			else
			{
				y = y + i/2;
				System.out.println(y);
			}
		}
	}
}	
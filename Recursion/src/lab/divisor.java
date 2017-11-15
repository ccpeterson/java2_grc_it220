package lab;

public class divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pcd(24,9264,1);

	}
	
	public static void pcd (int first, int second, int candidate)
	{
		if (candidate > first || candidate > second)
		{
			return;
		}
		if (first % candidate == 0 && second % candidate == 0)
		{
			System.out.println(candidate);
		}
		
		pcd (first, second, ++candidate);
	}

}

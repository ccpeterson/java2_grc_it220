package coinflip;

/**
 * This uses the Coin class and flips it 10 times
 * Pair programming exercise
 * 28 Sep 2017
 * 
 * @author Clinton Peterson
 * @author Keith Danielsen
 * */

public class CoinFlipTest {

	public static void main(String[] args) 
	{
		Coin coin1 = new Coin(true, "Looks like heads", "Looks like tails");
		for (int i = 0; i < 10; i++)
		{
			coin1.flip();
			System.out.println(coin1.toString());
		}		
	}
}
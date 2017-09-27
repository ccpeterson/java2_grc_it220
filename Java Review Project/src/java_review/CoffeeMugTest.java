package java_review;

import java.awt.Color;

public class CoffeeMugTest
{
	public static void main(String[] args)
	{
		CoffeeMug mug1 = new CoffeeMug();
		System.out.println(mug1.getMaterial());
		System.out.println(mug1.getVolume());
		System.out.println(mug1.getColor());
		System.out.println(mug1.toString());
		
		CoffeeMug mug2 = new CoffeeMug();
		mug2 = new CoffeeMug(16, "Glass", Color.BLUE);
		System.out.println(mug2.toString());
		
	}

}

package inner_classes;

import inner_classes.Hammer.Nail;

public class Test {

	public static void main(String[] args)
	{
		Hammer hammer1 = new Hammer("claw");
		
		Hammer.Nail nail3 = new Hammer.Nail(5, "wood");
	}

}

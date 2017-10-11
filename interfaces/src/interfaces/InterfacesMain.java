package interfaces;

import java.awt.Color;

public class InterfacesMain {

	public static void main(String[] args)
	{
		Object[] objects = {new Mountain(5000,"Washington"), new PaperClip(Color.GRAY, "metal")};
		
		for (int i = 0; i < objects.length; i++)
		{
			System.out.println(objects[i].toString());
		}
		Viewable[] viewables = {new Mountain(5000,"Washington"), new PaperClip(Color.GRAY, "metal")};
		for (int i = 0; i < viewables.length; i++)
		{
			viewables[i].view();
		}
	}

}

package stuff;

import java.awt.Color;

public class Rhino implements Rideable
{
	private Color rhino;

	public Rhino(Color rhino) {
		super();
		this.rhino = rhino;
	}

	public Color getRhino() {
		return rhino;
	}

	public void setRhino(Color rhino) {
		this.rhino = rhino;
	}
	
	public void ride()
	{
		System.out.println("it rides");
	}

	@Override
	public String toString() {
		return "Rhino [rhino=" + rhino + "]";
	}
	
	
	
	
	
}

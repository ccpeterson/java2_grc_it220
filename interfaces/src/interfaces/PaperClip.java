package interfaces;

import java.awt.Color;

public class PaperClip implements Viewable
{
	private Color color;
	private String material;
	public PaperClip(Color color, String material)
	{		
		this.color = color;
		this.material = material;
	}
	public Color getColor() 
	{
		return color;
	}
	public void setColor(Color color) 
	{
		this.color = color;
	}
	public String getMaterial() 
	{
		return material;
	}
	public void setMaterial(String material) 
	{
		this.material = material;
	}
	public void view()
	{
		System.out.println("You view a paperclip "+ material);
	}
	
	@Override
	public String toString()
	{
		return material;
	}
	
}

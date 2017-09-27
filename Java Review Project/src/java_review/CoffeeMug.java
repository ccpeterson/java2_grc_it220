package java_review;
import java.awt.Color;

/**
 * This class represents a mug of coffee
 * @author Clinton Peterson
 * @version 1.0
 */

public class CoffeeMug 
{
	//fields
	private double volume;
	private String material;
	private Color color;
	
	//constructors
	
	/**
	 * Creates a default dark-gray ceramic mug
	 */
	public CoffeeMug() //default constructor
	{
		//assign some default values
		material = "Ceramic";
		color = Color.DARK_GRAY;
	}
	/**
	 * Creates a new coffee mug with the input values given
	 * @param newVolume the volume of the mug
	 * @param newMaterial the material of the mug
	 * @param newColor the color of the mug
	 */
	public CoffeeMug(double newVolume, String newMaterial, Color newColor) //Parameterized constructor
	{
		volume = newVolume;
		material = newMaterial;
		color = newColor;
		
	}
	
	//methods
	
	/**
	 * gets the volume of the mug
	 * @return the volume in ounces
	 */
	public double getVolume()
	{
		return volume;
	}
	public String getMaterial()
	{
		return material;
	}
	public Color getColor()
	{
		return color;
	}
	/**
	 * This changes the volume of the mug
	 * @param newVolume the new volume in ounces
	 */
	public void setVolume(double newVolume)
	{
		volume = newVolume;
	}
	public void setMaterial(String newMaterial)
	{
		material = newMaterial;
	}
	public void setColor(Color newColor)
	{
		color = newColor;
	}
	public String toString()
	{
		return "Volume: " + volume + " Material: " +  material + " Color: " + color;
	}
}

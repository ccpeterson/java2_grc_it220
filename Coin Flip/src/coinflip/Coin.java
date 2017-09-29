package coinflip;
import java.util.Random;

/**
 * 
 * This class represents a flippable coin
 * Pair programming exercise
 * 28 Sep 2017
 * 
 * @author Clinton Peterson
 * @author Keith Danielsen
 *
 */

public class Coin 
{
	//fields
	private boolean orientation;
	private String headsDescription;
	private String tailsDescription;
	
	//constructors
		
	/**
	 * Creates a coin with the input values given
	 * @param newOrientation The starting orientation of the new coin heads=true tails=false
	 * @param newHeadsDescription The text that will be displayed to describe the coin when heads is up 
	 * @param newTailsDescription The text that will be displayed to describe the coin when tails is up
	 */
	public Coin(boolean newOrientation, String newHeadsDescription, String newTailsDescription)
	{	
		orientation = newOrientation;
		headsDescription = newHeadsDescription;
		tailsDescription = newTailsDescription;
	}
	
	//getters
	
	/**
	 * gets the current orientation
	 * @return True if heads, false if tails
	 */
	public boolean getOrientation()
	{
		return orientation;
	}
	
	/**
	 * gets the description of the coins heads face
	 * @return A string describing what heads looks like
	 */
	public String getHeadsDescription()
	{
		return headsDescription;		
	}
	
	/**
	 * gets the description of the coins tails face
	 * @return A string describing what tails looks like
	 */
	public String getTailsDescription()
	{
		return tailsDescription;		
	}
	
	//setters
	
	/**
	 * changes the orientation of the coin
	 * @param newOrientation true if heads, false if tails
	 */
	public void setOrientaion(boolean newOrientation)
	{
		orientation = newOrientation;
	}
	
	/**
	 * changes the description of the heads side
	 * @param newHeadsDescription the new description of the heads side
	 */
	public void setHeadsDescription(String newHeadsDescription)
	{
		headsDescription = newHeadsDescription;
	}
	/**
	 * changes the description of the tails side
	 * @param newTailsDescription the new description of the tails side
	 */
	public void setTailsDescription(String newTailsDescription)
	{
		tailsDescription = newTailsDescription;
	}
	
	//methods
	
	/**
	 * sets the orientation to a random value
	 */
	public void flip()
	{
		orientation = new Random().nextBoolean();
	}
	
	/**
	 * Will be the description of whichever coin face is up
	 */
	public String toString()
	{
		if (orientation == true)
		{
			return headsDescription;
		}
		else 
		{
			return tailsDescription;
		}		
	}
}
	

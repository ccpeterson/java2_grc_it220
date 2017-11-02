package players;
/**
 * Project: Adventure Program 
 * 11/01/17
 * @author Clinton Peterson
 */
public class Knight extends Player
{
	//fields
	private final static int MAX_FATIGUE = 25;
	private final static int MAX_STEPS = 2;

	/**
	 * Constructs this type of player with the name provided
	 * @param newName the name of the player
	 */
	public Knight(String newName)
	{
		super (newName, MAX_FATIGUE, MAX_STEPS);		
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsInMud()
	{
		System.out.println("Mud, yuck, mud everywhere!");
	}
	
	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnGrass()
	{
		System.out.println("This grass is slowing me down.");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnRoad()
	{
		System.out.println("This road is more to my liking.");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnTrap()
	{
		System.out.println("Lucky my armor is on, ouch!");
		System.out.println("I have to move back one space!");
	}
	
	/**
	 * Just uses the parent's toString
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}
}
package players;
/**
 * Project: Adventure Program 
 * 10/24/17
 * @author Clinton Peterson
 */
public class Princess extends Player
{
	//fields
	private final static int MAX_FATIGUE = 12;
	private final static int MAX_STEPS = 3;

	/**
	 * Constructs this type of player with the name provided
	 * @param newName the name of the player
	 */
	public Princess(String newName)
	{
		super (newName, MAX_FATIGUE, MAX_STEPS);	
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsInMud()
	{
		System.out.println("This mud is going to stain my dress!");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnGrass()
	{
		System.out.println("This grass feels great between my toes.");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnRoad()
	{
		System.out.println("This road is dusty.");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnTrap() 
	{
		System.out.println("This trap won't affect me!");
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
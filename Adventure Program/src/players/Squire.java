package players;
/**
 * Project: Adventure Program 
 * 10/24/17
 * @author Clinton Peterson
 */
public class Squire extends Player {
	
	//fields
	private final static int MAX_FATIGUE = 15;
	private final static int MAX_STEPS = 3;
	
	/**
	 * Constructs this type of player with the name provided
	 * @param newName the name of the player
	 */
	public Squire(String newName) 
	{
		super (newName, MAX_FATIGUE, MAX_STEPS);
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsInMud()
	{
		System.out.println("I grew up in the mud, this won't affect me!");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnGrass()
	{
		System.out.println("I love the open grassy fields.");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnRoad()
	{
		System.out.println("I wonder how long this road will go on.");
	}

	/**
	 * Prints out the character specific text for when the player encounters this type of tile
	 */
	@Override
	public void stepsOnTrap()
	{
		System.out.println("Ugh a trap!");
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
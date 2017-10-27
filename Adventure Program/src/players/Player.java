package players;
/**
 * Project: Adventure Program 
 * 10/24/17
 * @author Clinton Peterson
 */
public abstract class Player
{	
	private String name;
	private int currentFatigue;
	private int maxFatigue;
	private int steps;
	
	public Player(String newName, int newFatigue, int newSteps)
	{
		name = newName;
		currentFatigue = 0;
		maxFatigue = newFatigue;
		steps = newSteps;
	}
	public abstract void stepsInMud();
	public abstract void stepsOnGrass();
	public abstract void stepsOnRoad();
	public abstract void stepsOnTrap();
	
	/**
	 * Sets the current fatigue for the player
	 * @param newFatigue the current fatigue for the player
	 */
	public void setCurrentFatigue(int newFatigue)
	{
		this.currentFatigue = newFatigue;
	}
	
	/**
	 * gets the current amount of fatigue for this player
	 * @return the current amount of fatigue for this player
	 */
	public int getCurrentFatigue()
	{
		return currentFatigue;
	}
	
	/**
	 * gets the maximum amount of fatigue this player can tolerate
	 * @return the maximum amount of fatigue this player can tolerate
	 */
	public int getMaxFatigue()
	{
		return maxFatigue;
	}
	
	/**
	 * gets the name for this player
	 * @return the name for this player
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * gets the maximum amount of steps this player can take
	 * @return the maximum amount of steps this player can take
	 */
	public int getSteps()
	{
		return steps;
	}
	
	public String toString()
	{
		return("This is a player named " + name);
	}
	
}
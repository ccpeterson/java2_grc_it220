package players;

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
	public void setCurrentFatigue(int newFatigue)
	{
		this.currentFatigue = newFatigue;
	}
	public int getCurrentFatigue()
	{
		return currentFatigue;
	}
	public int getMaxFatigue()
	{
		return maxFatigue;
	}
	public String getName()
	{
		return name;
	}
	public int getSteps()
	{
		return steps;
	}
}
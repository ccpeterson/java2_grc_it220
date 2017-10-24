package players;

public abstract class Player
{	
	public String name;
	public int currentFatigue;
	public int maxFatigue;
	public int steps;
	
	public Player(String newName, int newFatigue, int newSteps)
	{
		name = newName;
		currentFatigue = newFatigue;
		maxFatigue = newFatigue;
		steps = newSteps;
	}
	public abstract void stepsInMud();
	public abstract void stepsOnGrass();
	public abstract void stepsOnRoad();
	public abstract void stepsOnTrap();
}
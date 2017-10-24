package players;

public class Squire extends Player {
	
	private final static int MAX_FATIGUE = 15;
	private final static int MAX_STEPS = 3;

	public Squire(String newName) 
	{
		super (newName, MAX_FATIGUE, MAX_STEPS);
	}

	@Override
	public void stepsInMud()
	{
		System.out.println("I grew up in the mud, this won't affect me!");
	}

	@Override
	public void stepsOnGrass()
	{
		System.out.println("I love the open grassy fields.");
	}

	@Override
	public void stepsOnRoad()
	{
		System.out.println("I wonder how long this road will go on.");
	}

	@Override
	public void stepsOnTrap()
	{
		System.out.println("Ugh a trap!");
	}
}
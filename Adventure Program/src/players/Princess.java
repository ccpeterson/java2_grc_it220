package players;

public class Princess extends Player
{
	private final static int MAX_FATIGUE = 12;
	private final static int MAX_STEPS = 3;

	public Princess(String newName)
	{
		super (newName, MAX_FATIGUE, MAX_STEPS);	
	}

	@Override
	public void stepsInMud()
	{
		System.out.println("This mud is going to stain my dress!");
	}

	@Override
	public void stepsOnGrass()
	{
		System.out.println("This grass feels great between my toes.");
	}

	@Override
	public void stepsOnRoad()
	{
		System.out.println("This road is dusty.");
	}

	@Override
	public void stepsOnTrap() 
	{
		System.out.println("This trap won't affect me!");
	}
}
package players;

public class Knight extends Player
{
	private final static int MAX_FATIGUE = 25;
	private final static int MAX_STEPS = 2;

	public Knight(String newName)
	{
		super (newName, MAX_FATIGUE, MAX_STEPS);		
	}

	@Override
	public void stepsInMud()
	{
		System.out.println("Mud, yuck, mud everywhere!");
	}

	@Override
	public void stepsOnGrass()
	{
		System.out.println("This grass is slowing me down.");
	}

	@Override
	public void stepsOnRoad()
	{
		System.out.println("This road is more to my liking.");
	}

	@Override
	public void stepsOnTrap()
	{
		System.out.println("Lucky my armor is on, ouch!");
	}	
}
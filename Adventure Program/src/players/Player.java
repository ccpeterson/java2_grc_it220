package players;

public abstract class Player
{
	/*
	 * Player objects will need to manage:
	 * name: the players name
	 * fatigue: the players current and maximum fatigue (a player loses when current == maximum)
	 * steps: the maximum number of steps a player can take (based on sub class)
	 */
	
	public abstract void stepsInMud();
	public abstract void stepsOnGrass();
	public abstract void stepsOnRoad();
	public abstract void stepsOnTrap();
}

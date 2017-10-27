package tiles;
/**
 * Project: Adventure Program 
 * 10/24/17
 * @author Clinton Peterson
 */
import game.Game;
import players.*;

public class RoadTile extends BasicTile
{
	/**
	 * Constructs a RoadTile object
	 * 
	 * @param type One of the types of tiles (ignored but needed since the parent constructor requires it)
	 */
	public RoadTile(TileType type)
	{
		super(TileType.ROAD);
	}
	
	/**
	 * If the player is a squire, increments the player's fatigue by 1
	 * Prints the player's fatigue to the console
	 * Calls the player's specific method for the tiles feedback text to be printed
	 */
	@Override
	public void visitTile(Game game)
	{
		Player temp = game.getPlayer();
		int current = temp.getCurrentFatigue();
		int max = temp.getMaxFatigue();
		if (temp instanceof Squire) 
		{
			current += 1;
			temp.setCurrentFatigue(current);
		}
		
		System.out.println("Your fatigue is now " + current + "/" + max);
		game.getPlayer().stepsOnRoad();				
	}
}
package tiles;
/**
 * Project: Adventure Program 
 * 11/01/17
 * @author Clinton Peterson
 */
import game.*;
import players.*;

public class MudTile extends BasicTile
{
	/**
	 * Constructs a MudTile object
	 * 
	 */
	public MudTile()
	{
		super(TileType.MUD);
	}
	
	/**
	 * Increments the player's fatigue by 2
	 * Prints the player's fatigue to the console
	 * Calls the player's specific method for the tiles feedback text to be printed
	 */
	@Override
	public void visitTile(Game game)
	{
		Player temp = game.getPlayer();
		int current = temp.getCurrentFatigue();
		int max = temp.getMaxFatigue();
		current += 2;
		temp.setCurrentFatigue(current);
		System.out.println(" ");
		System.out.println("::You arrive at a mud tile::");
		game.getPlayer().stepsInMud();
		System.out.println("::Your fatigue is now " + current + "/" + max + "::");		
	}
}
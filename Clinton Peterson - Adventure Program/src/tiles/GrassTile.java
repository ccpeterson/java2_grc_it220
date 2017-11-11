package tiles;
/**
 * Project: Adventure Program 
 * 11/01/17
 * @author Clinton Peterson
 */
import game.*;
import players.*;

public class GrassTile extends BasicTile
{
	/**
	 * Constructs a GrassTile object
	 * 
	 */
	public GrassTile()
	{
		super(TileType.GRASS);
	}
	
	/**
	 * Increments the player's fatigue by 1
	 * Prints the player's fatigue to the console
	 * Calls the player's specific method for the tiles feedback text to be printed
	 */
	@Override
	public void visitTile(Game game)
	{
		Player temp = game.getPlayer();
		int current = temp.getCurrentFatigue();
		int max = temp.getMaxFatigue();
		current += 1;
		temp.setCurrentFatigue(current);
		System.out.println(" ");
		System.out.println("::You arrive at a grass tile::");
		game.getPlayer().stepsOnGrass();
		System.out.println("::Your fatigue is now " + current + "/" + max + "::");		
	}
}
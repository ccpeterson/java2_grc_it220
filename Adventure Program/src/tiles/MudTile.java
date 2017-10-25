package tiles;

import game.Game;
import players.Player;

public class MudTile extends BasicTile
{
	/**
	 * Constructs a MudTile object
	 * 
	 * @param type One of the types of tiles (ignored but needed since the parent constructor requires it)
	 */
	public MudTile(TileType type)
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
		System.out.println("Your fatigue is now " + current + "/" + max);
		game.getPlayer().stepsInMud();
	}
}
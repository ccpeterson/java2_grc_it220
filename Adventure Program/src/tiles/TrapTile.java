package tiles;

import game.Game;
import players.Player;

public class TrapTile extends BasicTile
{
	/**
	 * Constructs a TrapTile object
	 * 
	 * @param type One of the types of tiles (ignored but needed since the parent constructor requires it)
	 */
	public TrapTile(TileType type) 
	{
		super(TileType.TRAP);
	}
	
	/**
	 * If the player isn't a princess, increments the player's fatigue by 2 and moves them back one space
	 * Prints the player's fatigue to the console
	 * Calls the player's specific method for the tiles feedback text to be printed
	 */
	@Override
	public void visitTile(Game game)
	{
		Player temp = game.getPlayer();
		int current = temp.getCurrentFatigue();
		int max = temp.getMaxFatigue();
		if (max != 12)
		{
			current += 2;
			temp.setCurrentFatigue(current);
			game.movePlayer(-1);
		}		
		System.out.println("Your fatigue is now " + current + "/" + max);
		game.getPlayer().stepsOnTrap();
	}
}
package game;

import players.Player;
import tiles.BasicTile;

public class Game
{
	//stores tile objects
	private BasicTile[] tiles;
	
	/* 
	 * stores the index of player (which tile the player is located within inside 
	 * the tiles array
	 */
	private int position = -1;
	
	//the player object
	private Player player;
	
	public Game(int numTiles, Player player)
	{
		
	}
	
	//public methods
	
	public void startGame()
	{
		//this creates our array of tile objects
		buildTiles();
		
		/*
		 * The main game loop should be declared here. Each turn
		 * the player should move a random distance forward from
		 * 1 to maxSteps. 
		 * 
		 * NOTE: maxSteps should be stored in the Player class and
		 * should be 2 for Knights and 3 for squires or princesses.
		 */
		
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
	public void movePlayer(int distance)
	{
		/*
		 * This method moves the player the given distance.
		 * A positive value will move the player to the later
		 * indices in the tiles[] array, while a negative
		 * value will move the player back to lower indices.
		 * 
		 * NOTE: care must be taken that the index never
		 * falls outside the range 0 --> tiles.length - 1
		 */
	}
	
	//private methods
	private void buildTiles()
	{
		/*
		 * This method should instantiate tile objects to fill the
		 * tiles[] array above. 10% of the tiles should be trap tiles,
		 * 20% mud, 40% grass and 30% road.
		 */
	}
	
	//prints out the tiles array along with the current player position
	private String printTiles()
	{
		String result = "[";
		
		for (int i = 0; i < tiles.length; i++)
		{
			if (i != 0)
			{
				result += ", ";
			}
			
			//player is in this tile
			if (position == i)
			{
				result += tiles[i].toString() + " - (player)";
			}
			else
			{
				result += tiles[i].toString();
			}
		}
		result += "]";
		
		if (position >= tiles.length)
		{
			result += " (player)";
		}
		
		return result;
	}
}

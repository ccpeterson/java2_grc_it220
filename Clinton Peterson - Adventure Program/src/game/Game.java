package game;
/**
 * Project: Adventure Program 
 * 11/01/17
 * @author Clinton Peterson
 */

import java.util.Arrays;
import java.util.Random;
import players.*;
import tiles.*;

public class Game
{
	//fields
	private BasicTile[] tiles = new BasicTile[1]; //stores tile objects
	private int numTiles; //length of game
	private static Random hat = new Random(); //used for random numbers
	private int position = -1; //stores the index of player (which tile the player is located within inside the tiles array
	private Player player; //the player object
	
	/**
	 * constructs a game object with the length desired and the player object to be used
	 * @param numTiles the length of the game in tiles
	 * @param player the player object to be used
	 */
	public Game(int numTiles, Player player)
	{
		this.player = player;
		this.numTiles = numTiles;		
	}
	
	//public methods
	
	/**
	 * Main game method
	 */
	public void startGame()
	{
		int randomMoves; // used for determining how man y steps are taken
		boolean win = false; //will get flipped if win conditions are met
		boolean lose = false; //will get flipped if loss conditions are met
		buildTiles(); //this creates our array of tile objects		
		
		while(position < numTiles ) 
		{
			//if the player ran out of energy last turn this breaks the loops and indicates a loss
			if (player.getCurrentFatigue() >= player.getMaxFatigue()) 
			{
				lose = true;
				break;
			}
			
			//moves the player a random amount from 1 to the max ammount the player can move
			randomMoves = hat.nextInt(player.getSteps()) + 1;
			movePlayer(randomMoves);
			
			//if the player has gone past the end this breaks the loop and indicates a win
			if (position >= numTiles)
			{
				win = true;
				break;
			}
			
			//what happens when the player steps on whatever tile has just been reached
			tiles[position].visitTile(this);
			//shows current position within tiles
			System.out.println(printTiles());
		}
		
		if (win)
		{
			System.out.println(" ");
			System.out.println("You reach the end of your journey, congrats!");
		}
		else if (lose)
		{
			System.out.println(" ");
			System.out.println("You get tired and take a nap, a wolf eats you while you sleep, sorry!");
		}	
	}
	
	/**
	 * returns the player object
	 * @return the player object
	 */
	public Player getPlayer()
	{
		return player;
	}
	
	/**
	 * moves the player the distance provided
	 * @param distance the amount of steps to move
	 */
	public void movePlayer(int distance)
	{		
		if (distance > 0)
		{
			System.out.println(" ");
			System.out.println("You move " + distance + " spaces.");
		}
		position = position + distance;
	}
	
	//private methods
	private void buildTiles()
	{
		tiles = Arrays.copyOf(tiles, numTiles);
		for (int i = 0; i < numTiles; i++ )
		{
			int randomTile = hat.nextInt(10) + 1;
			if (randomTile == 1)
			{
				tiles[i] = new TrapTile();
			}
			else if (randomTile <= 3)
			{
				tiles[i] = new MudTile();
			}
			else if (randomTile <= 7)
			{
				tiles[i] = new GrassTile();
			}
			else
			{
				tiles[i] = new RoadTile();
			}
		}
		
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
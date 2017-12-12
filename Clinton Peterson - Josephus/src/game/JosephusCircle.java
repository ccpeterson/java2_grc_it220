package game;

/**
 * Project: Josephus Circle
 * Date: 11 Dec 2017
 * 
 * @author Clinton Peterson
 * 
 */

import exceptions.GameException;

public class JosephusCircle
{
	//fields
	private int size;
	private int maxPlayers;
	private JosephusNode head;
	private JosephusNode cursor;
	
	/**
	 * 
	 * @param playerCount
	 */
	public JosephusCircle(int playerCount)
	{
		//Creates a new JosephusCircle object with the maximum players given.
		this.maxPlayers = playerCount;		
	}
	
	/**
	 * Adds a node to the linked list
	 * @param player name of the player
	 * @throws GameException
	 */
	public void addPlayer(String player) throws GameException
	{
		//Adds a new player to the game from left-to-right in the 
		//internal linked list.
		if (size == maxPlayers)
		{
			throw new GameException();
		}
		if (head == null)
		{
			head = new JosephusNode(player,null,head);
			cursor = head;
		}
		else
		{
			JosephusNode current = head;
			while(current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNext(new JosephusNode(player,null,current));
		}
		size++;		
	}
	
	/**
	 * turns the list into a circle
	 */
	public void circularize()
	{
		//Converts the internal linked list that maintains this circle 
		//of players into a circular linked list.
		JosephusNode first = head;
		JosephusNode current = head;
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(first);
		first.setPrevious(current);		
	}
	
	/**
	 * Moves the cursor pointer
	 * @param direction right or left
	 * @param steps how many steps
	 * @return the player's name 
	 */
	public String moveCursor(Direction direction, int steps)
	{
		//Moves the current player (the cursor) from the current 
		//position the given number of steps to the left or right
		for (int i=0; i < steps; i++)
		{
			if (direction == Direction.RIGHT)
			{
				cursor = cursor.getNext();
			}
			if (direction == Direction.LEFT)
			{
				cursor = cursor.getPrevious();
			}
		}		
		return cursor.getData().toString();
	}
	
	/**
	 * Removes the node at the current cursor pointer and moves the pointer in the direction of the game
	 * @param direction right or left
	 */
	
	public void removeAtCursor(Direction direction)
	{
		JosephusNode before = cursor.getPrevious();
		JosephusNode after = cursor.getNext();
		if (direction == Direction.RIGHT)
		{
			cursor = cursor.getNext();
		}
		if (direction == Direction.LEFT)
		{
			cursor = cursor.getPrevious();
		}
		before.setNext(after);
		after.setPrevious(before);
		size--;
	}
	
	/**
	 * Returns a string representing the internal state of the circle.
	 * @return a string representing the internal state of the circle
	 */
	public String getCircle()
	{
		
		String circle = "<--";
		JosephusNode current = head;
		for (int i = 0; i < size; i++)		
		{
			if (current == cursor)
			{
				circle = circle + " " + current.getData().toString().toUpperCase() + " ";
			}
			else
			{	
				circle = circle + " " + current.getData() + " ";
			}
			if (i < size -1)
			{
				circle = circle + "<-->";
			}
			current = current.getNext();
			
		}
		circle = circle + "-->";
		
		return circle;
	}
	
	/**
	 * Returns true if the game is over. 
	 * @return true if only one player remains in the circle
	 */
	public boolean isGameOver()
	{
		
		if (size == 1)
		{
			return true;
		}
		else
		{		
		return false;
		}
	}
}

package game;

public class JosephusCircle
{
	//fields go here...
	
	public JosephusCircle(int playerCount)
	{
		//Creates a new JosephusCircle object with the maximum players given.
	}
	
	public void addPlayer(String player)
	{
		//Adds a new player to the game from left-to-right in the 
		//internal linked list.
	}
	
	public void circularize()
	{
		//Converts the internal linked list that maintains this circle 
		//of players into a circular linked list.
	}
	
	public String moveCursor(Direction direction, int steps)
	{
		//Moves the current player (the cursor) from the current 
		//position the given number of steps to the left or right
		return null;
	}
	
	public void removeAtCursor(Direction direction)
	{
		//Removes the player at the cursor position from the circle.
	}
	
	public String getCircle()
	{
		//Returns a string representing the internal state of the circle, 
		//with the following format:
		//<-- Player A <--> Player B <--> Player C <--> Player D -->
		return null;
	}
	
	public boolean isGameOver()
	{
		//Returns true if the game is over. That is, this method will 
		//return true if only one player remains in the circle.
		return false;
	}
}

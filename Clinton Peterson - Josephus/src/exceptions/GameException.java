package exceptions;

@SuppressWarnings("serial")
public class GameException extends RuntimeException
{
	public GameException(String message)
	{
		super(message);
	}
	
	public GameException()
	{
		super("Error running game...");
	}
}

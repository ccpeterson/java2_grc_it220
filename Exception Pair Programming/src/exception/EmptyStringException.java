package exception;

public class EmptyStringException extends RuntimeException
{
	public EmptyStringException(String message)
	{
		super(message);		
	}

	public EmptyStringException()
	{
		super("An empty string was encountered. ");
	}	
}
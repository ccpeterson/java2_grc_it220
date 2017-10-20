package exception;

public class NegativeNumberException extends RuntimeException
{
	public NegativeNumberException(String message)
	{
		super(message);
	}
	
	public NegativeNumberException()
	{
		super("A negative number ws encountered");
	}
}
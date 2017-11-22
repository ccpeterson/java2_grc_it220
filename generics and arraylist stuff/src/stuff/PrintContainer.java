package stuff;

public class PrintContainer<T>

{
	private T toPrint;
	
	public PrintContainer(T toPrint)
	{
		this.toPrint = toPrint;
	}
	
	public void printMe()
	{
		System.out.println(this.toString());
	}
	
	public T retrieveToPrint()
	{
		return toPrint;
	}

}

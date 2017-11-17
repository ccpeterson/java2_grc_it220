package examples;

// T is a placeholder for the types we will store in our class

//T can be any valid identifier
//declare that type T uses an interface or has a parent class
public class DataStorage<T>
{
	//field
	private T data;
		
	//constructor
	public DataStorage(T data)
	{
		this.data = data;
		
	}
		
	//methods
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}	
}
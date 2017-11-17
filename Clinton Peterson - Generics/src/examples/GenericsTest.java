package examples;

public class GenericsTest {

	public static void main(String[] args)
	{
		IntegerStorage number = new IntegerStorage(100);
		
		//Retrieve or assign my number
		System.out.println("value: "  + number.getData());
		number.setData(200);
		System.out.println("value: "  + number.getData());
		
		StringStorage string = new StringStorage("yo");
		System.out.println("value: "  + string.getData());
		
		//object storage can store any type of object
		ObjectStorage object1 = new ObjectStorage("yo");
		System.out.println(object1.getData().toString());
		
		ObjectStorage object2 = new ObjectStorage(new DigitalCar());
		System.out.println(object2.getData().toString());
		
		//object storage can store any type of primitive
		
		/*
		 * Primitives mapped to wrapper classes
		 * 
		 * byte - Byte, short - Short, int - Integer, long - Long
		 * float - Float, double - Double
		 * boolean - Boolean
		 * char - Character
		 */
		
		//hide my primitive in a wrapper class
		Integer myNumber = new Integer(100);
		
		//auto-boxing and unboxing happening here...
		ObjectStorage object3 = new ObjectStorage(100);
		System.out.println(object3.getData().toString());
		
		//what if i wanted to print a string value, all in upercase,
		//that was stored in my ObjectStorage
		//System.out.println(object1.getData().toUpperCase());
		
		//cast your value back to your original type
		String retrivedString = (String)object1.getData();
		System.out.println(retrivedString.toUpperCase());
		
		//use generics to store and retrieve objects
		
		/*
		 * The compiler will create a new version of the DataStorage
		 * class for each generic type that is used. This process
		 * of creating compatible classes is call Type Erasure.
		 */
		DataStorage<String> stringValue = new DataStorage<String>("Hi!");
		DataStorage<Integer> intValue = new DataStorage<Integer>(100);
		DataStorage<Boolean> booleanValue = new DataStorage<Boolean>(true);
		DataStorage<DigitalCar> carValue = new DataStorage<DigitalCar>(new DigitalCar());
		
		
		//we can retrieve our values using their original types
		System.out.println(stringValue.getData().toUpperCase());
		System.out.println(booleanValue.getData());
		
		int number1 = 9;
		int number2 = 7;
		
		//store the results of division and remainder
		Pair<Integer, Integer> results = new Pair<Integer, Integer>(number1 / number2, number1 % number2);
		
		System.out.println("Quotient: " + results.getFirst());
		System.out.println("Remainder: " + results.getSecond());
		
		Pair<String, Boolean> namesToSkydiving = new Pair<String, Boolean>("Clinton", false);
		
		
		
		
		
		

	}

}

package studentTracker;

/**
 * inheritance 
 * Pair programming exercise
 * 5 Oct 2017
 * 
 * @author Clinton Peterson
 * @author Adolfo Gonzalez
 */
public class TestClass {

	public static void main(String[] args) 
	{
	USStudent stacey = new USStudent(123,"Stacey","SomeGirl","java","BS","123456789");
	ForeignStudent fez = new ForeignStudent(456,"Fez","SomeDude","english","BA","ABC","Canada");
	
	System.out.println(stacey.toString());
	System.out.println(fez.toString());
	}

}

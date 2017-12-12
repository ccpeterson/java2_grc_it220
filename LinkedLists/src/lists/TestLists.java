package lists;

public class TestLists
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		//favorite books!
		list.add("Game of Thrones");
		list.add("Hunger Games");
		list.add("The Hobbit");
		list.add("Les Miserables");
		list.add("The Expanse");
		
		System.out.println("Num elements: " + list.size());
		System.out.println("Is empty? " + list.isEmpty());
		System.out.println("contains(Twilight): " + list.contains("Twilight"));
		System.out.println("contains(Hunger Games): " + list.contains("Hunger Games"));
		System.out.println("get(0): " + list.get(0));
		System.out.println("get(3): " + list.get(3));
		try
		{
			System.out.println("get(5): " + list.get(5));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println("remove twilight " + list.remove("Twilight"));
		System.out.println("remove hunger games " + list.remove("Hunger Games"));
		System.out.println("remove expanse " + list.remove("The Expanse"));
	}
}

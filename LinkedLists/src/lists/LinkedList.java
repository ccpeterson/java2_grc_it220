package lists;

public class LinkedList
{
	//field
	private Node head;
	
	public LinkedList()
	{
		//do nothing
	}
	
	public void add(Object insert)
	{
		if (head == null)
		{
			head = new Node(insert,null);
		}
		else
		{
			Node current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = new Node(insert,null);
		}
		
	}
	
	public static class Node
	{
		private Object data;
		private Node next;
		
		public Node(Object data, Node next)
		{
			this.data = data;
			this.next = next;
		}
		
		public String toString()
		{
			return "Node: " + data.toString();
		}
	}
}

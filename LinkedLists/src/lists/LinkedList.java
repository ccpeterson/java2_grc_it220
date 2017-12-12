package lists;

public class LinkedList
{
	//fields
	private int size;
	private Node head; //we store only a single reference to a node

	
	public LinkedList()
	{
		//do nothing...
	}
	
	public void add(Object insert)
	{
		//is this list empty?
		if (head == null)
		{
			head = new Node(insert, null);
		}
		else //search to the last element
		{
			Node current = head;
			while (current.next != null)
			{
				current = current.next;
			}
			
			//assign the next field of our last element
			current.next = new Node(insert, null);
		}
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}

	public boolean contains(Object element)
	{
		Node current = head;
		while (current != null)
		{
			if (current.data.equals(element))
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public Object get(int index)
	{
		//verify we have a good index
		if (index < 0 || index >= size)
		{
			throw new IllegalArgumentException("Bad index given: " + index);
		}
		
		int currentIndex = 0;
		
		//loop until I find the index requested
		Node current = head;
		while (current != null)
		{
			//is the current index the one we're looking for?
			if (currentIndex == index)
			{
				return current.data;
			}
			
			//move to the next index
			currentIndex++;
			current = current.next;
		}
		
		//we should never reach this line
		throw new UnexpectedStateException("didnt find it");
		
	}
	
	public boolean remove(Object element)
	{
		
		if (head == null)
		{
			return false;
		}
		else if (head.data.equals(element))
		{
			head = head.next;
			return true;
		}
		else 
		{
			Node current = head;
			
			while (current.next != null)
			{
				if (current.next.data.equals(element))
				{
					current.next = current.next.next;
					
					return true;
				}
				current = current.next;
			}
			return false;
		}
	}
	//private so that other classes cannot see our Node class
	//static so that there is no requirement that we use an
	//instance of our LinkedList class to instantiate Node objects.
	private static class Node
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


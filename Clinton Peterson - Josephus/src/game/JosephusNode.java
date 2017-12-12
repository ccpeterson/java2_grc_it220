package game;

/**
 * Project: Josephus Circle
 * Date: 11 Dec 2017
 * 
 * @author Clinton Peterson
 * 
 */

//A doubly-linked list node. This node class is not an inner class, 
//so you will need to use getters/setters to access the fields in 
//the class. They should not be public.
public class JosephusNode
{
	private Object data;
	private JosephusNode next;
	private JosephusNode previous;
	
	public JosephusNode(Object data, JosephusNode next, JosephusNode previous)
	{
		this.data = data;
		this.next = next;
		this.previous = previous;
	}
	
	/**
	 * Gets the data for this node
	 * @return The data object for this node
	 */
	public Object getData() 
	{
		return data;
	}
	
	/**
	 * Sets the data for this node
	 * @param data The data object for this node
	 */
	public void setData(Object data) 
	{
		this.data = data;
	}

	/**
	 * Gets the node this node's next pointer is pointing to
	 * @return the node this node's next pointer is pointing to
	 */
	public JosephusNode getNext() 
	{
		return next;
	}
	
	/**
	 * Sets the node this node's next pointer is pointing to
	 * @param next the node this node's next pointer is pointing to
	 */
	public void setNext(JosephusNode next) 
	{
		this.next = next;
	}
	
	/**
	 * Gets the node this node's previous pointer is pointing to
	 * @return the node this node's previous pointer is pointing to
	 */
	public JosephusNode getPrevious() 
	{
		return previous;
	}
	
	/**
	 * Sets the node this node's previous pointer is pointing to
	 * @param next the node this node's previous pointer is pointing to
	 */
	public void setPrevious(JosephusNode previous) 
	{
		this.previous = previous;
	}
	
	/**
	 * Returns a string about this node's data
	 * @return a string about this node's data 
	 */
	public String toString()
	{
		return "Node: " + data.toString();
	}	
}
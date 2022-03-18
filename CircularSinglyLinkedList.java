/**
	Created By: Ahmad Raza
	Date: 18 Mar 2022

**/

public class CircularSinglyLinkedList
{
	private Node head;  //store the reference of the first node in the chain
	private Node tail;  //store the reference of the first node in the chain
	private Node current;  //store the reference of the current node in the chain
	
	/** store the reference of the previous node with respect to the current
	node in the chain if there is only one node in the chain then store the reference of the current node**/
	private Node lastCurrentNode;
	private int size;  //store the size of the chain
	
	public CircularSinglyLinkedList()
	{
		
		head = null;
		tail = null;
		current = null;
		lastCurrentNode = null;
		size = 0;
	}
	
	//return the size of the chain
	public int getSize()
	{
		
		return size;
	}
	
	//add the node in the chain after the current node
	public void add(int addValue)
	{
		Node newNode = new Node();
		newNode.setValue(addValue);
		
		if(current == null)
		{
			current = newNode;
			lastCurrentNode = current;
			head = current;
			tail = current;
			current.setNext(current);
		}
		else
		{
			if(current.getNext() == head)
			{
				lastCurrentNode = current;
				current = newNode;
				lastCurrentNode.setNext(current);
				current.setNext(head);
				tail = current;
			}
			else
			{
				lastCurrentNode = current;
				current = newNode;
				current.setNext(lastCurrentNode.getNext());
				lastCurrentNode.setNext(current);
			}
		}
		
		size = size + 1;
		
		
	}
	
	//update the value on which current node refer
	public void update(int updateValue)
	{
		if(current != null)
		{
			current.setValue(updateValue);
		}
	}
	
	
}
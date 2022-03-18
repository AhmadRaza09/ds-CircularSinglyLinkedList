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
	
}
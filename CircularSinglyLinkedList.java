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
	
	//remove the current node from the chain
	public void remove()
	{
			//if list is empty then nothing to do
			if(current != null)
			{
				//if size is 1 then is mean only one nonde in chain so set all refrences to null
				if(size == 1)
				{
					current = null;
					head = null;
					tail.setNext(null);
					tail = null;
					lastCurrentNode = null;
				}
				else
				{
					//if the removal of the current node is the last element of chain then tail refrence also need to be changed
					if(current.getNext() == head)
					{
						tail = lastCurrentNode;
						
					}
					
					//remove the current node
				
					//if the current node is first node
					if(current == lastCurrentNode)
					{
						current = current.getNext();
						lastCurrentNode = current;
						head = current;
						tail.setNext(head);
						
					}
					else
					{
						
						lastCurrentNode.setNext(current.getNext());
						current = lastCurrentNode;
						
						//change the refrence of the lastCurrentNode
						Node temp = head;
						Node prev = head;
						
						while(temp != lastCurrentNode)
						{
							prev = temp;
							temp = temp.getNext();
						}
						lastCurrentNode = prev;
						
					}
					
					
				}
				
				//decrease chain size;
				size = size - 1;
			}
	}
	
	//find the value if find then point current to that node
	public boolean find(int findValue)
	{
		//for set current and lastCurrentNode
		Node temp = head;
		Node tempPrev = head;
		
		for(int i = 1; i <= size - 1; i++)
		{
			
			if(temp.getValue() == findValue)
			{
				lastCurrentNode = tempPrev;
				current = temp;
				return true;
			
			}
			tempPrev = temp;
			temp = temp.getNext();
		}
		
		return false;	
		
	}
	
	//update the value on which current node refer
	public void update(int updateValue)
	{
		if(current != null)
		{
			current.setValue(updateValue);
		}
	}

	//remove all the node from the chain
	public void clear()
	{
		if(current != null)
		{
			head = null;
			tail.setNext(null);
			tail = null;
			current = null;
			lastCurrentNode = null;
			size = 0;
		}
	}
	
	//get the value where current node piont, if current node is null then throws ListEmptyException
	public int get() throws ListEmptyException
	{
		if(current != null)
		{
			return current.getValue();
		}
		
		throw new ListEmptyException("List is empty");
		
	}
	
	
	//traversing list operation
	
	//move the current reference to the next node in the chain
	public boolean next()
	{
			
		if(head != null)
		{
			//if current next is connected to head
			if(current.getNext() == head)
			{
				lastCurrentNode = head;
				current = head;
			}
			else
			{
				lastCurrentNode = current;
				current = current.getNext();
			}
			return true;
		}
	
		//if current is not connected to the next node then return false
		return false;
	}
	
	//point the current to the tail
	public void tail()
	{
		current = tail;
		
		//change lastCurrentNode
		Node temp = head;
		lastCurrentNode = head;
		
		for(int i = 1; i <= size; i++)
		{
			
			if(lastCurrentNode != current)
			{
				
				temp = lastCurrentNode;
				lastCurrentNode = lastCurrentNode.getNext();
			}
			else
			{
			
				lastCurrentNode = temp;
				return;
			}
			
		}
		
	
		
	}
	
	//piont the current to the head
	public void start()
	{
		current = head;
		lastCurrentNode = head;
	}
	
	//piont current to the previous node in the chain
	public void back()
	{
		current = lastCurrentNode;
		
		//change lastCurrentNode
		Node temp = head;
		lastCurrentNode = head;
		
		for(int i = 1; i <= size; i++)
		{
			if(lastCurrentNode != current)
			{
				temp = lastCurrentNode;
				lastCurrentNode = lastCurrentNode.getNext();
			}
			else
			{
				lastCurrentNode = temp;
				return;
			}
		}
		
	}
	
}
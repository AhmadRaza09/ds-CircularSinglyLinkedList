/**
	Created By: Ahmad Raza
	Date: 18 Mar 2022

**/

public class CircularSinglyLinkedListDemo
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		CircularSinglyLinkedList l1 = new CircularSinglyLinkedList();
		
		l1.add(3);
		l1.add(4);
		l1.add(8);
		l1.add(12);
		l1.add(40);
		l1.add(85);
		l1.add(124);
		
		if(l1.find(85))
		{
			System.out.println(l1.get());
		}
		else
		{
			System.out.println("Not found");
		}
		
	

		
		
		
		
	
		
		
	}
}
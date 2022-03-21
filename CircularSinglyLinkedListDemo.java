/**
	Created By: Ahmad Raza
	Date: 18 Mar 2022

**/

public class CircularSinglyLinkedListDemo
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		CircularSinglyLinkedList l1 = new CircularSinglyLinkedList();
		
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		l1.tail();
		l1.remove();
		System.out.println("after: " + l1.get());
		l1.remove();
		System.out.println("after: " + l1.get());
		l1.remove();
		l1.start();
		System.out.println("after: " + l1.get());
		System.out.println("Remove");
		for(int i = 1; i <= l1.getSize(); i++)
		{
			
			System.out.print(l1.get());
			if(i < l1.getSize())
			{
				System.out.print("->");
			}
			l1.next();
		}
		
		System.out.println();
		
		
		
		
		
		
		
	

		
		
		
		
	
		
		
	}
}
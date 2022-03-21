/**
	Created By: Ahmad Raza
	Date: 18 Mar 2022

**/

public class CircularSinglyLinkedListDemo
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		CircularSinglyLinkedList l1 = new CircularSinglyLinkedList();
		l1.add(31);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l1.start();
		
		System.out.println("Through Current");
		System.out.println(l1.get());
		l1.next();
		System.out.println(l1.get());
		l1.next();
		System.out.println(l1.get());
		l1.next();
		System.out.println(l1.get());
		l1.next();
		System.out.println(l1.get());
		l1.next();
		System.out.println(l1.get());
	

		
		
		
		
	
		
		
	}
}
package collections;
//import java.util.*;
class MyLinkedList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	void add(int data)
	{
		Node toadd=new Node(data);
		if(head==null) 
		{
			head=toadd;
		}
		else
		{
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;	
		}
	}
	void print()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}
public class LinkedList
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyLinkedList mu=new MyLinkedList();
		mu.add(10);
		mu.add(20);
		mu.add(30);
		mu.add(310);
		mu.print();

	}

}

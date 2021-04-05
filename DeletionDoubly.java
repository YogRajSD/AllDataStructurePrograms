package collections;

import java.util.Scanner;

public class DeletionDoubly 
{
	static int l=0;
	Node head;
	Node tail;
	public class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	// Node created.
	void add(int data)
	{
		Node toadd=new Node(data);
		if(head==null)
		{
			head=tail=toadd;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=toadd;
			toadd.prev=temp;
			tail=toadd;
			l++;
			
		} 
	}
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void deleteFirst()
	{
		System.out.println("Deleting the first node");
		System.out.println("Sucessfully Deleted " + head.data);
		head=head.next;
		l--;
	}
	void deleteLast()
	{
		// Deleting using the tail refrence
		System.out.println("Deleting the last node");
		System.out.println("Sucessfully Deleted " + tail.data);
		tail.prev.next=null;
		l--;
	}
	void deleteYour(int pos)
	{
		System.out.println("Deleting the node from the Specific Position");
		Node temp=head;
		for (int i = 0; i < (pos-1); i++)
		{
			temp=temp.next;
			
		}
		System.out.println("Sucessfully Deleted " + temp.next.data);
		temp.next=temp.next.next;
		l--;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// All deletion cases in the doubly linked list
		Scanner sc=new Scanner(System.in);
		DeletionDoubly delete=new DeletionDoubly();
		delete.add(11);
		delete.add(22);
		delete.add(33);
		delete.add(55);
		delete.add(465);
		System.out.println("Length is "+l);
		delete.print();
		delete.deleteFirst();
		delete.deleteLast();
		delete.deleteYour(2);
		delete.print();
		System.out.println("Length is "+l);
	}

}

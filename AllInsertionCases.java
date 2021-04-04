package collections;

import java.util.Scanner;

import collections.InsertAtYourPosition.Node;

public class AllInsertionCases 
{
	Node head;
	Node tail;
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	// Node created
	void add(int data)
	{
		Node temp=head;
		Node toadd=new Node(data);
		if(head==null)
		{
			head=tail=toadd;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=toadd;
			tail=toadd;
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
	void addFirst(int data)
	{
		Node toadd=new Node(data);
		if(head==null)
		{
			head=tail=toadd;
		}
		else
		{
			toadd.next=head;
			head=toadd;
		}
	}
	void addLast(int data)
	{
		Node toadd=new Node(data);
		if(tail==null)
		{
			tail=toadd;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=toadd;
			tail=toadd;
		}
	}
	void InsertAtYour(int data,int pos)
	{
		Node toadd=new Node(data);
		Node temp=head;
		for(int i=0;i<(pos-1);i++)
		{
			temp=temp.next;
		}
		System.out.println("We are Adding new value");
		System.out.println("Earlier the previous value was " + temp.next.data);
		temp.next=toadd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AllInsertionCases ai=new  AllInsertionCases();
		ai.add(22);
		ai.add(44);
		ai.InsertAtYour(12, 0);
		ai.add(66);
		ai.addFirst(11);
		ai.addLast(88);
		ai.print();
//		System.out.println("Printing after addition");
//		ai.InsertAtYour(12, 0);
		ai.print();

	}

}

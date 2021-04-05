package collections;

import java.util.Scanner;

public class DeletionSingly 
{
	Node head;
	Node tail;
	static int l=0;
	public class Node
	{
		int data;
		Node next=null;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	void add(int data)
	{
		Node toadd=new Node(data);
		Node temp=head;
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
			Node temp=head;
			head=temp.next;
		}
		void deleteLast()
		{
			Node temp=head;
			Node tempsecond=null;
			while(temp.next!=null)
			{
				tempsecond=temp;
				temp=temp.next;
			}
			tempsecond.next=null;
		}
		void deleteAtyour(int pos)
		{
			Node temp=head;
			for(int i=0;i<(pos-1);i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		DeletionSingly ds=new DeletionSingly();
		ds.add(10);
		ds.add(20);
		ds.add(30);
		ds.add(40);
		ds.add(50);
		ds.add(60);
		System.out.println("Length of the string is " + l);
		System.out.println("Enter the postion for the deletion");
		int pos=sc.nextInt();
		if(pos==0)
		{
			System.out.println("Deleting the first node");
			ds.deleteFirst();
		}
		else if(pos==l)
		{
			System.out.println("Deleting the Last node");
			ds.deleteLast();
		}
		else if(pos>l)
		{
			System.out.println("You entered position is greater than the length of the Linked list");
		}
		else
		{
			System.out.println("Deleting the node at the specific position");
			ds.deleteAtyour(pos);
		}
		ds.print();
	}

}

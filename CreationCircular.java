package collections;

import collections.CircularLinkedList.Node;

public class CreationCircular 
{
	Node head;
	Node tail;
	public class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	//node created
	void add(int data)
	{
	Node toadd=new Node(data);
	if(head==null)
	{
		head=toadd;
		toadd.next=head;
	}
	else
	{
		
		Node temp=head;
		while(temp.next != head) 
		{
			temp = temp.next; 
		} 
		temp.next = toadd;
        toadd.next = head;   
        tail = toadd;  
	}
	}
	void addFirst(int data)
	{
		Node toadd=new Node(data);
		toadd.next=head;
		head=toadd;
		tail.next=head;
	}
	void addLast(int data)
	{
		Node toadd=new Node(data);
		tail.next=toadd;
		tail=toadd;
		tail.next=head;
	}
	void addAtYour(int pos,int data)
	{
		Node toadd=new Node(data);
		Node temp=head;
		for(int i=0;i<(pos-1);i++)
		{
			temp=temp.next;
		}
		toadd.next=temp.next.next;
		temp.next=toadd;
	}
	void print()
	{
		Node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreationCircular c= new CreationCircular();
		c.add(22);
		c.add(78);
		c.add(44);
		c.print();
		c.addFirst(4);
		c.addLast(100);
		c.addAtYour(2, 1515);
		c.print();

	}

}

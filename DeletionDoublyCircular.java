package collections;

public class DeletionDoublyCircular 
{
	Node head;
	Node tail;
	class Node
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
	// Node created
	void add(int data)
	{
		Node toadd=new Node(data);
		if(head==null)
		{
			head=toadd;
			toadd.prev=head;
			toadd.next=head;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			temp.next=toadd;
			toadd.prev=temp;
			toadd.next=head;
			tail=toadd;
		}
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
	void deleteFirst()
	{
		System.out.println("Deleted first node value is " + head.data);
		head=head.next;
		tail.next=head;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeletionDoublyCircular d=new DeletionDoublyCircular();
		d.add(10);
		d.add(20);
		d.add(30);
		d.print();
		d.deleteFirst();
		d.print();

	}

}

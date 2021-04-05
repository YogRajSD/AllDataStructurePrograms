package collections;

public class InsertionInDoubly
{
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
			prev=null;
		}
	}
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
			toadd.prev=temp;
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
		toadd.next=head;
		head=toadd;
	}
	void addLast(int data)
	{
		// Here we are Using the refrence of the tail pointer.
		Node toadd=new Node(data);
		tail.next=toadd;
		tail=toadd;
	}
	void addAtYour(int data,int pos)
	{
		Node toadd=new Node(data);
		Node temp=head;
		for(int i=0;i<(pos-1);i++)
		{
			temp=temp.next;
		}
		toadd.prev=temp;
		toadd.next=temp.next.next;
		temp.next=toadd;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InsertionInDoubly id=new InsertionInDoubly();
		id.add(11);
		id.add(22);
		id.add(33);
		id.print();
		System.out.println("Adding the reference to the first node");
		id.addFirst(0);
		id.addLast(11);
		id.addAtYour(56, 2);
		id.print();

	}

}

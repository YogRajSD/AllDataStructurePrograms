package collections;

public class DoublyCircularC
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
	// Node created.
	void create(int data)
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
			head.prev=toadd;
			tail=toadd;
		}
	}
	void addYur(int data,int pos)
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
			for(int i=0;i<(pos-1);i++)
			{
				temp=temp.next;
			}
			toadd.prev=temp;
			toadd.next=temp.next.next;
			temp.next=toadd;
			temp.next.next.prev=toadd;
			
		}
	}
	void disply()
	{
		Node temp=head;
		while (temp.next!=head)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DoublyCircularC d=new DoublyCircularC();
		d.create(87);
		d.create(74);
		d.create(7);
		d.addYur(45, 2);
		d.disply();
	}

}

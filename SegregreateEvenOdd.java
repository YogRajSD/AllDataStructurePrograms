package collections;
public class SegregreateEvenOdd
{
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		Node(int data)
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
			tail=toadd;
		}
	}
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print( " " + temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	void segrerate()
	{
		Node EvenHead=null;
		Node OddHead=null;
		Node EvenEnd=null;
		Node OddEnd=null;
		Node curr=head;
		while(curr!=null)
		{
			int x=curr.data;
			if(x%2==0)
			{
				if(EvenHead==null)
				{
					EvenHead=EvenEnd=curr;
				}
				else
				{
					EvenEnd.next=curr;
					EvenEnd=curr;
				}
			}
			else
			{
				if(OddHead==null)
				{
					OddHead=OddEnd=curr;
				}
				else
				{
					OddEnd.next=curr;
					OddEnd=curr;
				}
			}
			curr=curr.next;
		}
		// Putting all the even nodes at the head of the linked list.
		if(EvenHead!=null)
		{
			this.head=EvenHead;
		}
		// Linking all the odd nodes to even node
		if(EvenEnd!=null)
		{
			EvenEnd.next=OddHead;
		}
		// Adding null to the end
		if(OddEnd!=null)
		{
			OddEnd.next=null;
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SegregreateEvenOdd eo=new SegregreateEvenOdd();
		eo.add(11);
		eo.add(50);
		eo.add(21);
		eo.add(34);
		System.out.println("Priting before");
		eo.print();
		eo.segrerate();
		System.out.println("Printing after");
		eo.print();
	}

}

package collections;

public class RemoveDuplicates 
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
	void remove()
	{
		Node curr=head;
		Node nextNode=null;
		while(curr!=null && curr.next!=null)
		{
			nextNode=curr.next;
			if(curr.data==nextNode.data)
			{
				curr.next=nextNode.next;
			}
			else
			{
				curr=curr.next;
			}
		}
		
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RemoveDuplicates rd=new RemoveDuplicates();
		rd.add(4);
		rd.add(7);
		rd.add(7);
		System.out.println("Printing before removing duplicates");
		rd.print();
		rd.remove();
		System.out.println("Printing after removed duplicates");
		rd.print();

	}

}

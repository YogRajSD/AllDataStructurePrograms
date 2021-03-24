package collections;

public class ReverseSingly
{
	Node head;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	void add(int x)
	{
		Node toadd=new Node(x);
		Node temp=head;
		if(head==null)
		{
			head=toadd;
		}
		else
		{
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=toadd;
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
	void reverse()
	{
		Node prevnode=null;
		Node currentnode=head;
		Node nextnode=head;
		while(currentnode!=null)
		{
			nextnode=nextnode.next;
			currentnode.next=prevnode;
			prevnode=currentnode;
			currentnode=nextnode;
		}
		head=prevnode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSingly rs=new ReverseSingly();
		rs.add(12);
		rs.add(45);
		rs.add(75);
		rs.add(79);
		System.out.println("Printing BEFORE Reversing");
		rs.print();
		System.out.println("Printing AFTER reversing");
		rs.reverse();
		rs.print();

	}

}

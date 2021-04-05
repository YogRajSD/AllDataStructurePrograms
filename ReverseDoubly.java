package collections;

public class ReverseDoubly 
{
		Node head;
		Node tail;
		class Node
		{
			int data;
			Node next=null;
			Node prev;
			public Node(int data)
			{
				this.data=data;
				prev=null;
				next=null;
			}
		}
		// Node created 
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
				toadd=tail;
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
			Node currentNode=head;
			Node nextNode=head;
			Node prev=null;
			Node temp=null;
			while(currentNode!=null)
			{
				temp=currentNode.prev;
				currentNode.prev=currentNode.next;
				currentNode.next=temp;
				currentNode=currentNode.prev;
			}
			if(temp!=null)
			{
				head=temp.prev;
			}
		}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ReverseDoubly reverse=new ReverseDoubly();
		reverse.add(2);
		reverse.add(4);
		reverse.add(6);
		reverse.add(8);
		reverse.print();
		System.out.println("Printing the reverse");
		reverse.reverse();
		reverse.print();
	}

}

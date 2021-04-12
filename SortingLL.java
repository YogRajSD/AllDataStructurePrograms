package collections;
public class SortingLL
{
	Node head;
	Node tail;
 static class Node
{
	
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		next=null;
	}
}
void add(int data)
{
	Node temp=head;
	Node toadd=new Node(data);
	if(temp==null) {
		head=toadd;
	}
	else {
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;
		tail=toadd;
	}
}
void print()
{
	Node temp=head;
	while(temp!=null) {
		System.out.print(" " + temp.data);
		temp=temp.next;
	}
	System.out.println();
}
void sort()
{
	Node curr=head;
	Node nextNode=curr.next;
	while(curr.next!=null)
	{
		nextNode=curr.next;
		if(curr.data>nextNode.data)
		{
			int t=curr.data;
			curr.data=nextNode.data;
			nextNode.data=t;
		}
		curr=curr.next;
	}
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SortingLL s=new SortingLL();
		s.add(10);
		s.add(5);
		s.add(20);
		s.add(12);
		System.out.println("Printing before sorting");
		s.print();
		s.sort();
		System.out.println("Printing after sorting");
		s.print();

	}

}

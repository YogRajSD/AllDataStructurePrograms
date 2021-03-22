package collections;

//import collections.NewLinkedList.Node;

public class Deletion 
{
	Node head;
	class Node{
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
		Node ne=new Node(data);
		
		if(head==null)
		{
			head=ne;
		}
		 else
		   {
			   Node temp=head;
			   while(temp.next!=null)
			   {
				  temp=temp.next;
			   }
			   temp.next=ne;
		   }
	}
	void print() {
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	void deleteFirst()
	{
//		Node temp=head;
		head=head.next;
	}
	void deleteLast()
	{
		Node temp=head;
		while (temp.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Deletion d=new Deletion();
		d.add(12);
		d.add(45);
		d.add(87);
		d.print();
//		System.out.println("We are Deleting the First Node");
//		d.deleteFirst();
//		d.print();
		System.out.println("We are Deleting the Last Node");
		d.deleteLast();
		d.print();
	}

}

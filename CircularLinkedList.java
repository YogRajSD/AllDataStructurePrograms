package collections;

public class CircularLinkedList 
{
	Node head;
	Node tail;
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
                temp = temp.next;  
            toadd.next = head;   
            temp.next = toadd;   
            tail = toadd;  
		}
	}
	void addFirst(int x)
	{
		Node toadd=new Node(x);
		toadd.next=head;
		head=toadd;
		tail.next=head;
	}
	void addLast(int x)
	{
		Node toadd=new Node(x);
		tail.next=toadd;
		tail=toadd;
		tail.next=head;
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
		CircularLinkedList  cll=new CircularLinkedList ();
		cll.add(10);
		cll.add(20);
		cll.add(45);
		cll.add(464);
//		cll.print();
		System.out.println("Adding Node to the First Point");
		cll.add(23);
		cll.print();
		System.out.println("Adding Node to the Last Point");
		cll.addLast(1000);
		cll.print();

	}

}

package collections;
public class KthdromEnd 
{
	Node head;
	Node tail;
	static int l;
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
		l++;
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
	void kth(int lcopy)
	{
		Node temp=head;
		int k=l-lcopy;
		for(int i=0;i<k;i++)
		{
			temp=temp.next;
		}
		System.out.println("K th Node is " + temp.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KthdromEnd k=new KthdromEnd();
		k.add(10);
		k.add(45);
		k.add(74);
		k.add(78);
		k.add(12);
		k.print();
		System.out.println("Length of Linked list"+ l);
		k.kth(3);

	}

}

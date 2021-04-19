package allStack;
public class UsingLinkedList 
{
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
	public UsingLinkedList() {
		// TODO Auto-generated constructor stub
		head=null;
	}	
		int size;
		Node head;
		void size()
		{
			System.out.println("Size of the stack is " + size);
		}
		void isEmpty()
		{
			if(head.next==null)
			{
				System.out.println("Given stack is empty");
			}
			else
			{
				System.out.println("Given stack is not empty");
			}
		}
		private void push(int data)
		{
			Node toadd=new Node(data);
			toadd.next=head;
			head=toadd;
		}
		void pop()
		{
			if(head.next==null)
			{
				System.out.println("Given stack is empty ");
			}
			else
			{
				int res=head.data;
				System.out.println("Popped item is " + res);
				head=head.next;
			}
		}
		void peek()
		{
			int res=head.data;
			System.out.println("Topmost element is " + res);
		}
//	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		UsingLinkedList u=new UsingLinkedList();
		u.push(10);
		u.peek();
		u.push(45);
		u.peek();
	}
}

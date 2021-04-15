package collections;
public class FindingMiddle 
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
 void push(int data)
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
 		System.out.println(temp.data);
 		temp=temp.next;
 	}
 }
 void find()
 {
	 Node slow=head;
	 Node fast=slow.next.next;
	 while(fast!=null && fast.next!=null)
	 {
		 slow=slow.next;
		 fast=fast.next.next;
	 }
	 System.out.println(slow.data);
 }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindingMiddle middle=new FindingMiddle();
		middle.push(10);
		middle.push(45);
		middle.push(74);
		middle.push(41);
		middle.push(1220);
		middle.push(45);
		middle.find();
//		middle.print();

	}

}

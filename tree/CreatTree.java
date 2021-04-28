package intro;
import intro.Creation;
//class Node
//{
//	int key;
//	Node leftC;
//	Node rightC;
//	Node(int a)
//	{
//		key=a;
//		leftC=rightC=null;
//	}
//}
public class CreatTree 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Node root=new Node(20);
		root.left=new Node(10);
		root.right=new Node(30);
		System.out.println("Value of the root node is " + root.key);
		System.out.println("Value of left child of root node is " + root.left.key);
		
	}

}

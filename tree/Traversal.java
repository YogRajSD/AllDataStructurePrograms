package intro;
import intro.Creation;
public class Traversal 
{

	static void print(Node root)
	{
		System.out.println(root.key);
		System.out.println(root.left.key);
		System.out.println(root.right.key);
	}
	static void inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.key);
			inorder(root.right);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node root=new Node(10);
		root.left=new Node(20);
		root.right=new Node(30);
//		print(root);
		inorder(root);
	}

}

package intro;

import java.util.Scanner;

public class CreationOfBinaryTree 
{
	static Scanner sc=null;
	public static void main(String[] args)
	{
		sc=new Scanner(System.in);
		ListNode root=createTree();
		System.out.println("root is " + root.data);
//		inorder(root);
//		preorder(root);
		postorder(root);
	}
	static ListNode createTree()
	{
		ListNode root=null;
		System.out.println("Enter data");
		int d=sc.nextInt();
		if(d==-1) return null;
		root=new ListNode(d);
		System.out.println("Enter data for left " + d);
		root.left=createTree();
		System.out.println("Enter data for right " + d);
		root.right=createTree();
		return root;
	}
	static void inorder(ListNode root)
	{
		if(root==null) return ;
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
	}
	static void preorder(ListNode root)
	{
		if(root==null) return ;
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	static void postorder(ListNode root)
	{
		if(root==null) return ;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
	}
}
class ListNode
{
	int data;
	ListNode left;
	ListNode right;
	public ListNode(int d)
	{
		this.data=d;
	}
}

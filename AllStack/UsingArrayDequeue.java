package allStack;

import java.util.ArrayDeque;

public class UsingArrayDequeue 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayDeque<Integer>a=new ArrayDeque<>();
		a.push(10);
		a.push(20);
		a.push(30);
		a.pop();
		System.out.println(a.peek());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
	}

}

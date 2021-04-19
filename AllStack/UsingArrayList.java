package allStack;

import java.util.ArrayList;

public class UsingArrayList 
{
	ArrayList<Integer> al =new ArrayList<>();
	void push(int data)
	{
		al.add(data);
		System.out.println("Added");
	}
	
	void pop()
	{
		if(al.size()<=0) {
			System.out.println("Underflow condition");
		}
		else {
		int res=al.get(al.size()-1);
		al.remove(al.size()-1);
		System.out.println("Popped item is " + res);
		}
	}

	void isEmpty()
	{
		if(al.size()<=0) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Stack is not empty");
		}
	}
	
	void peek()
	{
		int peek=al.get(al.size()-1);
		System.out.println("The topmost element is " + peek);
	}
	
	void size()
	{
		System.out.println("Size of the stack is " + al.size());
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		UsingArrayList a=new UsingArrayList();
		a.push(10);
		a.push(20);
		a.pop();
		a.peek();
		a.pop();
		a.isEmpty();
		a.pop();

	}

}

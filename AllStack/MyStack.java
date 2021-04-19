package allStack;

	public class MyStack
	{
		int cap;
		int arr[];
		int top;
    MyStack(int c)
    {
	   this.cap = c;
	   this.top=-1;
	   this.arr=new int[cap];
    }
    void push(int data)
    {
    	top++;
    	arr[top]=data;
    	System.out.println("Data Enterd Sucessfully");
    }
    void pop()
    {
    	int popped=arr[top];
    	System.out.println("Pooped item is " + popped);
    	top--;
    }
    void peek()
    {
    	int ele=arr[top];
    	System.out.println("Peeked element is " + ele);
    }
    void isEmpty()
    {
    	if(top==-1)
    	{
    		System.out.println("Stack is empty");
    	}
    	else
    	{
    		System.out.println("Stack is not empty");
    	}
    }
    void size()
    {
    	int siz=top+1;
    	System.out.println("Size of the stack is " + siz);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyStack s=new MyStack(10);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.peek();
		s.pop();
		s.size();
		s.isEmpty();
	}
}

package allStack;

public class TwoStacksInOneArray 
{
	int cap;
	int top1;
	int top2;
	int arr1[];
	public TwoStacksInOneArray(int c)
	{
		// TODO Auto-generated constructor stub
		cap=c;
		top1=-1;
		top2=cap;
		arr1=new int[c];
	}
	void push1(int data)
	{
		if(top1<top2-1)
		{
			top1++;
			arr1[top1]=data;
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Overflow condition");
		}
		
	}
	
	void push2(int data)
	{
		if(top1< top2 - 1)
		{
			top2--;
			arr1[top2]=data;
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Overflow condition");
		}
	}
	
	void pop1()
	{
		if(top1 <0)
		{
			System.out.println("Underflow condition");
		}
		else
		{
			int res=arr1[top1];
			System.out.println("Popped item is " + res);
			top2--;
		}
	}
	
	void pop2()
	{
		if(top2<cap)
		{
			int res=arr1[top2];
			top2++;
			System.out.println("Popped item is "+ res);
		}
		else
		{
			System.out.println("Underflow condition");
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacksInOneArray t=new TwoStacksInOneArray(2);
		t.push1(10);
		t.push2(20);
		t.pop1();
		t.pop2();
	}

}

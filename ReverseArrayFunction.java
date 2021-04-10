package array;

public class ReverseArrayFunction 
{
	static void reverse(int arr[])
	{
		int low=0,high=arr.length-1;
		while(low<=high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low=low+1;
			high=high-1;
		}
	}
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {10,20,30};
		reverse(arr);
		print(arr);

	}

}

package array;

public class LeftRotation
{
	static void rotate(int arr[])
	{
		int temp=arr[0];
		int i,n=arr.length;
		for(i=1;i<=n-1;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=temp;
	}
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		print(arr);
		rotate(arr);
		print(arr);
	}

}

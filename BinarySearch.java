package array;

public class BinarySearch 
{
	static int FindLargest(int arr[])
	{
		int l=0,h=arr.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==arr[h])
				return arr[mid];
			else if(arr[mid]<arr[mid+1])
				l=mid+1;
			else
				h=mid-1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		System.out.println(FindLargest(arr));

	}

}

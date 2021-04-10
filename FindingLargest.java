package array;

public class FindingLargest 
{
	static int Largest(int arr[])
	{
		int large=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=Math.max(large, arr[i]);
			}
		}
		return large;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Large[]= {110,512,112,105,512};
		System.out.println(Largest(Large));

	}

}

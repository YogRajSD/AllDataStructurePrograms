
package array;

public class RemoveDuplicates
{
	static void remove(int arr[])
	{
		int temp[]=arr;
		int res=1;
		temp[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=temp[res-1])
			{
				temp[res]=arr[i];
				res++;
			}
			System.out.println(temp[res]);
		}
//		for(int i=0;i<temp.length;i++)
//		{
			
//		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,10,20,20,30};
		remove(arr);

	}

}

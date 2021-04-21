package array;

public class VotingAlgo
{

	static int checkMajority(int arr[])
	{
		int count=1,i;
		int majorindex=0;
		
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[majorindex]==arr[i])
			{
				count++;
			}
			else
			{
				count--;
			}
		}
			if(count==0)
			{
				majorindex=i;
				count=1;
			}
		return arr[majorindex];
	}
	
	static void check(int arr[],int a)
	{
		int c=0,i;
		int l=arr.length;
		int lh=l/2;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				c++;
			}
			if(c>=lh)
			{
				System.out.println(arr[i]);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int arr[]= {405,1,405,5,1,4,405,405};
		int a=checkMajority(arr);
		check(arr,a);

	}

}

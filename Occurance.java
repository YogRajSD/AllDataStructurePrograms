package array;

public class Occurance 
{
	static void firstou(int arr[],int target)
	{
		int last=-1,i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("The First Occurance is " + i);
				break;
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]==target)
			{
				last=k;
			}
		}
		System.out.println("The Last Occurance is " + last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,7,8,8,10,8,10,8,4,14};
		firstou(arr,8);
	}

}

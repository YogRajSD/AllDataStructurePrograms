package array;

import java.util.Scanner;

public class TernerySearch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data to search ");
		int tosearch=sc.nextInt();
		int r=arr.length-1;
		int l=0;
		int t=ternery(l,r,tosearch,arr);
		if(t>=0) {
			System.out.println("Your element is present at " + t + " Position");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}

	static int ternery(int l,int r,int K,int arr[])
	{
		int mid1=l+(r-l)/3;
		int mid2=r-(r-l)/3;
		if(r>=l)
		{
		if (arr[mid1]==K)
		{
			return mid1;
		}
		if (arr[mid2]==K)
		{
			return mid2;
		}
		if(arr[mid1]>K)
		{
			return ternery(l,mid1-1, K, arr);
		}
		else if(K>arr[mid2])
		{
			return ternery(mid2 + 1, r,K,arr);
		}
		else
		{
			return ternery(mid1 + 1, mid2 - 1,K,arr);
		}
		}
		return -1;
	}
}

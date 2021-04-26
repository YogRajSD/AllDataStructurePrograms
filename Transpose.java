package array;

import java.util.Scanner;

public class Transpose 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][3];
		
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < 2; i++) {
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		//printing array elements
		
		for (int j = 0; j < 3; j++) {
			for(int i=0;i<2;i++)
			{
				System.out.print( " " +arr[i][j]);
			}
			System.out.println();
		}
		
		
		

	}

}

package bitwiseOperater;

public class SetBits
{
	static int countset(int n)
	{
		int c=0;
		if(n==0)
		{
			return 0;
		}
		else
		{
			while(n>0)
			{
				n=n&(n-1);
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Q. Calculate number of set bits in number
		// I/p - 5
		// O/p -  2
		System.out.println(countset(7));

	}
}

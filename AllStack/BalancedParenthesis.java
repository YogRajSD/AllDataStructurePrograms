package allStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis 
{
	
	static boolean match(char a,char b)
	{
		return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
	}
	static boolean check(String str)
	{
		Deque<Character>s=new ArrayDeque<>();
        for(int i=0;i<str.length();i++)	
		{
			char x=str.charAt(i);
			
			if(x=='(' || x=='{' || x=='[')
			{
				s.push(x);
			}
			else 
			{
				if(s.isEmpty()==true)
				{
					return false;
				}
				else if(match(s.peek(),x)==false)
				{
					return false;
				}
				else
				{
					s.pop();
				}
			}
		}
	return (s.isEmpty());
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="{{{[}}}";
		if(check(str))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not balanced");
		}
	}
}

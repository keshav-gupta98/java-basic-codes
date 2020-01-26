// find all substring starting or ending with '0' or '1'
import java.util.*;
class startingndendingwith10
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<=str.length();j++)
		{
			String s=str.substring(i,j);
			if((s.charAt(0)=='0'&&s.charAt(s.length()-1)=='0')||(s.charAt(0)=='1'&&s.charAt(s.length()-1)=='1'))
			System.out.println(s);	
		}	
	}	
	}
}
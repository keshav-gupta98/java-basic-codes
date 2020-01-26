// find substring containing max. consecutive 1
import java.util.*;
class maxconsec1instring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		int n=0;
		StringTokenizer t=new StringTokenizer(str,"0");
		while(t.hasMoreTokens())
		{
			String s=t.nextToken();
			n++;
		}
		int arr[]=new int[n];
		int k=0;
		StringTokenizer d=new StringTokenizer(str,"0");
		while(d.hasMoreTokens())
		{
			String s=d.nextToken();
			count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='1')
				{
					count++;
				}
			}
			arr[k]=count;
			k++;
		} 
		int max=arr[0];
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
				index=i;
		}
		int temp=0;
		StringTokenizer e=new StringTokenizer(str,"0");
		while(e.hasMoreTokens())
		{
			String s=e.nextToken();
			if(temp==index)
				System.out.println(s);
			temp++;
		}
	}
}
	

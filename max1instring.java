// find substring with max frequency of '1'
import java.util.*;
class max1instring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int sum=0;
		for(int i=0;i<=str.length();i++)
			sum=sum+i;
        int arr[]=new int[sum];
        int count=0;
        int l=0;
        for(int i=0;i<str.length();i++)
        {
        	for(int j=1;j<=str.length();j++)
        	{
        		if(i<j)
        		{
        			String s=str.substring(i,j);
        			count=0;
        			for(int k=0;k<s.length();k++)
        			{
        				if(s.charAt(k)=='1')
        				{
        					count++;
        				}
        			}
                    arr[l]=count;
                    l++;
        		}
        	}
        }
        int max=arr[0];
        for (int i=0;i<sum ;i++ )
        {
        	if(max<arr[i])
        	{
        		max=arr[i];
            }
        }
        count=0;
        for (int i=0;i<str.length() ;i++ )
        {
          for(int j=i+1;j<=str.length();j++)
          {
          if(i<j)
          {
          	count=0;
          	String s=str.substring(i,j);
          	for(int k=0;k<s.length();k++)
          	{
               if(s.charAt(k)=='1')
               {
               	count++;
               }
          	}
          	if(max==count)
          		System.out.println(s);
          }	
          }	
        }
	}
}

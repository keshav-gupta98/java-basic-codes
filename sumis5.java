// find all elements in array with sum = 5
import java.util.*;
class sumis5
{ 
	public static void main(String args[]) 
    {  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
	 		for(int j=i;j<n;j++)
			{
	  			if(arr[i]+arr[j]==5)
	   			{
	    			System.out.println(arr[i]+","+arr[j]);
	   			}
	  		}
	 	}	
	}
}
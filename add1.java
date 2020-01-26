//add 1 to each digit of number

import java.util.*;
class add1
{ 
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
	    int x=n,c=0,sum=0;
	 	while(x!=0)
	 	{
	  		c++;
	  		x=x/10;
	 	}
	 	for(int i=0;i<c;i++)
	 	{
	  		sum=sum*10+1;
	 	}
        n=n+sum;
	 	System.out.print("The no. after adding 1 to each digit is :");
	 	System.out.println(n);
	}
} 
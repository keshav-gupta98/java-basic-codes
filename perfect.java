// find wheter a number is perfect number or not
import java.util.*;
class perfect
{ 
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
	 	int x=n,i=1,sum=0;
	 	while(i!=n)
	 	{
	  		if(x%i==0)
	  		{
	   			sum=sum+i;
	  		}
	  		i++;
	 	}
	 	if(sum==n)
	 	System.out.println("Yes");
	 	else
		System.out.println("No");
	}
}
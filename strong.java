// find whether a number is strong number or not
import java.util.*;
class strong
{ 
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
	 	int x=n,a,c=1,sum=0;
	 	while(x!=0)
	 	{
	  		a=x%10;
	  		int f=1,s=2;
	  		if(a==1||a==2)
	  			c=a;
 	  		else
	  			for(int i=2;i<=a;i++)
	  			{
	   				c=f*s;
	   				s=s+1;
	   				f=s;
	   				s=c;
	  			}
	  
 	  		sum=sum+c;
	  		x=x/10;
	 	}
	 	if(sum==n)
	  		System.out.println("Yes");
	 	else
	 		System.out.println("No");
	}
}
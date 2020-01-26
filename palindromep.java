// find whether a number is palindrome as well as prime number
import java.util.*;
class palindromep
{ 
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
	 	int c=0;
	 
	 	for(int i=1;i<n;i++)
	 	{
	  		if(n%i==0)
	 		{
	  			c++;
	 		}
	 	}
	 	boolean t;
	 	if(c==1)
	 		t=true;
	 	else 
	 		t=false;
	 	int x=n;
        	int a=0,b;
	 	while(x!=0)
	 	{
	  		b=x%10;
	  		a=a*10+b;
	  		x=x/10;
	 	} 
	 	boolean s;
	 	if(a==n)
	 		s=true;
	 	else
	 		s=false;
	 	if(s==true&&t==true)
	 		System.out.println("Yes");
	 	else
	 		System.out.println("No");
	}
}
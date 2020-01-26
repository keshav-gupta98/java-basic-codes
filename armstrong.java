//chack whether a number is armstrong number or not 
// e.g 371=3^3 + 7^3 + 1^3
import java.util.*;
import java.lang.Math;


class armstrong
{ 
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
	 	int x=n,a,c=0,b,sum=0;
	 	while(x!=0)
	 	{
	  		x=x/10;								//counting digits
	  		c++;
	 	}
	 	x=n;
	 	while(x!=0)
	 	{
	  		a=x%10;
	  		b=(int)Math.pow(a,c);
	  		sum=sum+b;
	  		x=x/10;
	 	}
	 	if(sum==n)
	 		System.out.println("Yes the number "+n+" is an armstrong number.");
	 	else
	 		System.out.println("No the number "+n+" is an armstrong number.");
	}
}
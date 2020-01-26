// find whether a number is palindrome
import java.util.*;
class palindrome
{ 
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
  	 	int x=n;
        int a=0,b;
	 	while(x!=0)
	 	{
	  		b=x%10;
	  		a=a*10+b;
	  		x=x/10;
	 	} 
	 	if(a==n)
	 	{
	  		System.out.println(n+" is palindrome");
	 	}
	 	else System.out.println(n+"is not Palindrome");
	}
}

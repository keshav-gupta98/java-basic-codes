import java.util.*;
class nprimeno
{ 
	public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
		int a=2,c=0,ct=0,b=0;
		while(ct!=n)
		{
		c=0;
		for(int j=1;j<a;j++)
		{
		if(a%j==0)
		c++;
		}
		if(c==1)
		{ct++;
		b=a;}
		a++;
		
		}
		System.out.println("The "+n+" prime number is "+b);
		}
}
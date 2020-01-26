// reverse the given number
import java.util.*;
class reverse_number
{ 
	public static void main(String args[]) 
    {
		System.out.println("enter the number :");	
         Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int a,b;
		a=0;
		while(x!=0)
		{
			b=x%10;
			a=a*10+b;
			x=x/10;	
		}
		System.out.println(a);	
	}
}  
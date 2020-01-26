// swap first and last digit of number
import java.util.*;
class swapfn
{ 
	public static void main(String args[]) 
    {
	 	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
	 	int a=0,b=0,x=n,ct=0;
	 	while(x!=0)
	 	{
	  		x=x/10;
	  		ct++;
	 	}
	 	x=n;
	 	int j=1;
		while(x!=0)
		{
			if(j==1)
			a=x%10;//first digit
			if(j==ct)
			b=x%10;//last digit
			x=x/10;
			j++;
		}
		x=n/10;
		int z,sum=b,t=10;
		for(int i=1;i<(ct-1);i++)
		{
			z=x%10;
			sum=sum+z*t;
			x=x/10;
			t=t*10;
		}
		sum=sum+a*t;
		System.out.print("The no. after swapping first and last digit is:");
		System.out.print(sum);
	}
}
// print words of string in ascending order
import java.util.*;
class ascendingorderstring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] token=str.split(" ");
		int count=0;
		int test=token.length-1;
		int a=1;
		while(a<=token.length)
		for(int i=0;i<token.length;i++)
		{
			count=0;
           for(int j=0;j<token.length;j++)
           {
           	int x=token[i].compareToIgnoreCase(token[j]);
           	if(x<0)
           		count++;
           }
           if(count==test)
           {
           	if(a!=token.length)
           	{System.out.print(token[i]+" ");
           	test--;
           	a++;}
           	else
           	{
           		System.out.print(token[i]);
           	test--;
           	a++;
           	}
           }
		}
	}
}
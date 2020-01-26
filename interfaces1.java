// Interfaces Example
import java.util.*;
interface a 
{
	int length();
	int bredth();
}
interface b extends a
{
    int area();
}
class balle implements b
{
	int l;
	int b;
	public int length()
	{
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		return l;
	}
    public int bredth()
    {
    	Scanner sc=new Scanner(System.in);
    	b=sc.nextInt();
    	return b;
    }
    public int area()
    {
    	return l*b;
    }
}
class interfaces1
{
	public static void main(String[] args) 
	{
	   balle obj;
	   obj=new balle();
	   int c=obj.length();
	   int d=obj.bredth();
	   System.out.println("Length of rectangle is "+c);
	   	   System.out.println("Length of rectangle is "+d);
	   System.out.println("Length of rectangle is "+obj.area());
	}
}
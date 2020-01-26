import java.util.*;
abstract class rate
{
   int p,t;
   rate(int p,int t)
   {
   	this.p=p;
   	this.t=t;
   }
   	abstract int interest();
}
class ratea  extends rate
{
	ratea(int p,int t)
	{
		super(p,t);
	}
	int interest()
	{
		return p*t*12/100;
	}
}
class rateb extends rate
{
	rateb(int p,int t)
	{
		super(p,t);
	}
	int interest()
	{
		return p*t*8/100;
	}
}
class ratec extends rate
{
	ratec(int p,int t)
	{
		super(p,t);
	}
	int interest()
	{
		return p*t*10/100;
	}
}
class abstractdemo
{
	public static void main(String[] args) {
		rate A=new ratea(10000,2);
		System.out.println(A.interest());
		rate B=new ratea(10000,3);
		System.out.println(B.interest());
		rate C=new ratea(10000,4);
		System.out.println(C.interest());
	}
}
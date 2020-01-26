import java.util.*;
interface circle 
{
  void Circleradius();
  double CircleArea();
}
interface square
{
	void squaredimensions();
	int squareArea();
}
class balle implements circle,square
{
	int l,b;
	public void Circleradius()
	{
		Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
	}
	public double CircleArea()
	{
		return (double)3.14*l*l; 
	}
	public void squaredimensions()
	{ 
           Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
	}
	public int squareArea()
	{
		return l*b;
	}
}
class interfaces2
{
	public static void main(String[] args) {
		balle obj=new balle();
		obj.Circleradius();
		double c=obj.CircleArea();
		System.out.println(c+" area of circle");
		obj=new balle();
		obj.squaredimensions();
        int d=obj.squareArea();
        System.out.println(d+" is area of square"); 
	}
}

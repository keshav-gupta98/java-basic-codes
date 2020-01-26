import java.util.*;
class transpose
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the the no. of rows");
	 int r=sc.nextInt();
	 System.out.print("Enter the the no. of cols");
	 int c=sc.nextInt();
	 int [][]arr=new int[r][c];
	 int [][]brr=new int[c][r];
	 for(int i=0;i<r;i++)
	 for(int j=0;j<c;j++)
	 arr[i][j]=sc.nextInt();
	 for(int i=0;i<r;i++)
	 for(int j=0;j<c;j++)
	 brr[j][i]=arr[i][j];
	 for(int i=0;i<c;i++)
	 {for(int j=0;j<r;j++)
	 {System.out.print(brr[i][j]+" ");}
	 System.out.println();}
	}
}
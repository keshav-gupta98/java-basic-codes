// print frequency of each character in string
import java.util.*;
class frequencystring
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=1;
		String f="";
		for(int i=0;i<s.length();i++)
		{
			count=1;
			int flag=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			for(int k=0;k<f.length();k++)
					{
						if(s.charAt(i)==f.charAt(k))
						{
							flag=1;
							break;
						}
					}
					if(flag==0)
			f=f+s.charAt(i)+count;
		}
		System.out.print(f);
		sc.close();
	}
}
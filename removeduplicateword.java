// remove duplicate words from given string

import java.util.*;
class removeduplicateword
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] tokens=str.split(" ");
		String s="";
		for(int i=0;i<tokens.length;i++)
		{
			if(tokens[i]!=null)
			{
				for(int j=i+1;j<tokens.length;j++)
			{
				if(tokens[i].equals(tokens[j]))
				{
					tokens[j]=null;
				}
			}
		    }
		}
		for(int i=0;i<tokens.length;i++)
		{
			if(tokens[i]!=null)
			{
				if(i<(tokens.length-1))
				{
					s=s+tokens[i]+" ";

				}
				else
					s=s+tokens[i];
			}
			
		}
		System.out.print(s);
	}
}
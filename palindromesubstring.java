// find all palindromic substrings
import java.util.*;

public class palindromesubstring
{
  
	public static void main (String[]args)
  
	{
    
		Scanner sc=new Scanner(System.in);
    
		String s=sc.nextLine();
        
		for(int i=0;i<s.length();i++)
        
		{
            
			for(int j=1;j<=s.length();j++)
            
			{
                
				if(i<j)
                
				{
                    
					String a=s.substring(i,j);
                    	
					String []str=new String[a.length()];
					str[0]=a.substring(a.length()-1,a.length());
					if(a.length()>=2)
					{
						int x=1;
						for(int k=a.length()-2;k>=0;k--)
						{
							str[x]=a.substring(k,k+1);
							x++;
						}
					}
					String z=new String(str[0]);
					if(a.length()>=2)
					for(int v=1;v<a.length();v++)
					{
						z=z+str[v];
					}
					if(z.equals(a)==true)
					System.out.println(a);
				}
            
			}
        
		}
  
	}	

}

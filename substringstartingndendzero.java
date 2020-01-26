// find all substring starting and ending with zero
import java.util.*;

public class substringstartingndendzero
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
                    	
					if(a.charAt(0)=='0'&&a.charAt(a.length()-1)=='0')
                    
					{
                        
						System.out.println(a);
                    
					}
                
				}
            
			}
        
		}
  
	}	

}

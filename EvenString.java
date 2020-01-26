// Print all possible even length strings possible
import java.util.*;

public class EvenString

{
  
	public static void main (String[]args)
  
	{
      
		Scanner sc=new Scanner(System.in);
      
		String s=sc.nextLine();
      
		for(int x=1;x<=s.length();x++)
      
		{
      
			for(int i=0;i<s.length();i++)
      
			{
          
				for(int j=1;j<=s.length();j++)
          
				{
              
					if(i<j)
              
					{
              
						String a=s.substring(i,j);
              
						if((a.length()==x)&&(a.length()%2==0))
              	
						{
                  
							System.out.println(a);
              
						}
              
					}
          
				}
      
			}
      
		}
  
	}

}

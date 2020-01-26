// count number of vowels in substring
import java.util.*;

public class number_vowelsinsubstring
{

	public static void main(String[] args) 

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

	                                        int count=0;

	                                        for(int k=0;k<j-i;k++)

	                                        {

	                                        	if((a.charAt(k)=='a')||(a.charAt(k)=='e')||(a.charAt(k)=='i')||(a.charAt(k)=='o')||(a.charAt(k)=='u'))

	                                                {
	                        
                                                        	count++;

	                                                }

	                                        }

	                                        if(a.length()==x)

	                                        System.out.println("The no. of vowels in "+a+" are: "+count);

                           	          }

	                          }

	               }

	       }

	}

}

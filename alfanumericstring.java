// find all alphanumeric substrigs

import java.util.*;
class alfanumericstring
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String s = "";
		System.out.println("The alfanumericstrings are:");
		for( int i = 0; i < str.length(); i++ )
		{
			for( int j = i + 1; j <= str.length(); j++ )
			{
				int count = 0;
				int dount = 0;
		       	s = str.substring( i, j );
		       	for( int k = 0; k < s.length(); k++)
		       	{
		       		if( ( s.charAt( k ) >= 65 && s.charAt( k ) <= 90 ) || ( s.charAt( k ) >= 97 && s.charAt( k ) <= 122 ) )
		       			count++;
		       		if( s.charAt( k ) >= '0' && s.charAt( k ) <= '9' )
		       			dount++;
		        }
		        if( ( count == 0 && dount > 0 ) || ( count > 0 && dount == 0 ) )
		        System.out.println( s );           
			}
		}
	}
}
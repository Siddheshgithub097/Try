package stringsJavaT;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) 
	{
		String string = "Grab";
		String str = "Brag";
		
		//Converting both the string to lower case.
		
		string=string.toLowerCase();
		str = str.toLowerCase();
		
		// so now i will check it length 
		
		if(string.length()!=str.length())
		{
			System.out.println(" both string are not anagram ");
		}
		else
		{
			//Converting both the arrays to character array  
			
			char [] string1 =string.toCharArray();
			char [] string2 = str.toCharArray();
			
			Arrays.sort(string2);
			Arrays.sort(string1);
			
			if(Arrays.equals(string1, string2)==true)
			{
				System.out.println(" both string are --> anagram ");
			}
			else 
			{
				System.out.println(" both string are not anagram ");
			}
		}

	}

}

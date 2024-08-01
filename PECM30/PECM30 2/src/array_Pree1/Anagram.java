package array_Pree1;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String str1 ="Grab";
		String str2 ="brag" ;
		
		// lower mdhe convert kru
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// length check kru 
		
		if(str1.length()!=str2.length())
		{
			System.out.println(" Both string are not anangram ");
		}
		else
		{
			// Converting both array to char 
			
			char [] string1 = str1.toCharArray() ;
			char [] String2 = str2.toCharArray() ;
			
			// sort kru 
			Arrays.sort(string1);
			Arrays.sort(String2);
			
			if(Arrays.equals(string1, String2)==true)
			{
				System.out.println(" both string are anagram ");
			}
			else 
			{
				System.out.println(" both string are not anagarm ");
			}
			
		}
		
	}
}

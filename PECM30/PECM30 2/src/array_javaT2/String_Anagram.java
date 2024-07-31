package array_javaT2;

import java.util.Arrays;

public class String_Anagram 
{
	public static void main(String[] args) 
	{
		String str1 = "Grab";
		String str2 = "brag" ;
		
		// 1st we convert into lowerCase 
		
		str1= str1.toLowerCase();
		str2= str2.toLowerCase();
		
		// 2nd tychi length check kru 
		
		if(str1.length()!=str2.length())
		{
			System.out.println(" Both String are not anagarm ");
		}
		else
		{
			//Converting both the arrays to character array  
			
			char [] string1 = str1.toCharArray();
			char [] string2 = str2.toCharArray();
			
			// we will sort 
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			// Comparing both the arrays using in-built function equals ()  
			
			if(Arrays.equals(string1, string2)==true)
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

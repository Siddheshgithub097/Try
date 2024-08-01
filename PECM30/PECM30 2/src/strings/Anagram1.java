package strings;

import java.util.Arrays;

public class Anagram1 
{
	public static void main(String[] args) 
	{
		String string = "Grab";
		String string2 = "Brag";
		
		string = string.toLowerCase();
		string2 = string2.toLowerCase();
		
		if(string.length()!=string2.length())
		{
			System.out.println(" both are not anagram ");
		}
		else
		{
			char ch [] = string.toCharArray();		// // now we will convert both array to charArray
			char ch2 [] = string2.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch, ch2)==true)
			{
				System.out.println(" both String are anagram ");
			}
			else 
			{
				System.out.println(" not anagram ");
			}
		}
		
	}
}

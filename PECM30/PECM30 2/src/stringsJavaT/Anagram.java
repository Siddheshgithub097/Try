package stringsJavaT;

import java.util.Arrays;
									// Java Program to determine whether two strings are the anagram
public class Anagram 
{
	// anagram mean if 2 string are same if they contain the same characters. However, the order or sequence of the characters can be different.
	
	public static void main(String[] args) 
	{
		String string = "Brag";
		String string2 = "Grab";
		
		//Converting both the string to lower case.  
		
		string= string.toLowerCase();
		string2 = string2.toLowerCase();
		
		// so now we will check it length
		
		if(string.length()!=string2.length())
		{
			System.out.println("Both the strings are not anagram");
		}
		else
		{
			//Converting both the arrays to character array  
			char [] string1 =string.toCharArray();
			char [] string23 =string2.toCharArray();
			
			//Sorting the arrays using in-built function sort ()  
			Arrays.sort(string1);
			Arrays.sort(string23);
			
			  //Comparing both the arrays using in-built function equals () 
			
			if(Arrays.equals(string1, string23)==true)
			{
				 System.out.println(" CONGRATULATIONS == Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
		}
	}
	}
}


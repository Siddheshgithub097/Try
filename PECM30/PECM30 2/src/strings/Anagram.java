package strings;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String string = "Grab";
		String string2 = "Brag";
		
		// first we will convert in lowercase 
		
		string=string.toLowerCase();
		string2=string2.toLowerCase();
		
		// now we will check it length 
		
		if(string.length()!=string2.length())
		{
			System.out.println("Both the strings are not anagram");
		}
		
		else 
		{
			// now we will convert both array to charArray
			
			char ch []=string.toCharArray();
			char ch2 [] = string2.toCharArray();
			
			//Sorting the arrays using in-built function sort ()  
			
			Arrays.sort(ch);
			Arrays.sort(ch2);
			
			// after sorting we will compare both
			
			if(Arrays.equals(ch, ch2)==true)
			{
				System.out.println(" CONGRATULATIONS == Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram"); 
			}
		}
	}
}

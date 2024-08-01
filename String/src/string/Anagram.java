package string;

import java.util.Arrays;
												// output showed me incorrect..
public class Anagram
{
	 public static void main(String[] args) 
	{
		String s1 = " SID " ;
		String s2 = " DIS" ;
										
												// Strings doesn't have a built-in sort method but charArray does!!
												/*so we convert the string into charArray and apply the methods  {char to charArray }*/
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray() ;
		if (c1.length != c2.length)
		{
			System.out.println(" Not Anagram");
			System.exit(0);
		}
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for (int i = 0; i < c1.length; i++)
		{
			if (c1[i] != c2 [i])
				{
					System.out.println(" not Anagram");
					System.exit(0);
				}
		}
		
		System.out.println(" its An Anagram ");
		
	}
}

package array_javaT2;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String strr1 = " graB ";
		String str2 = " Brag " ;
		
		strr1 = strr1.toLowerCase();
		str2 =str2.toLowerCase();
		
		if (strr1.length()!=str2.length()) 
		{
			System.out.println(" both String are not anagarm ");
		} else 
		{
			//Converting both the arrays to character array 
			
			char [] str = strr1.toCharArray();
			char [] strrr2 = str2.toCharArray();
			
			Arrays.sort(str);
			Arrays.sort(strrr2);
			
			if(Arrays.equals(str, strrr2)== true)
			{
				
				System.out.println(" both String are anagram ");
			}
			else 
			{
				System.out.println(" both String are not anagarm ");
			}
		}
	}
}

package strings;

public class Equl_Part_Of_Given_String 
{
	public static void main(String[] args) 
	{
		String strr = "aaaabbbbcccc";  
		
		int len = strr.length();
		int temp = 0;
		int n = 3;
		int chars = len/n;
		
		String string1 [] = new String[n];
		
		if(len%3!=0)
		{
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
		}
		else
		{
			for (int i = 0; i < len; i+=chars)
			{
				String strrr = strr.substring(i, i+chars);
				string1[temp]= strrr;
				temp++;
			}
		}
		
		System.out.println(" equl part of given string are "); 
		for (int i = 0; i < string1.length; i++) 
		{
			System.out.println(string1[i]+" ");
		}
	}
}

package stringsJavaT;

public class N_Equl_Part 
{
	public static void main(String[] args) 
	{
		String str = "aaaabbbbcccc";  
		int n = 3 ;
		int len = str.length();
		int temp = 0 ;
		int chars = len/n;
		String string [] = new String[n];
		
		if(len%n!=0)
		{
			System.out.println(" given string cannot be divided into "+ n+" equl part ");
		}
		else
		{
			for (int i = 0; i < str.length(); i=i+chars)
			{
				String strr = str.substring(i, i+chars);
				string[temp] = strr;
				temp++;
			}
		}
		System.out.println(" equl part of given string are ");
		for (int i = 0; i < string.length; i++) 
		{
			System.out.println(string[i]+" ");
		}
		
		
	}
}

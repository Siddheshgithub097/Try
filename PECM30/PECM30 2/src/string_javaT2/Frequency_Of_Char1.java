package string_javaT2;

public class Frequency_Of_Char1 
{
	public static void main(String[] args)
	{
		String strr = " Siddhesh Pathare " ;
		
		strr= strr.replaceAll("\\s", "");
		
		int str [] = new int[256];
		
		for (int i = 0; i < strr.length(); i++) 
		{
			str[strr.charAt(i)]++;
		}
		
		// so i want to display 
		
		for (int i = 0; i < str.length; i++) 
		{
			if(str[i]>0)
			{
				System.out.println((char)i+ " is " +str[i]+" times occures ");
			}
		}
	}
}


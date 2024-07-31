package string_javaT2;

public class Frequency_Of_Char 
{
	public static void main(String[] args)
	{
		String strr = " Siddhesh Pathare ";
		
		// remove all white spaces 
		
		strr = strr.replaceAll("\\s", "");
		
		int charcount [] = new int[256];
		
		for (int i = 0; i < strr.length(); i++) 
		{
			charcount[strr.charAt(i)]++;
		}
		
		// i want to display 
		
		for (int i = 0; i < charcount.length; i++) 
		{
			if(charcount[i]>0)
			{
				System.out.println((char)i + " is "+ charcount[i]+" times occures ");
			}
				
		}
		
	}
}

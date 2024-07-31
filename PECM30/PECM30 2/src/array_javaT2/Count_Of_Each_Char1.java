package array_javaT2;

public class Count_Of_Each_Char1 
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
		
		// i want to print 
		
		for (int i = 0; i < charcount.length; i++) 
		{
			if(charcount[i]>0)
			{
				System.out.println((char)i + " is "+ charcount[i]+" times occures ");
			}
		}
	}
}

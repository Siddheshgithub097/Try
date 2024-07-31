package array_javaT2;

public class Count_Of_Each_Char 
{
	public static void main(String[] args) 
	{
		String str = " Siddhesh Pathare ";
		
		// first of all remove all white spaces 
		str = str.replaceAll("\\s", "");
		
		int charcount [] = new int[256];
		
		for (int i = 0; i < str.length(); i++) 
		{
			charcount[str.charAt(i)]++;
		}
		
		// i want to display 
		
		for (int i = 0; i < charcount.length; i++) 
		{
			if(charcount[i]>0)
			{
				System.out.println((char)i + " is "+ charcount[i] +" times occures ");
			}
		}
		
		System.out.println(" ====== ============ =============== ================== ");
		String strrr = " Siddhesh Pathare ";
		strrr = strrr.replaceAll("\\s", "");   // remove white spcaes 
		
		int charcountt [] = new int[256];
		
		for (int i = 0; i < strrr.length(); i++) 
		{
			charcountt[strrr.charAt(i)]++;
		}
		
		// display 
		for (int i = 0; i < charcountt.length; i++) 
		{
			if(charcountt[i]>0)
			{
				System.out.println((char)i+" is "+ charcountt[i]+" times occures ");
			}
		}
	}
	
	
}

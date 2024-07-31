package array_javaT2;

public class String_Vowel_Conso 
{
	public static void main(String[] args) 
	{
		String str = "This is a really simple sentence";    
		int Vcount =0;
		int Ccount = 0;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='0'||str.charAt(i)=='u')
			{
				Vcount++;
			}
			else if(str.charAt(i)>'a'&& str.charAt(i)<'z')
			{
				Ccount++;
			}
		}
		
		System.out.println(" count of vowel "+Vcount);
		System.out.println(" count of Consonant "+ Ccount);
	}
}

package string_javaT2;

public class Vowel_conso 
{
	public static void main(String[] args) 
	{
		 String str = "This is a really simple sentence";   
		 
		 int Vcount = 0;
		 int Ccount = 0;
		 
		 str = str.toLowerCase();
		 
		 for (int i = 0; i < str.length(); i++) 
		 {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				Vcount++;
			}
			else if (str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				Ccount++;
			}
		 }
		 
		 System.out.println("Number of vowels: " + Vcount);    
	        System.out.println("Number of consonants: " + Ccount);    
	}
}

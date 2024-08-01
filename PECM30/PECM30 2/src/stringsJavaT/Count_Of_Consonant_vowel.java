package stringsJavaT;

public class Count_Of_Consonant_vowel {

	public static void main(String[] args) 
	{
		String str = "This is a really simple sentence"; 
		
		int consoCount=0;
		int vowelCount=0;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowelCount++;
				
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				consoCount++;
			}
		}
		
		 System.out.println("Number of vowels: " + vowelCount);    
	      System.out.println("Number of consonants: " + consoCount);  
	}

}

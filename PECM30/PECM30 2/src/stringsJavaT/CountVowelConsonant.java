package stringsJavaT;

//As we know that,the characters a, e, i, o, u are known as vowels in the English alphabet. Any character other than that is known as the consonant.
public class CountVowelConsonant 
{
	public static void main(String[] args) 
	{
		String str = "This is a really simple sentence";   
		
		int vowelCount = 0;
		int ConsonantCount = 0;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
					||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U' )
			{
				vowelCount++;
			}
			else if ( str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				ConsonantCount++;
			}
		}
		
		  System.out.println("Number of vowels: " + vowelCount);    
	      System.out.println("Number of consonants: " + ConsonantCount);    
	}
}

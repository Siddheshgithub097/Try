package strings;

public class CountOfVowels 
{
	public static void main(String[] args) 
	{
		String str = "This is a really simple sentence";    
		
		int countVowel=0;
		int countConso=0;
		
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				countVowel++;
			}
			else if (str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				countConso++;
			}
			
		}
		
		System.out.println(" total vowel "+countVowel);
		System.out.println(" total conso "+countConso);
	}
	
	

}

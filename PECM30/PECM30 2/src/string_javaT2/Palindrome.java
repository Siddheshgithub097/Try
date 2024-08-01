package string_javaT2;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String str = "Kayak";
		
		boolean flag = true;
		
		str = str.toLowerCase();
		for (int i = 0; i < str.length()/2; i++) 
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag = false;
			}
			
		}
		if(flag)
		{
			System.out.println(" given string is palindrome ");
		}
		else 
		{
			System.out.println(" given string is not palindrome ");
		}
		
		
	}
}

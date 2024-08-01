package stringsJavaT;

public class Palindrome {

	public static void main(String[] args) 
	{
		String string = "Kayak";    
		boolean flag = true;
		
		string = string.toLowerCase();
		
		for (int i = 0; i < string.length(); i++) 
		{
			if(string.charAt(i)!=string.charAt(string.length()-i-1))
			{
				flag= false;
			}
		}
		
		if(flag)
		{
			System.out.println(" yes given string is palindrome ");
		}
		else
		{
			System.out.println(" given string is NOT palindrome ");
		}

	}

}

package javatpoint;

public class PalindromeString 
{
	// palindrome mean first-last , second-second_last char same asayla hava.
	
	public static void main(String[] args) 
	{
		
		String str = "Kayak";
		
		str=str.toLowerCase();
		
		boolean flag = true;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag= false;
			}
		}
		
		if(flag)
		{
			System.out.println(" Given string is Palindrome ");
		}
		else
		{
			System.out.println(" Given string is not Palindrome ");
		}

	}
}

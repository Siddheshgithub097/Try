package strings;

public class String_Palindrome 
{
	public static void main(String[] args) 
	{
		String strr = " kanak ";
		
		strr= strr.toLowerCase();
		
		Boolean flag = true;
		
		for (int i = 0; i < strr.length(); i++)
		{
			if(strr.charAt(i)!=strr.charAt(strr.length()-i-1))
			{
				flag = false;
				
				break;
			}
		}
		if (flag) 
		{
			System.out.println(" Given string is palindrome ");
		} else 
		{
			System.out.println(" Given string is not palindrome ");
		}
	}
}

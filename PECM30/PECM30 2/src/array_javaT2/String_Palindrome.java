package array_javaT2;

public class String_Palindrome 
{
	public static void main(String[] args) 
	{
		String strr = " Kayak ";
		
		Boolean flag = true ;
		
		strr = strr.toLowerCase();
		
		//Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached  
		
		for (int i = 0; i < strr.length()/2; i++) 
		{
			if(strr.charAt(i)!=strr.charAt(strr.length()-i-1))
			{
				flag = false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println(" Given String is Palindrome ");
		}
		else
		{
			System.out.println(" Given string is not palindrome ");
		}
	}
}

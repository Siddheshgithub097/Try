package javatpoint;

public class PalindromeStringBuilder 
{
	public static void main(String[] args) {
		
		String str = " kayak ";
		
		str = str.toLowerCase();
		
		str= str.replaceAll("\\s", "");
		
		StringBuilder builder = new StringBuilder(str).reverse();
		
		if(str.equals(builder.toString()))
		{
			System.out.println(" Given String is Palindrome ");
		}
		else
		{
			System.out.println(" Given String is Not Palindrome ");
		}
	}
}

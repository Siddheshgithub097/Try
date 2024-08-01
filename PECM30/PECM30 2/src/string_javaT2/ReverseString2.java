package string_javaT2;

public class ReverseString2 
{
	public static void main(String[] args) 
	{
		String strr = " Siddhesh Pathare ";
		
		String reverseString = "";
		
		for (int i = strr.length()-1; i >= 0; i--) 
		{
			reverseString = reverseString+ strr.charAt(i);
		}
		
		System.out.println(" orignal string is "+ strr);
		System.out.println(" reverse String is "+ reverseString);
	}
}

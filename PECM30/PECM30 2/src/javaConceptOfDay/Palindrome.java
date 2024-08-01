package javaConceptOfDay;

public class Palindrome 
{
	public static void main(String[] args) {
		
		String str = "kayak";
		
		StringBuilder builder = new StringBuilder(str).reverse();
		
		if(str.equals(builder.toString()))
		{
			System.out.println(" given string is Plaindrome ");
		}
		else
		{
			System.out.println(" not Palindrome "); 
		}
	}
}

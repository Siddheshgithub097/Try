package string_javaT2;

public class ReplaceLowerToUpper 
{
	public static void main(String[] args) 
	{
		 String str1="Great Power";  
		 
		 StringBuffer buffer= new StringBuffer(str1);
		 
		 for (int i = 0; i < str1.length(); i++) 
		 {
			if(Character.isLowerCase(str1.charAt(i)))
			{
				buffer.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
			}
			else if( Character.isUpperCase(str1.charAt(i)))
			{
				buffer.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
			}
		}
		 
		 System.out.println("String after case conversion : "+buffer);
	}
}

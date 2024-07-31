package stringsJavaT;

public class ReplaceLowerCaseCharWithUpper 
{
	public static void main(String[] args) 
	{
		String strr = "Great Power";
		
		StringBuffer buffer = new StringBuffer(strr);
		
		for (int i = 0; i < strr.length(); i++) 
		{
			
			if(Character.isLowerCase(strr.charAt(i)))
			{
				buffer.setCharAt(i, Character.toUpperCase(strr.charAt(i)));
			}
			else if(Character.isUpperCase(strr.charAt(i)))
			{
				buffer.setCharAt(i, Character.toLowerCase(strr.charAt(i)));
			}
				
		}
		
		System.out.println(" after replaceing lower with upper and upper with lower ");
		System.out.println(buffer);
		
	}
}

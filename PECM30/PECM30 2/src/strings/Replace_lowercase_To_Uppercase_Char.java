package strings;

public class Replace_lowercase_To_Uppercase_Char {

	public static void main(String[] args) 
	{
		String strr = "Great Power";
		
		StringBuffer buffer = new StringBuffer(strr);
		
		for (int i = 0; i < strr.length(); i++) 
		{
			 //Checks for lower case character    
			
			if(Character.isLowerCase(strr.charAt(i)))
			{
				buffer.setCharAt(i, Character.toUpperCase(strr.charAt(i)));
			}
			else if (Character.isUpperCase(strr.charAt(i)))
			{
				buffer.setCharAt(i, Character.toLowerCase(strr.charAt(i)));
			}
			
		}
		System.out.println("String after case conversion : " + buffer);    
	}

}

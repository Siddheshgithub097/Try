package string_javaT2;

public class String_Palindrome_ch 
{
	public static void main(String[] args) 
	{
		  String string = "Kayak";    
		  boolean flag = true;
		  string = string.toLowerCase();
		  for (int i = 0; i < string.length()/2; i++) 
		  {
			  if(string.charAt(i)!= string.charAt(string.length()-i-1))
			  {
				  flag= false;
				  break;
			  }
		  }
		  
		  if(flag)
		  {
			  System.out.println(" given string is palindrome ");
		  }
		  else
		  {
			  System.out.println(" given string are not palindrome ");
		  }
	}
}


package string_javaT2;

public class Count_Of_Char 
{
	public static void main(String[] args)
	{
		 String string = "The best of both worlds";    
		 
		
		 int count = 0;
		 
		 for (int i = 0; i < string.length(); i++)
		 {
			 if(string.charAt(i)!=' ')
			 {
				 count++;
			 }
		}
		 System.out.println(" total no of char in this string is "+ count);
	}
}

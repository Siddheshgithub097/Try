package string_javaT2;

public class Swap_String 
{
	public static void main(String[] args) 
	{
		String str1 = "Good ", str2 = "morning ";   
		
		System.out.println(" before swaping string are -> "+ str1+str2);
		
		str1 = str1+str2;;					// str1= good Morning
		
		str2 = str1.substring(0,(str1.length()-str2.length()));				// good
		
		str1 = str1.substring(str2.length());
		
		 System.out.println("Strings after swapping -> " + str1 + " " + str2);    
	}
}

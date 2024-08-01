package stringsJavaT;

public class Count_Of_Char {		//Java Program to count the total number of characters in a string

	public static void main(String[] args) 
	{
		String string = "The best of both worlds"; 
		int count =0;
		
		// so i want to count of each character except space 
		
		for (int i = 0; i < string.length(); i++)			// string.lenght() is used to determine the number of characters (length) in a string. 
		{
			if(string.charAt(i)!=' ')						// charAt(i)= to retrieve a specific character at a given index within a string

			{
				count++;
			}   
		}
		
		System.out.println("Total number of characters in a string: " + count);   

	}

}

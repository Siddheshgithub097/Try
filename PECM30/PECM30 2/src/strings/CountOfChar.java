package strings;

public class CountOfChar {

	public static void main(String[] args) 
	{
		String string = "The best of both worlds"; 
		
		int count = 0;
		for (int i = 0; i < string.length(); i++) 		// it is used to determine no of char in string 
		{
			if(string.charAt(i)!=' ')			// it retrieve specific  char in string // it return each character
			{
				count++;
			}
			
		}
		System.out.println("Total number of characters in a string: " + count);
	}

}

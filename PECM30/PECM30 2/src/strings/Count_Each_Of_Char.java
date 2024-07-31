package strings;

public class Count_Each_Of_Char 
{
	public static void main(String[] args) 
	{
		String s = " Siddhesh Pathare ";
		
		// Remove spaces from the string
		s = s.replaceAll("\\s","");			// [ \\s: This is a regular expression pattern that matches any whitespace character (e.g., space, tab, newline).]
		
		int [] charArray = new int[256];	// create a char array to store the count
		
		for (int i = 0; i < s.length(); i++) 
		{
			charArray[s.charAt(i)]++;
		}
		
		// Display the character counts
        System.out.println("Character counts in the string:");
        
        for (int i = 0; i < charArray.length; i++) 
        {
        	if(charArray[i]>0)
        	{
        		 System.out.println((char)i + " is "+charArray[i]+ " times ");
        		
            }
        	}
		}
		
	
}

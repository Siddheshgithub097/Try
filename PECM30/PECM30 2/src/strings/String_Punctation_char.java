package strings;

public class String_Punctation_char 
{
	public static void main(String[] args) 
	{
		
	
	
	String str = "He said, 'The mailman loves you.' I heard it with my own ears.";    
	
	int count = 0;
	
	for (int i = 0; i < str.length(); i++) 
	{
		if(str.charAt(i)==','|| str.charAt(i)=='1' || str.charAt(i)==';'|| str.charAt(i)=='?'|| str.charAt(i)=='-'||str.charAt(i) == '\'' 
				|| str.charAt(i) == '\"' || str.charAt(i) == ':')
		{
			count++;
		}
	}
	
	System.out.println("The number of punctuations exists in the string is: " +count);    
	}
}

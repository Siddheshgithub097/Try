package stringsJavaT;

public class ReplaceSpcae 
{
	public static void main(String[] args) 
	{
		String string = "Once in a blue moon";    
		char ch = '*';
		
		string = string.replace(' ', ch);
		
		System.out.println(" after removing spaces ");
		System.out.println(string);
	}
}

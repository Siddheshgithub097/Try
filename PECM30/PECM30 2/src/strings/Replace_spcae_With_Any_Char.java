package strings;

public class Replace_spcae_With_Any_Char 
{
	public static void main(String[] args)
	{
		String strr = "Once in a blue moon";   
		char ch = '-';
		
		 //Replace space with specific character ch    
		
		strr = strr.replace(' ', ch);
		
		  System.out.println("String after replacing spaces with given character: "); 
		  System.out.println();
		  System.out.println(strr);
	}
}

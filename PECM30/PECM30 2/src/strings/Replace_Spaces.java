package strings;

public class Replace_Spaces 
{
public static void main(String[] args) 
{	
	String string = "Once in a blue moon"; 
	
	char ch = '-';
	
	string = string.replace(' ', ch);
	
	 System.out.println("String after replacing spaces with given character: "); 
	 System.out.println();
	 System.out.println(string);
	
}
}

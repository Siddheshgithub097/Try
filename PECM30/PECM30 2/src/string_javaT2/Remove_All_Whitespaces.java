package string_javaT2;

public class Remove_All_Whitespaces 
{
	public static void main(String[] args) 
	{
		 String str1="Remove white spaces";    
		 
		 str1 = str1.replaceAll("\\s", "");
		 
		 System.out.println(str1);
		
	}
}

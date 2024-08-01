package strings;

public class Equl_Part_Of_Given_String1 
{
	public static void main(String[] args) 
	{
		  String str = "aaaabbbbcccc";  
		  int n = 3 ;
		  int len = str.length();
		  int temp = 0 ;
		  int chars = len/n;
		  
		  String string [] = new String[n];
		  if(len%n !=0)
		  {
			  System.out.println(" sorry this string cannot divided into "+ n+" Equl_Part");
		  }
		  else 
		  {
			  for (int i = 0; i < len ; i+=chars) 
			  {
				  String strrr = str.substring(i, i+chars);
				  string[temp] =strrr;
				  temp++;
			}
		  }
		  
		  System.out.println(" equl part of given string are "); 
		  for (int i = 0; i < string.length; i++) 
		  {
			  System.out.println(string[i]+" ");
		  }
	}

}
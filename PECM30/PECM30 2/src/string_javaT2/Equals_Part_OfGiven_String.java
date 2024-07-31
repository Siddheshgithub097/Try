package string_javaT2;

public class Equals_Part_OfGiven_String
{
	public static void main(String[] args) 
	{
		 String str = "aaaabbbbcccc";  
		 
		 int len = str.length();
		 int n = 3 ;
		 int temp = 0;
		 int chars = len/n;
		 
		 String strr [] = new String[n];
		 if(str.length()% n!=0)
		 {
			 System.out.println(" sorry given string cannot be divided  in "+ n+" equals part ");
		 }
		 else 
		 {
			 for (int i = 0; i < str.length(); i+=chars) 
			 {
				 String strrr = str.substring(i, i+chars);
				 strr[temp]= strrr ;
				 temp++;
			 }
		 }
		 System.out.println(" equl part of given string are ");
		 for (int i = 0; i < strr.length; i++) 
		 {
			 System.out.println(strr[i]+" ");	
		 }
	}
}

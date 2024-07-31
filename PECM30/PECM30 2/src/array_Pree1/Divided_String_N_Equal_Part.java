package array_Pree1;

public class Divided_String_N_Equal_Part {

	public static void main(String[] args) 
	{
		String strr = "aaaabbbbcccc";  
		
		int len = strr.length();
		int n = 3 ;
		int temp=0;;
		
		int chars = len/3;
		
		String [] charlen = new String[n];
		
		if(len%n!=0)
		{
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
		}
		else
		{
			for (int i = 0; i < len; i+=len/n) 
			{
				String part = strr.substring(i, i+chars);
				charlen[temp]= part;
				temp++;
			}
		}
		
		System.out.println(" equl part of given string are ");
		for (int i = 0; i < charlen.length; i++) 
		{
			System.out.println(charlen[i]+" ");
		}
	}

}

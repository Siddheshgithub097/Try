package array_javaT2;

public class Divided_String_N_Equal_Part 
{
	public static void main(String[] args) {
		
	
	String strr = "aaaabbbbcccc";  
	
	int len = strr.length();			// store a length of string 
	
	int n = 3;							// 3 part mdhe divide karayche aahe so n = 3 ghetla ahe ;
	int temp = 0;
	int chars = len/n;
	
	// store array of String 
	
	String [] equalstr = new String[n] ;
	
	//Check whether a string can be divided into n equal parts  
	
	if(len%n!=0)
	{
		 System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
	}
	else
	{
		for (int i = 0; i < len; i+=len/n) 
		{
			String part = strr.substring(i,i+chars);
			equalstr[temp] = part;
			temp++;
		}
	}
	System.out.println(" equls part of given string are ");
	for (int i = 0; i < equalstr.length; i++) 
	{
		System.out.println(equalstr[i]+" ");
	}
}
}
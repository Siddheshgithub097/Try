package array_javaT2;

public class Divided_String_N_Part {

	public static void main(String[] args) 
	{
		String strr = "aaaabbbbcccc";  
		
		int len = strr.length();
		int n = 3; 
		int temp=0;
		int chars = len/n ;
		// check whether a string can be divided 3 part or not ? 
		
		String [] equlsstr = new String[n];
				
		if(len%n!=0)
		{
			 System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
		}
		else
		{
			for (int i = 0; i < len; i+=len/n) 
			{
				String part = strr.substring(i, i+chars);
				equlsstr[temp]= part;
				temp++;
			}
		}
		System.out.println(" equls part of given string are ");
		for (int i = 0; i < equlsstr.length; i++) 
		{
			System.out.println(equlsstr[i]+" ");
		}
	}

}

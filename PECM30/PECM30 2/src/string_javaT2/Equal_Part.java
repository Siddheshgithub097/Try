package string_javaT2;

public class Equal_Part 
{
	public static void main(String[] args) {
		  String str = "aaaabbbbcccc";  
		  
		  int len = str.length();
		  int n = 3 ;
		  int temp =0;
		  int chars = len/n;
		  
		  String [] equlsstr = new String[n];
		  
		  if(len%n!=0)
		  {
			  System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
		  }
		  
		  else
		  {
			  for (int i = 0; i < len; i+=len/n) 
			  {
				  String part = str.substring(i, i+chars);
				  equlsstr[temp] = part;
				  temp++;
			  }
			  System.out.println(n + " equal parts of given string are ");  
	           
			  for (int i = 0; i < equlsstr.length; i++)
			  {
				  System.out.println(equlsstr[i]+" ");
			}
	            
		  }
			  
	}
}

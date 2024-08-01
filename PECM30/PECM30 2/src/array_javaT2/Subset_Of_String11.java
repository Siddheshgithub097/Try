package array_javaT2;

public class Subset_Of_String11 
{
	public static void main(String[] args) 
	{
		
	
	
	String strr = "FUN";
	
	int len = strr.length();
	int temp = 0;
	String sub [] = new String[len*(len+1)/2];
	
	for (int i = 0; i < len; i++) 
	{
		for (int j = i; j < len; j++) 
		{
			sub[temp] = strr.substring(i, j+1);
			temp++;
		}
	}
	System.out.println(" all subset of given string are ");
	for (int i = 0; i < sub.length; i++) 
	{
		System.out.println(sub[i]+" ");
		
	}
	
	
	
	}
}

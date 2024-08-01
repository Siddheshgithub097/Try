package string_javaT2;

public class Subset_Of_String 
{
	public static void main(String[] args) 
	{
		String strr = "FUN";
		int len = strr.length();
		int temp = 0;
		
		String stringcount [] = new String[len*(len+1)/2];
		
		for (int i = 0; i < len; i++) 
		{
			for (int j = i; j < len; j++) 
			{
				stringcount[temp] = strr.substring(i,j+1);
				temp++;
			}
		}
		
		System.out.println("All subsets for given string are: ");  
		for (int i = 0; i < stringcount.length; i++) 
		{
			System.out.println(stringcount[i]+" ");
		}
	}
}

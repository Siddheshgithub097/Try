package strings;

public class Subset_Of_String1 
{
	public static void main(String[] args) 
	{
		String str = "FUN";
		
		int len = str.length();
		int tem = 0 ;
		
		String strr [] = new String[len*(len+1)/2];
		
		for (int i = 0; i < len; i++) 
		{
			for (int j = i; j < len; j++) 
			{
				strr[tem] = str.substring(i, j+1);
				tem++;
			}
			
		}
		
		System.out.println(" all subset of given string are ");
		for (int i = 0; i < strr.length; i++) 
		{
			System.out.println(strr[i]+" ");
		}
	}
}

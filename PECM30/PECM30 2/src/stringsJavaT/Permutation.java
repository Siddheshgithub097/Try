package stringsJavaT;

public class Permutation 
{
	
	public static String SwapString(String a , int i , int j)
	{
		char b [] = a.toCharArray();
		char ch ;
		ch = b[i];
		b[i]= b[j];
		b[j]= ch;
		
		return String.valueOf(b);
	}
	
	public static void generatePermutation(String str ,int start , int end )
	{
		if(start==end-1)
		{
			System.out.println(str);
		}
		else
		{
			for (int i = start; i < end ; i++) 
			{
				str = SwapString(str, start, i);
				generatePermutation(str, start+1, end);
				str = SwapString(str, start, i);
			}
		}
	}
	
	public static void main(String[] args)
	{
		String str = "ABC";
		int length = str.length();
		System.out.println(" all permutation of string are ");
		generatePermutation(str, 0, length);
		
		
	}
}


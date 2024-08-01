package array_javaT2;

public class Permutation
{
	public static String SwapString(String a ,int i , int j )
	{
		char b [] = a.toCharArray();
		
		char ch ;
		ch = b[i];
		b[i]= b[j];
		b[j] = ch;
		
		return String.valueOf(b);
	}
	
	public static void generatePermulation(String str , int start , int end)
	{
		if(start==end-1)
		{
			System.out.println(str);
		}
		else
		{
			for (int i = 0; i < end; i++) 
			{
				//Swapping the string by fixing a character   
				
				str = SwapString(str, start, i);
				
				generatePermulation(str, start+1, end);
				
				str = SwapString(str, start, i);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String str ="ABC";
		int len = str.length();
		System.out.println("All the permutations of the string are: ");  
		generatePermulation(str, 0, len);
	}

}

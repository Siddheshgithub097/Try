package array_javaT2;

public class Permutation_String 
{
	public static String SwapString(String str , int i , int j)
	{
		char b [] = str.toCharArray();
		char ch;
		ch =b[i];
		b[i]=b[j];
		b[j]=ch;
		
		return String.valueOf(b);
	}
	
	public static void generatePermulation(String strr2 , int start , int end)
	{
		if(start==end-1)
		{
			System.out.println(strr2);
		}
		else
		{
			for (int i = start; i < end ; i++)
			{	
				//Swapping the string by fixing a character
				strr2 = SwapString(strr2, start, i);
				
			      //Recursively calling function generatePermutation() for rest of the characters 
				generatePermulation(strr2, start+1, end);
				
				   //Backtracking and swapping the characters again.    
				strr2 = SwapString(strr2, start, i);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		 String str = "ABC";    
		 
		int len=  str.length();
		System.out.println("All the permutations of the string are: ");  
		generatePermulation(str, 0, len);
	}
}

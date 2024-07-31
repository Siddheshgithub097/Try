package stringsJavaT;

public class All_Subset_OF_String 
{													//For example, all possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
													// All the possible subsets for a string will be n(n+1)/2.
	public static void main(String[] args) 
	{
		String str = "FUN";
		int len = str.length();
		int temp = 0;
														//Total possible subsets for string of size n is n*(n+1)/2 
		String arr[] = new String[len*(len+1)/2];
		
		for (int i = 0; i < len; i++) 
		{
			for (int j = i; j < len; j++) 
			{
				arr[temp] = str.substring(i,j+1);					// substring = extract a portion of string e.g in my string it will started from i and j+1;
				temp++;
			}
		}
		
		// This loop prints all the subsets formed from the string. 
		
		 System.out.println("All subsets for given string are: ");  
		 
		 for (int i = 0; i < arr.length; i++) 
		 {
			System.out.println(arr[i]);
		 }
		
	}
}


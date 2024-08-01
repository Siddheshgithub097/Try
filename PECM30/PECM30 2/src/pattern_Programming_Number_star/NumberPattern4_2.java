package pattern_Programming_Number_star;

public class NumberPattern4_2 
{
	public static void main(String[] args) 
	{
		/*
 		7 7 7 7 7 7 7
		6 6 6 6 6 6
		5 5 5 5 5
		4 4 4 4
		3 3 3
		2 2
		1
		
		
		* * * * * * * 
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 

 */
		
		
		for (int i = 1; i <= 7; i++) 
		{
			
			for (int j = 7; j >= i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		for (int i = 7; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
}

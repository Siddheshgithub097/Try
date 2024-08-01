package pattern_Programming;

public class PP1 
{
	public static void main(String[] args) 
	{
		Pattern1(5);
		NumberPattern();
	}

	public static void Pattern1(int n )
	{
		for (int row = 1; row <= n; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				
				System.out.print("* ");
			}
			// for new line 
			System.out.println();
		}
	}
	
	
	
	public static void  NumberPattern( )
	{
		System.out.println("====================== ");
		for (int i = 1; i <= 7; i++) 
		{
			for (int j = 1; j <= i; j++) 	// first row mdhe 1 col , 2nd = 2row , 3rd = 3col) COL = I ; ROW = J 
			{
				
				System.out.print(j+" ");
			}
			// i need a space 
			System.out.println();
		}
		
	}
}

/* 

*
* *
* * *
* * * * 
* * * * * 
*/

/* 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 */

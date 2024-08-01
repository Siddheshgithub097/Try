package pattern_Programming;

public class PP3_1 
{
	public static void main(String[] args) 
	{
		PP3_1(5);
		PP3_2(5);
	}
	
	public static void PP3_1(int n )
	{
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n-i+1; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
	public static void PP3_2(int n )
	{
		System.out.println("========================== ");
		System.out.println();
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 5; j >= i; j--) 
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}
	
}
/* 


*  *  *  *  * (r1 = 5col)
*  *  *  *    (r2 = 4col)
*  *  *  	  (r3 = 3col)
*  *  		  (r4 = 2col)
*     		  (r5 = 1col)

*/
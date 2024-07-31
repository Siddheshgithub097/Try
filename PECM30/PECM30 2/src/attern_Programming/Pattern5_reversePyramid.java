package attern_Programming;

public class Pattern5_reversePyramid 
{
	public static void main(String[] args) 
	{
		/* 
		 
		  * * * * * 
		   * * * * 
		    * * * 
		     * * 
		      * 

		 yacha logic yachysi related aahe 
		 
		  				 - * * * * * 		( ek space and 5 star )
						 - - * * * * 
						 - - - * * * 
						 - - - - * *
						 - - - - - *
		 
		 */
		
		
		for (int i = 1; i <= 9; i++) 
		{
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(" ");
			}
			
			for (int j = 9; j >= i; j--) 
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
	}
}

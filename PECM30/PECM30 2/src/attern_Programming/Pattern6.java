package attern_Programming;

public class Pattern6 
{
	public static void main(String[] args) {
		
		/* 
		 
		 * * * * *
		   * * * *
		     * * *
		       * *
		         *  
		          
		       
						 
						 - * * * * * 		( ek space and 5 star )
						 - - * * * * 
						 - - - * * * 
						 - - - - * *
						 - - - - - *
						 
						 
						 // logic he aahe 
		          
		 
		 
		 */
		
		for (int i = 1; i <= 5 ; i++) 
		{
			
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(" ");
			}
			
			for (int j = 5; j >= i; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

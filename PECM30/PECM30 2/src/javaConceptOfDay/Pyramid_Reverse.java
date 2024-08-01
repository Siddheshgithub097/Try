package javaConceptOfDay;

public class Pyramid_Reverse 
{
	public static void main(String[] args) {
		
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
		
		
		for (int i = 1; i <= 6; i++) 
		{
			for (int j = 1; j < i; j++) 
			{
				System.out.print(" ");
			}
			
			for (int k = 5; k >= i; k--) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

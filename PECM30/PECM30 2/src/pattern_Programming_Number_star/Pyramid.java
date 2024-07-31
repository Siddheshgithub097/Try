package pattern_Programming_Number_star;

public class Pyramid
{
	public static void main(String[] args) {
		
		/* 
		 
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * * 


				    1 
				   2 2 
				  3 3 3 
				 4 4 4 4 
				5 5 5 5 5 
										-	-	-	-	*
					 					-	-	-	*	*
										 -	-	*	*	*
										 -	*	*	*	*
										 *	*	*	*	*
										 
										 ha similar aahe yachysarkha 
										  
		 */
		
		for (int i = 1; i <= 5; i++) 
		{
			
			for (int j = 4; j >= i; j--) 
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("================== ");
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 4; j >= i; j--)
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

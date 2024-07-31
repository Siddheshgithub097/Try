package attern_Programming;

public class Pattern10 
{
	public static void main(String[] args) 
	{
		/* 
											 	first iteration mdhe 
											 
											 					_ * 
											 	second mdhe 
											 					
											 	2nd				- - *
											 	3rd				- - - *
											 	4th				- - - - *
											 					- - - - - *
	 					
	 		 *
			  *
			   *
			    *
			     *

		
	 */
		
		for (int i = 1; i <= 5; i++) 
		{
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			System.out.println();
			
		}
	}
}

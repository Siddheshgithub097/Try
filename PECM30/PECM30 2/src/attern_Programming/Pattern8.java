package attern_Programming;

public class Pattern8 
{
	public static void main(String[] args) {
		
		
				/* 
				 
					*
					
				*	*	* 
				
			*	*	*	*	*
			
		*	*	*	*	*	*	*
		
	*	*	*	*	*	*	*	*	*
		
		https://youtu.be/nnmUz31L3gU?si=prcl5ficVmOz-ia9
		
		
		
		 				*
		 			*	*
		 		*	*	*
		 	*	*	*	*
		 *	*	*	*	* (1)
		 
		 						
		 							 -	-	-	-	*
									 -	-	-	*	*
									 -	-	*	*	*
									 -	*	*	*	*
									 *	*	*	*	* (2) 				
									 
									  							
			*
			* *
			* * *
			* * * *
			* * * * *
			(3) 
			
			he ashe 3 part aahe he print karayche aahe , disayla avghad aahe but khup khup easy aahe  so now lets do it 
		
		*/
		
		for (int i = 1; i <= 5; i++) 
		{
			
			for (int j = 4; j >= i; j--)
			{
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			
			for (int j = 2; j <= i; j++) 		// for first iteration it will not run , it will run after 1st iteration...
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
	
	/* 
	 Iteration 1 (i = 1):
	First Inner Loop:
	Prints 4 spaces (" ").
	
	Second Inner Loop:
	Prints 1 star ("*").
	
	Third Inner Loop:
	This loop does not run because j starts at 2 and the condition j <= i (2 <= 1) is false.
	Print Statement:
	Moves to the next line.
								* (ist iteration result)
	 */

}

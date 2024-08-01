package javaConceptOfDay;

public class Pyramid_star_4_2 
{
	public static void main(String[] args) 
	{
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
			
			for (int k = 1; k <= i; k++) 
			{
				System.out.print("*");
			}
			
			for (int l = 2; l <= i; l++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

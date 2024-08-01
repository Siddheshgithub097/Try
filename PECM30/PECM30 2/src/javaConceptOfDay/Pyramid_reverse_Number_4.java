package javaConceptOfDay;

public class Pyramid_reverse_Number_4 
{
	public static void main(String[] args)
	{
		/* 
		 
		1 2 3 4 5 6 7 8 9 
		 1 2 3 4 5 6 7 8 
		  1 2 3 4 5 6 7 
		   1 2 3 4 5 6 
		    1 2 3 4 5 
		     1 2 3 4 
		      1 2 3 
		       1 2 
		        1 

		 */
		
		for (int i = 9; i >= 1; i--)
		{
			
			for (int j = 1; j<= 9-i; j++)
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	}
}

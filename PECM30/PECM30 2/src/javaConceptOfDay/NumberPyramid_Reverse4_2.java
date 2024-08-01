package javaConceptOfDay;

public class NumberPyramid_Reverse4_2 
{
	public static void main(String[] args) 
	{
		
		/* 
		 
		 12345678987654321
		 123456787654321
		  1234567654321
		   12345654321
		    123454321
		     1234321
		      12321
		       121
		        1

		 
		 */
		for (int i = 1; i <= 9; i++)
		{
			
			for (int j = 1; j <i; j++) 
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k<= 10-i; k++)
			{
				System.out.print(k);
			}
			
			
			for (int l = 10-i-1; l >= 1; l--) 
			{
				System.out.print(l);
			}
			
			System.out.println();
		}
		
		
	}
}

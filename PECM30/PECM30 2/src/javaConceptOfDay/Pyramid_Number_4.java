package javaConceptOfDay;

public class Pyramid_Number_4
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 9; i++) 
		{
			
			for (int j = 8; j >= i; j--)
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) 
			{
				System.out.print(k);
			}
			
			for (int l = 1; l < i; l++)
			{
				System.out.print(i-l);
			}
					/*
					for (int k = i-1; k >=1; k--)
					{
						System.out.print(k);
					}
					*/
			
			System.out.println();
		}
	}
}

				

	/* 
	
	
			    1
		       121
		      12321
		     1234321 
		    123454321
		   12345654321
		  1234567654321
		 123456787654321
		12345678987654321

*/
package javaConceptOfDay;

import java.util.Scanner;

public class NumberPyramid_4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" How many row You want to print");
		int row = sc.nextInt();
		
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
		for (int i = 1; i <=row; i++) 
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
			System.out.println();
		}
				
	}
}

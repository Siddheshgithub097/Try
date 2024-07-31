package javaConceptOfDay;

import java.util.Scanner;

public class Number_Star_Pyramid_4 
{
	public static void main(String[] args)
	{
					 /* 
					 
				    	*
					
				   *	*	* 
				
				*	*	*	*	*
			
			*	*	*	*	*	*	*
			
		*	*	*	*	*	*	*	*	*
		
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" How many row you want to print ");
		int row = sc.nextInt();	//9
		
		for (int i = 1; i <= row; i++) 
		{
			
			for (int j = 8; j >= i; j--) 
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++)
			{
				System.out.print("*");
			}
			
			for (int j = 2; j <=i; j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

package javaConceptOfDay;

import java.util.Scanner;

public class Number_StarPyramid_3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" How many row you want to print ");
		int row = sc.nextInt();	//5
		
		for (int i = 1; i <= row; i++) 
		{
			
			for (int j = 4; j >= i; j--) 
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <=i; k++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}

package attern_Programming;

import java.util.Scanner;

public class Nm3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" how many ellement you want to print ");
		int rows = sc.nextInt();
		for (int i = 1; i <=rows; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}
	
	/*
	     	1
			2 2
			3 3 3
			4 4 4 4
			5 5 5 5 5
			6 6 6 6 6 6
			7 7 7 7 7 7 7
	 */
}

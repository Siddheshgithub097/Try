package attern_Programming;

import java.util.Scanner;

public class NumberPattern1 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);	
			
			System.out.println(" How many rows you want to pattern ");
			int ele = sc.nextInt();
			
			for (int i = 1; i <=ele; i++) 
			{
				for (int j = 1; j <=i; j++) 
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}
			
			
			sc.close();
	}	
	
	
	
	/*
	    1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		1 2 3 4 5 6
		1 2 3 4 5 6 7
	 * 
	 */
}

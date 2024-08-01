package attern_Programming;

import java.util.Scanner;

public class NM4_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" how many rows you wnat to print ");
		int rows = sc.nextInt();
		
		for (int i = rows; i >=1; i--)
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

/* 
7 7 7 7 7 7 7
6 6 6 6 6 6
5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
 */

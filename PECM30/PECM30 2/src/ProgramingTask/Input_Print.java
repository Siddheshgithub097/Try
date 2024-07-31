package ProgramingTask;

import java.util.Scanner;

// Write a java program to create an array and give the input array size by using Scanner class.
public class Input_Print 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter The Size Of Array ");
		int ar3 [] = new int[scanner.nextInt()];
		
		for (int i = 0; i < ar3.length; i++) 
		{
			System.out.println(" Enter value In " + (i+1) + " Block ");
			ar3[i]= scanner.nextInt();
		}
		
		System.out.print(" { ");
		for (int i = 0; i < ar3.length; i++) 
		{
			System.out.print(ar3[i]);
			if(i!=ar3.length-1)
			{
				System.out.print(" , ");
			}
		}
		
		System.out.println(" } ");
	}
}

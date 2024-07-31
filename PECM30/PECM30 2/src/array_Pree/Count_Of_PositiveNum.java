package array_Pree;

import java.util.Scanner;

public class Count_Of_PositiveNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size Of Array ");
		int ar21 [] = new int[sc.nextInt()];
		
		System.out.println(" Enter Element In Array ");
		for (int i = 0; i < ar21.length; i++) 
		{
			ar21[i]= sc.nextInt();
		}
		
		int count = 0;
		for (int i = 0; i < ar21.length; i++) 
		{
			if(ar21[i] >= 0)
			{
				count ++;
				System.out.println(" Positive Number is " + ar21[i]);
			}
			
		}
		
		System.out.println("In given array we found = "+count+" positive number.");
	}
}

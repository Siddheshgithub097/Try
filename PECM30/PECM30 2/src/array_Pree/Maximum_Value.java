package array_Pree;

import java.util.Scanner;

public class Maximum_Value 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Size of Array ");
		int a [] = new int[sc.nextInt()];
		
		System.out.println(" Enter the element ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		
		int max=a[0]; 
		for (int i = 1; i < a.length; i++) 
		{
			if(max<a[i])
			{
				max = a[i];
			}
		}
		
		System.out.println(" The Biggest Value in Array is " +max);
	}
}

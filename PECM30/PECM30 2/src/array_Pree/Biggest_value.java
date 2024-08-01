package array_Pree;

import java.util.Scanner;

public class Biggest_value 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println(" Enter array size ");
		int array1 [] = new int[sc.nextInt()];
		
		System.out.println(" Enter element ");
		for (int i = 0; i < array1.length; i++) 
		{
			array1[i]= sc.nextInt();
		}
		
		int max=0;
		for (int i = 1; i < array1.length; i++) 
		{
			if(max<array1[i])
			{
				max= array1[i];
			}
		}
		
		System.out.println(" Biggest value is: "+ max);
}
}
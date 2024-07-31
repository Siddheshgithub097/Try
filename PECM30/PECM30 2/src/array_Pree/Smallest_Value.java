package array_Pree;

import java.util.Scanner;

public class Smallest_Value 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size Of array ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println(" Enter the element ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= sc.nextInt();
		}
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if(min>arr[i])
			{
				min =arr[i];
			}
		}
		
		System.out.println(" smallest array is "+ min);
	}
}

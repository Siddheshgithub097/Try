package array_Pree1;

import java.util.Scanner;

public class Mergearray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st Array Size ");
		int arr1 [] = new int[sc.nextInt()];
		
		System.out.println(" enter array element ");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println(" Enter 2nd Array Size ");
		int arr2 [] = new int[sc.nextInt()];
		System.out.println(" enter array element ");
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i] = sc.nextInt();
		}
		
		int result [] =merge(arr1,arr2);
		for (int i = 0; i < result.length; i++) 
		{
			System.out.println(result[i]+" ");
		}
	}
	
	public static int [] merge(int arr1 [], int arr2 [])
	{
		int arr3 [] = new int[arr1.length+arr2.length];
		int index = 0 ;
		
		for(int i=0 ; i<arr1.length ; i++)
		{
			arr3[index++] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) 
		{
			arr3[index++] = arr2[i];
		}
		
		return arr3;
		
	}
}

package arrays;

import java.util.Scanner;

public class Biggest_Smallest_Value 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int[]arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];								// index mdhe je first value asel ti majhi max value asel - he ti step aahe.
		int min = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if (min>arr[i]) 
			{
				min = arr[i];
			}
			
		}
		System.out.println(max+" is the biggest value in array");
		System.out.println(min+ " is the Smallest value in array");
		
	}
}

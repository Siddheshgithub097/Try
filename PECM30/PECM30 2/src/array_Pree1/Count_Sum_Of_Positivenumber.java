package array_Pree1;

import java.util.Scanner;

public class Count_Sum_Of_Positivenumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter array size ");
		int array [] = new int[sc.nextInt()];
		
		System.out.println(" enter element in array ");
		for (int i = 0; i < array.length; i++) 
		{
			 array[i]= sc.nextInt();
		}
		
		int count =0;
		int sum=0;
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]>0)
			{
				count++;
				sum = sum+array[i];
			}
		}
		
		System.out.println("The count is "+count+" and sum of all positive element in the array is: "+sum);
	}
}

package array_Pree;

import java.util.Scanner;							// COUNT AND SUM OF Positive NUMBER ARRAY PROGRAM


public class CountAndSum_Positive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size Of Array ");
		int  arrays [] = new int[sc.nextInt()];
		
		System.out.println(" Enter Element In Array ");
		for (int i = 0; i < arrays.length; i++) 
		{
			arrays[i]= sc.nextInt();
		}
		
		int count = 0;
		int sum= 0;
		
		for (int i = 0; i < arrays.length; i++)
		{
			if(arrays[i]>=0)
			{
				count ++;
				sum = sum + arrays[i];
			}
		}
		
		System.out.println("The count is "+count+" and sum of all positive element in the array is: "+sum);

	}
}

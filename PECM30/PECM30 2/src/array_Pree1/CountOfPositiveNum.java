package array_Pree1;

import java.util.Scanner;

public class CountOfPositiveNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter array size ");
		int array [] = new int[sc.nextInt()];
		
		System.out.println("enter element in array ");
		for (int i = 0; i < array.length; i++) 
		{
			array[i]= sc.nextInt();
		}
		
		int positivecount = 0;
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]>0)
			{
				positivecount++;
			}
		}
		
		System.out.println(" there are "+ positivecount+ " positive count ");
	}

}

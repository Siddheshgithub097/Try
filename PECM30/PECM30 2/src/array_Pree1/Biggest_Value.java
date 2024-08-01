package array_Pree1;

import java.util.Scanner;

public class Biggest_Value {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter array size ");
		int arr []= new int[sc.nextInt()];
		
		System.out.println(" Enter element ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(max<arr[i])
			{
				max = arr[i];
				
			}
		}
		
		System.out.println(" Biggest value of Array is "+ max);

	}

}

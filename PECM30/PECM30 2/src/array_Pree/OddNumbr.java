package array_Pree;

import java.util.Scanner;

public class OddNumbr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter array size ");
		int arr [] = new int[sc.nextInt()];
		
		System.out.println(" Enter array element ");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.print(" Odd Num is - ");
		System.out.print(" { ");
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]);
				if(i!=arr.length-1)
				{
					System.out.print(" , ");
				}
			}
		}
		System.out.print(" } ");
		
		
	}
}

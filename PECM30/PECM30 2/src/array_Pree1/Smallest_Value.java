package array_Pree1;

import java.util.Scanner;

public class Smallest_Value 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter array size ");
		int array [] = new int[sc.nextInt()];
		
		System.out.println(" Enter array element ");
		for (int i = 0; i < array.length; i++) 
		{
			array[i]= sc.nextInt();
		}
		
		int min = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if(min>array[i])
			{
				min= array[i];
			}
		}
		
		System.out.println(" smallest value is " + min);
	}
}

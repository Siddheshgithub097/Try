package array_Pree;


import java.util.Scanner;

// Write a java program to create an array and give the input array size by using Scanner class.
public class Input_Print1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Size Of Array ");
		
		int arr1 []= new int[sc.nextInt()];
		
		for(int i = 0; i<arr1.length ; i++)
		{
			System.out.println(" Enter value in "+ (i+1) + " Block ");
			arr1[i]= sc.nextInt();
		}
		
		System.out.print(" { ");
		for (int i = 0; i < arr1.length; i++) 
		{
			System.out.print(arr1[i]);
			
			if(i!=arr1.length-1)
			{
				System.out.print(" , ");
				
			}
		}
		
		System.out.println(" } ");
	}
}

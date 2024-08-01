package array_Pree;


import java.util.Scanner;

// Write a java program to create an array and give the input array size by using Scanner class.
public class Input_Print 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Size Of an Array ");
		int array1 [] = new int[sc.nextInt()];
		
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.println("Enter value in " + (i+1) +" block");
			array1[i]= sc.nextInt();	
		}
		
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.println(array1[i]);	
		}
		
	}
}

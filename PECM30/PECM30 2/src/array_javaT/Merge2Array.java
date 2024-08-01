package array_javaT;

import java.util.Scanner;

public class Merge2Array {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter Array size ");
		int arrayA [] = new int[sc.nextInt()];
		
		System.out.println(" Enter Element ");
		for (int i = 0; i < arrayA.length; i++) 
		{
			arrayA[i]= sc.nextInt();
		}
		
		System.out.println(" Enter Array size ");
		int arrayB[] = new int[sc.nextInt()];
		
		System.out.println(" Enter element ");
		for (int i = 0; i < arrayB.length; i++) 
		{
			arrayB[i] = sc.nextInt();
		}
		
		int result [] = merge(arrayA,arrayB);
		for (int i = 0; i <result.length ; i++) 
		{
			System.out.println(result[i]+" ");
		}
	}

	private static int[] merge(int[] arrayA, int[] arrayB) 
	{
		int arrayC [] = new int[arrayA.length+arrayB.length];
		int index = 0;
		for (int i = 0; i < arrayA.length; i++) 
		{
			arrayC[index++] = arrayA[i];
		}
		
		for (int i = 0; i < arrayB.length; i++) 
		{
			arrayC[index++] = arrayB[i];
		}
		
		return arrayC;
	}

	

}

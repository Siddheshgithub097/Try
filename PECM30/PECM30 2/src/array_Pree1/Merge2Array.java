package array_Pree1;

import java.util.Scanner;

public class Merge2Array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter 1st array size ");
		int arrayA[] = new int[sc.nextInt()];
		
		System.out.println(" enter element ");
		for (int i = 0; i < arrayA.length; i++) 
		{
			arrayA[i] = sc.nextInt();
		}
		
		System.out.println(" Enter 2nd array size ");
		int arrayB[] = new int[sc.nextInt()];
		
		System.out.println(" enter element ");
		for (int i = 0; i < arrayB.length; i++) 
		{
			arrayB[i] = sc.nextInt();
		}
		
		int result [] =merge(arrayA,arrayB);					// i will create merge method , in this method i will merge 2 array 
		for (int i = 0; i < result.length; i++) 
		{
			System.out.println(result[i]+" ");						// bcz aaplyla result print karaycha aahe.
		}
								// ethe end jhala aahe 
	}
	
	public static int [] merge (int [] arrayA , int arrayB [])
	{
		int arrayC [] = new int [arrayA.length+arrayB.length];
		int index = 0;						// var ji array chi length allocated jhali aahe(0,0,0,etc) ty mdhe aaply array chy value takaychy aahe 
		
		for (int i = 0; i < arrayA.length; i++) 
		{
			arrayC[index++] = arrayA[i];						// so ethe aapn arrayA chi element arrayC(index) mdhe takle aahe 
		}
		
		for (int i = 0; i < arrayB.length; i++) 
		{
			arrayC[index++]= arrayB[i];							// and ethe arrayB che element takle aahe so mg aapla array ha (arrayA and arrayB value insert jhalya aahe. 
		}
		
		return arrayC;
	}

	
}

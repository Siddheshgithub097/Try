package array_Pree;

import java.util.Scanner;

public class Merge2Arrays 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array size ");
		int ar1 [] = new int[sc.nextInt()];
		
		System.out.println(" Enter the Element");
		for (int i = 0; i < ar1.length; i++) 
		{
			ar1[i] = sc.nextInt();
		}
		
		System.out.println(" Enter Second Array Size ");
		int ar2 [] = new int[sc.nextInt()];
		
		System.out.println(" Enter the Element");
		for (int i = 0; i < ar2.length; i++) 
		{
			ar2[i] = sc.nextInt();
		}
		
		int res [] =merge(ar1,ar2);
		for (int i = 0; i < res.length; i++) 
		{	
			System.out.println(res[i] + " ");
		}
	}
	
	public static int [] merge(int ar1 [],int ar2[])
	{
		int ar3 [] = new int[ar1.length+ar2.length];
		int index = 0;
		
		for (int i = 0; i < ar1.length; i++) 
		{
			ar3[index++] = ar1[i];
		}
		
		for (int i = 0; i < ar2.length; i++) 
		{
			ar3[index++] = ar2[i];
		}
		return ar3;
	}
}

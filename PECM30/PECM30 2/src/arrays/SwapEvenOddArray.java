package arrays;

import java.util.Scanner;

public class SwapEvenOddArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int[]arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<arr.length;i++) 
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

package ProgramingTask1;

import java.util.Scanner;

public class SumfElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int []arr=new int[sc.nextInt()];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}

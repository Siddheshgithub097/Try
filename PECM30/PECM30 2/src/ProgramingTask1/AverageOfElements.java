package ProgramingTask1;

import java.util.Scanner;

public class AverageOfElements
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
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0)
			{
				sum+=arr[i];
				avg=sum/(arr.length);
			}
		}
		System.out.println("The Average of Element is= "+avg);
	}
}

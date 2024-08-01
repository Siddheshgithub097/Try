package arrays;

import java.util.Scanner;

public class SumOfOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int []a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum+=a[i];
			}
		}
		System.out.println("The Sum of Odd is: "+sum);
	}
}

package arrays;

import java.util.Scanner;

public class Array7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0,sum=0;
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]>=0)
			{
				sum+=a[i];
				count++;
			}
		}
		System.out.println("The Sum of Positive Number= "+sum);
		System.out.println("The Count of Positive Number= "+count);
	}
}

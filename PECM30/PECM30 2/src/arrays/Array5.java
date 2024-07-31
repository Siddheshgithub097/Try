package arrays;

import java.util.Scanner;

public class Array5 
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
		int count=0;
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]>=0)
			{
				count++;
			}
		}
		System.out.println("In the array of A we have = "+count+" positive number");
		
	}
}

package arrays;


import java.util.Scanner;

public class Merge2Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of 1st Array : ");
		int[]a=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter length of 2nd Array : ");
		int[]b=new int[sc.nextInt()];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int []res=merge(a,b);
		for (int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
			
		}
	}													// must oberve this curly brac..  our code is ended is here , we create 1 method 
	public static int[] merge(int []a,int[]b)
	{
		int []c=new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			c[index++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[index++]=b[i];
		}
		return c;
	}
	
}

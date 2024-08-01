package arrays;

import java.util.Scanner;

public class First_Second_Max 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Size: ");
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int firstmax=a[0];
		int secondmax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>firstmax)
			{
				firstmax=a[i];
			}
		}
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>secondmax&&a[i]!=firstmax)
			{
				secondmax=a[i];
			}
		}
		System.out.println(firstmax+" is the First Max");
		System.out.println(secondmax+" is the Second Max");
	}
}

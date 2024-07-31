package arrays;

import java.util.Scanner;

public class CountOfEven 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			while(a[i]>0)
			{
				if(a[i]%2==0) 
				{
					count++;
				}
				a[i]/=10;
			}
		}
		System.out.println("The Count of Even is: "+count);
	}
}

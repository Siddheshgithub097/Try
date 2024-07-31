package arrays;

import java.util.Scanner;

public class Persistant 
{
	public static int add(int num) 
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int []arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int []a=new int[arr.length];
		for(int i=0;i<a.length;i++)
		{
			a[i]=add(arr[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}

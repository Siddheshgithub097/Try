package arrays;

import java.util.Scanner;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int []num=new int[sc.nextInt()];
		for (int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			if(isStrongNumber(num[i]))
			{
				System.out.println("Strong Number= "+num[i]);
			}
		}
	}
	public static  boolean isStrongNumber(int num)
	{
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			int fact=1;
			for(int i=rem;i>0;i--)
			{
				fact=fact*i;
			}
			sum+=fact;
			temp/=10;
		}
		if(num==sum)
		{
			return true;
		}
		return false;
	}
}

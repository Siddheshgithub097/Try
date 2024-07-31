package arrays;

import java.util.Scanner;

public class MagicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int []arr=new int[sc.nextInt()];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			while(num>=10)
			{
				num=isSum(num);
			}
			if (num==1) 
			{
				System.out.println("The Number is Magic Number: "+arr[i]);
			}
		}
	}
	public static int isSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
}

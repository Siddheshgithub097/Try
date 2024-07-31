package javaConceptOfDay;

import java.util.Scanner;

public class Armstrong_Number_Range 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your starting Number ");
		int start = sc.nextInt();
		
		System.out.println(" Enter Your Ending Number ");
		int end = sc.nextInt();
		
		for (int num = start; num <= end; num++) 
		{
			if(isArmstrong(num))
			{
				System.out.println(num+" is Armstrong Number ");
			}
		
		}
		
		sc.close();
	}
	
	public static boolean isArmstrong (int num)
	{
		int temp,reminder,sum= 0;
		
		temp=num;
		
		while (num>0)
		{
			reminder=num%10;
			sum=sum+(reminder*reminder*reminder);
			num = num/10;
			
		}
		
		return temp==sum;
			
	}
}

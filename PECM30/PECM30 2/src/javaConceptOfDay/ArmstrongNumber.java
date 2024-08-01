package javaConceptOfDay;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		// armstrong number mean number chy cube chi addition same asli pahije = to num 
		//		int num = 153 ;		// (1*1*1)+(5*5*5)+(3*3*3) = 1+ 125+ 27 = 153

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Number ");
		int num = sc.nextInt();
		
		int reminder , temp , sum = 0;
		
		temp =num;		// bcz i dont want to lose my orignal value 
		
		while (num>0)
		{
			reminder = num%10;
			sum = sum+(reminder*reminder*reminder);
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println(" Given Number is Armstrong Number ");
		}
		else
		{
			System.out.println(" Given Number is Not Armstrong Number ");
		}
	}
}

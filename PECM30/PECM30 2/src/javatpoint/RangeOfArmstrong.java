package javatpoint;

import java.util.Scanner;

public class RangeOfArmstrong 
{
	// armstrong number mean 153 = 1^3+5^3+3^3 = 153 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter starting Number ");
		int start = sc.nextInt();
		
		System.out.println(" Enter Ending number ");
		int end = sc.nextInt();
		
		for (int num = start; num <=end; num++) 
		{
			if(isArmstrong(num))
			{
				System.out.println(num+" is Armstrong Number ");
			}
		}
		
		
	}
	
	public static boolean isArmstrong(int num)
	{
		int temp , reminder , sum = 0;
		
		// i dont want to lose my orignal value thats why i take 
		temp = num;
		
		while (num>0)
		{
			reminder = num%10 ;
			sum= sum+(reminder*reminder*reminder);
			num = num/10;
		}
		
		
		return temp==sum;
	}
}

package javatpoint;

import java.util.Scanner;

public class Neon_Number_Ranges 
{
	// neon number = 9 = 9^2 = 81 = 8+1 = 9 ;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String ContinueInput ;
		do 
		{
			System.out.println(" Enter the starting Number ");
			int start = sc.nextInt();
			
			System.out.println(" Enter The Ending Number ");
			int end = sc.nextInt();
			
			
			boolean flag = false;
			for (int num = start; num <= end; num++) 
			{
				if(is_NeonNumber(num))
				{
					System.out.println(num+" is Neon Number ");
					flag = true ;
				}
			}
			
			if(!flag)
			{
				System.out.println("No Neon Numbers found in the given range.");
			}
			while (true)
			{
				System.out.println("Do you want to check another number? (yes/no)");
				ContinueInput= sc.next();
				
				if(ContinueInput.equalsIgnoreCase("yes") || ContinueInput.equalsIgnoreCase("no"))
				{
					break;
				}
				else
				{
					System.out.println(" Invalid Input . Plz enter 'yes' or 'no' ." );
				}
			}
			
			
		} while (ContinueInput.equalsIgnoreCase("yes"));
		System.out.println("Thank you for using the Neon Number Checker. Goodbye!");
		 sc.close();
		
	}
	
	public static boolean is_NeonNumber(int num)
	{
		int squre = num*num;
		int sum = 0 , temp =0;
		
		
		
		while (squre>0)
		{
			int digit = squre%10 ;	
			sum = sum+digit;
			squre = squre/10 ;
		}
		
		return sum==num;
		
	}
}

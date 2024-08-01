package javatpoint;

import java.util.Scanner;

public class Neon_number 
{
	// neon number mean squre chi addition is equl to number 
	// e.g = 9 = 9^2 = 81 , 8+1 = 9 , 9=9 
	// 45 = 45^2 = 2025 ; 2+0+2+5 = 9!=54
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String ContinueInput;
		do 
		{
			System.out.println(" enter the Number ");
			int num = sc.nextInt();
			
			if(is_Neon_Number(num))
			{
				System.out.println(num+" is Neon Number ");
			}
			else
			{
				System.out.println(num+" is not Neon Number ");
			}
			
			while (true)
			{
				System.out.println(" Do you want to check another number ? (yes/no) ");
				ContinueInput= sc.next();
				
				if(ContinueInput.equalsIgnoreCase("yes") || ContinueInput.equalsIgnoreCase("no"))
				{
					break;
				}
				else
				{
					System.out.println(" Invalid Input. plz enter 'yes' or 'no'. ");
				}
			}
			
			
		} while (ContinueInput.equalsIgnoreCase("yes"));
		 System.out.println("Thank you for using the Neon Number Checker. Goodbye!");
		 sc.close();
		
	}
	
	public static boolean is_Neon_Number(int num)
	{
		int squre = num * num; 		// 9^= 81 
		int sum = 0 ;
		while (squre>0)
		{
			int digit = squre%10;	//81%10 = 1 ;
			sum = sum+digit; 
			squre = squre/10;
		}
		
		return sum==num;
	}
}

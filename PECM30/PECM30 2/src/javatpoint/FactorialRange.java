package javatpoint;

import java.util.Scanner;

public class FactorialRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your starting Number ");
		int start = sc.nextInt();
		
		System.out.println(" Enter your Ending Number ");
		int end = sc.nextInt();
		
		sc.close();
		
		
		for (int num = start; num <=end; num++) 
		{int fact = 1;
			
			for (int i = 1; i <=num; i++) 
			{
				fact = fact*i;
			}
			System.out.println(" factorial of "+ num+" is : "+ fact);
		}
		
		
	}
}

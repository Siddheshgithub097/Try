package javatpoint;

import java.util.Scanner;

public class RangeOfprimeNumber 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Starting Number ");
		int start = sc.nextInt();
		
		System.out.println(" enter Ending number ");
		int end = sc.nextInt();
		
		for (int num = start; num <= end; num++) 
		{
			if(isPrime(num))
			{
				System.out.println(num+" Is Prime Number ");
			}
		}
		
	}
	
	public static boolean isPrime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for (int i = 2; i <=Math.sqrt(num); i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}

package javatpoint;

import java.util.Scanner;

public class PrimeNumber 
{
	// prime number mean tyla 1,2 peksha jasta ne divisible nasto e.g - 2,3
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the Number ");
		int num = sc.nextInt();
		
		if(isprime(num))
		{
			System.out.println(num+" is prime Number ");
		}
		else
		{
			System.out.println(num+" is Not prime Number ");
		}
	}
	
	public static boolean isprime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}

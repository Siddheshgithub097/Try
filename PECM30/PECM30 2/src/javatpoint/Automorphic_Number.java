package javatpoint;

import java.util.Scanner;

public class Automorphic_Number 
{
	// automorphic number mean = squre end with same digit 
	// e.g 5 = 5^2 = 25 (last digit is 5 );
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number ");
		int num = sc.nextInt();
		
		if(isAutomorphic(num))
		{
			System.out.println(num+" is Automorphic number ");
		}
		else
		{
			System.out.println(num+" is Not Automorphic Number ");
		}
		
		
	}
	
	public static boolean isAutomorphic(int num)
	{
		int squre = num*num;
		
		String numm = Integer.toString(num);
		
		String squre1 = Integer.toString(squre);
		
		return squre1.endsWith(numm);
	}
}

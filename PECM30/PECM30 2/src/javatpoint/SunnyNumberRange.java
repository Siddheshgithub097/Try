package javatpoint;

import java.util.Scanner;

public class SunnyNumberRange 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the starting Number ");
		int start = sc.nextInt();
		
		System.out.println(" Enter the ending Number ");
		int end = sc.nextInt();
		
		
		for (int num = start; num <= end; num++) 
		{
			if(isSunny(num))
			{
				System.out.println(num+" is Sunny Number ");
			}
		}
		
	}
	
	public static boolean isPerfectSqure(int num)
	{
		if(num<0)
		{
			return false;
		}
		
		int squre = (int) Math.sqrt(num);
		
		return squre*squre==num;
	}
	
	public static boolean isSunny(int num)
	{
		return isPerfectSqure(num+1);
	}
}

package javatpoint;

import java.util.Scanner;

public class SunnyNumber 
{
	public static void main(String[] args) 
	{
		
		// sunny Number mean ty number chy pudhchy number ha perfect squre asto e.g - 80 , 80+1 =81 ha perfect squre aahe 9 cha 
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number ");
		int num = sc.nextInt();
		
		if(isSunny(num))
		{
			System.out.println(num+" is Sunny Number ");
		}
		else
		{
			System.out.println(num+ "  is not Sunny Number ");
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

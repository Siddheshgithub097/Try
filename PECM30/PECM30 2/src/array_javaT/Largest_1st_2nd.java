package array_javaT;

public class Largest_1st_2nd 
{
	public static void main(String[] args)
	{
		int array [] = {14,2,586,706,57,78,87,67,96,97,45,35} ; 
		
		int max = array[0];
		int secondmax = 0;
		
		for (int i = 1; i < array.length; i++) 
		{
			if(max<array[i])
			{
				max = array[i];
			}
		}
		
		for (int i = 1; i < array.length; i++) 
		{
			if(secondmax<array[i] && array[i]!=max)
			{
				secondmax =array[i];
			}
		}
		
		System.out.println(" First Maximum Value Is : "+ max);
		System.out.println(" Second Maximum value Is : "+ secondmax);
	}
}

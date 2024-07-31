package array_javaT2;

public class Largest_Element 
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		int largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(largest<array[i])
			{
				largest= array[i];
			}
		}
		
		System.out.println(largest+ " is the largest value in array ");
	}
}

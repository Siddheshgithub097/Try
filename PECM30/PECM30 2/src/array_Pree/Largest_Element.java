package array_Pree;

public class Largest_Element 
{
	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56};
		
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(largest<array[i])
			{
				second_largest=largest;
				largest=array[i];
			}
			else if (second_largest<array[i] && array[i]!=largest)
			{
				second_largest = array[i];
			}
		}
		
		System.out.println(" largest value is : "+largest);
		System.out.println(" Second_largest value is : "+second_largest);
	}
}

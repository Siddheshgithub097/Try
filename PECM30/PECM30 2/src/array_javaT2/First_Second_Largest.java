package array_javaT2;

public class First_Second_Largest
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		int largest = array[0];
		int secondlargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(largest<array[i])
			{
				secondlargest=largest;
				largest = array[i];
			}
			else if(secondlargest<array[i]&&array[i]!= largest)
			{
				secondlargest = array[i];
			}
			
		}
		
		System.out.println(" first largest value is "+ largest);
		System.out.println(" second largest value is "+ secondlargest);
	}
}

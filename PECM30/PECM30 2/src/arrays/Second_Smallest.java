package arrays;

public class Second_Smallest 
{
	public static void main(String[] args) 
	{
		
		int array [] = {12,11,32,45,67,87,9};
		
		int first_smallest = Integer.MAX_VALUE;
		int Second_Smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(first_smallest>array[i])
			{
				Second_Smallest = first_smallest;
				first_smallest = array[i];
			}
			else if(Second_Smallest>array[i] && Second_Smallest!=first_smallest)
			{
				Second_Smallest= array[i];
			}
		}
		
		System.out.println(" first smallest value is "+ first_smallest);
		System.out.println(" Second smallest value is "+ Second_Smallest);
		
	}
}

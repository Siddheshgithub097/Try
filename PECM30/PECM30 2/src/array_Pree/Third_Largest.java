package array_Pree;

public class Third_Largest {

	public static void main(String[] args) 
	{
		int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 84, 34};
		
		int first_largest = Integer.MIN_VALUE;
		int Second_Largest = Integer.MIN_VALUE;
		int third_Largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(first_largest<array[i])
			{
				third_Largest = Second_Largest;
				Second_Largest = first_largest;
				first_largest = array[i];
			}
			else if (Second_Largest<array[i])
			{
				third_Largest = Second_Largest;
				Second_Largest = array[i];
			}		
			else if (third_Largest<array[i])
			{
				third_Largest= array[i];
			}
		}
		
		System.out.println(" third largest value is "+ third_Largest);

	}

}

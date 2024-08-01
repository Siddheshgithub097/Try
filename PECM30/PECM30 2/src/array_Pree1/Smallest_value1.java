package array_Pree1;

public class Smallest_value1 
{
	public static void main(String[] args) 
	{
		int array [] = {34,23, 65,87,98,56,78,56,45,87,34};
		
		int min = array[0];
		for (int i = 0; i < array.length; i++) 
		{
			if(min>array[i])
			{
				min = array[i];
			}
		}
		
		System.out.println(min + " is smallest value of array ");
	}
}

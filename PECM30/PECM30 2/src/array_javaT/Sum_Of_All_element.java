package array_javaT;

public class Sum_Of_All_element 
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) 
		{
			sum = sum+array[i];
		}
		
		System.out.println(" sum of the array is = "+ sum);
	}
}

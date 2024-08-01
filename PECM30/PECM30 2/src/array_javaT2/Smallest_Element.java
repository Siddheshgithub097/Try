package array_javaT2;

public class Smallest_Element 
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(smallest>array[i])
			{
				smallest = array[i];
			}
		}
		
		System.out.println(smallest);
	}
}

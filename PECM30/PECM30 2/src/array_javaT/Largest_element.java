package array_javaT;

public class Largest_element 
{
	public static void main(String[] args) {
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		int largest = array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if(array[i]>largest)
			{
				largest = array[i];
			}
		}
		
		System.out.println(largest + " is the largest value an array ");
	}
}

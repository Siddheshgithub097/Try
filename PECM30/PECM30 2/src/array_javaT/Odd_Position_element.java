package array_javaT;

public class Odd_Position_element 						//	Program to print the elements of an array present on odd position
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		for (int i = 0; i < array.length; i=i+2) 
		{
			System.out.println(array[i]+" ");
		}
	}
}

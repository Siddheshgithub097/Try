package array_javaT2;

public class Reverse_Element 
{
	public static void main(String[] args) 
	{
		
		int array [] = {1,2,3,4,5,6};
		
		System.out.println(" before reverse array ");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		System.out.println(" after reverse array ");
		for (int i = array.length-1; i > 0; i--) 
		{
			System.out.print(array[i]+ " ");
		}
	}
}
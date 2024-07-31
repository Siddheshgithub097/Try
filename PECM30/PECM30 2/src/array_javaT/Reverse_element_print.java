package array_javaT;

public class Reverse_element_print 
{
	public static void main(String[] args) 
	{
		
	
	int array [] = {34,65,87,98,56,78,56,45,87,34};
	
	System.out.println("Original array: ");  
	for (int i = 0; i < array.length; i++) 
	{
		System.out.print(array[i]+" ");
	}
	
	System.out.println();
	System.out.println(" reverse array: ");
	
	for (int i = array.length-1; i >=0; i--) 
	{
		System.out.print(array[i]+" ");
	}
}
}

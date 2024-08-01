package array_Pree1;

public class Reverse 
{
	public static void main(String[] args) {
		
		int array [] = {34,65,87,98,56,78,56,45,87,54};
		
		System.out.println(" before reverse an element ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println(" after reverse an element ");
		for (int i = array.length-1; i > 0; i--) 
		{
			System.out.print(array[i]+" ");
			
		}
	}
}

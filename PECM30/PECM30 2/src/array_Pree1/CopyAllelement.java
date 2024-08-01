package array_Pree1;

public class CopyAllelement 			// copy all element of array from one to another
{
	public static void main(String[] args) 
	{
		int array [] = {12,43,65,77,88,34,24,67,87};
		
		int arrayB [] = new int[array.length];					// tychi length allocated jhali with default value - 0
		
		for (int i = 0; i < array.length; i++) 
		{
			arrayB[i] = array[i];								// //Copying all elements of one array into another
		}
		
		System.out.println(" element of orignal array ");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(" element of new array ");
		// i want to print 
		
		for (int i = 0; i < arrayB.length; i++) 
		{
			System.out.print(arrayB[i] + " ");
		}
	}
}

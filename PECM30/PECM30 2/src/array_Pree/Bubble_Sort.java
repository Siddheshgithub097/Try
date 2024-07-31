package array_Pree;

public class Bubble_Sort 
{
	public static void main(String[] args) 
	{
		int array [] = {7,8,3,1,2};
		
		// bubble sort 
		
		for (int i = 0; i < array.length-1; i++) 	// n-1(array.lenth-1) bcz har bar hame ek element milega so next time last wale element ko hatakar loop chalayenge 
		{
			for (int j = 0; j < array.length-i-1; j++) 					// 1st baar loop chala rahe to 1 element  agli baar 2 
			{
				if(array[j]>array[j+1])									// agar pehli wali agle wale value se badi hoti hai to swap karenge
				{
					// swap 
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		printarray(array);
	}
	
	public static void printarray(int array[])
	{
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+ " ");
		}
		
		System.out.println();
	}
}

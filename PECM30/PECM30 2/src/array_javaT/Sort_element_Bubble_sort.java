package array_javaT;

public class Sort_element_Bubble_sort {

	
	public static void Bubblesort(int array [])
	{
		for (int i = 0; i < array.length-1; i++) 
		{
			
			for (int j = 0; j < array.length-i-1; j++) 
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int array [] = {14,2,586,706,87} ; 
		
		
		System.out.println(" before bubble sort ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println(); 
		
		Bubblesort(array);
		
		System.out.println(" after bubble sort ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		
	}

}

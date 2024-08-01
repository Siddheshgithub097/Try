package array_Pree;

public class Bubble_Sort_Element 
{
	
		public static void BubbleSort(int array [])
		{
			for (int i = 0; i < array.length-1; i++) 
			{
				for (int j = 0; j < array.length-i-1; j++) 
				{
					if(array[j]>array[j+1])
					{
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp ;
					}
				}
			}
		}
		
		public static void main(String[] args) 
		{
			int array [] = {12,43,76,736,3463,735,23,44,83,66,65,56};
			
			System.out.println(" before sorting element ");
			for (int i = 0; i < array.length; i++) 
			{
				System.out.print(array[i]+" ");
			}
			
			BubbleSort(array);
			
			System.out.println();
			System.out.println(" after sorting element ");
			
			for (int i = 0; i < array.length; i++) 
			{
				System.out.print(array[i]+" ");
			}
		}
	
}

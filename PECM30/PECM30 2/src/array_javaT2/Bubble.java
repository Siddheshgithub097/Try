package array_javaT2;

public class Bubble
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
						array[j]= array[j+1];
						array[j+1]=temp;
				}
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		int array [] = {12,74,6,7,8,9,12,43,76,736,3463,735,23,43,23,65,65,56,65,56};
		System.out.println(" before sorting ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		BubbleSort(array);
		System.out.println(" after bubble sort ");
		for (int i = 0; i < array.length; i++) 
		{

			System.out.print(array[i]+" ");
		}
	}
}

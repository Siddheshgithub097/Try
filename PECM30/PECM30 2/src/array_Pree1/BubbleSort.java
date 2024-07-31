package array_Pree1;

public class BubbleSort 
{
	public static void bubbleSort(int array [])
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
		int array[] = {12,646,56,45942,3975,9847};
		System.out.println("array before the bubble sort ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+ " ");
		}
		
		System.out.println(" array after the bubble sort ");
		bubbleSort(array);
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+ " ");
		}
	}
}

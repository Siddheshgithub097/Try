package array_Pree1;

public class Bubble_sort 
{
	
	public static void Bubble_sort(int arr [])
	{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length-i-1; j++) 
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
			
		}
	}
	
	public static void main(String[] args) 
	{
		int arr [] = {12,34,97,93,463,21,35,342};
		System.out.println(" array before bubble sort ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i] + " ");
		}
		
		Bubble_sort(arr);
		System.out.println(" array after bubble sort ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i] + " ");
		}
	}
}

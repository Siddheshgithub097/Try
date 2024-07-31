package array_javaT;

public class Sort_element_decending_bubbuleSort 
{
	
	public static void DecendingOrder(int array [])
	{
		
		for (int i = 0; i < array.length-1; i++) 
		{
			for (int j = 0; j < array.length-i-1; j++) 
			{
				if(array[j]<array[j+1])
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
		int array [] = {14,2,586,706,57,78,87,67,96,97,45,35} ; 
		
		System.out.println(" before sorting array ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		DecendingOrder(array);
		System.out.println(" after sorting array in decending order ");
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+ " ");
		}
		
	}
}

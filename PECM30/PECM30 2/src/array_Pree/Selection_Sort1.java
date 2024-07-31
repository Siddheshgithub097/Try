package array_Pree;

public class Selection_Sort1 {

	public static void main(String[] args) 
	{
		int array1 [] = {38,52,9,18,6,62,13};
		System.out.println("before sorting ");
		for(int i=0; i<array1.length; i++)
		{ System.out.println(array1[i]+ " ");
		}
	
	System.out.println("After sorting ");
	selectionSort(array1);
	for(int i=0; i<array1.length; i++)
	{
		System.out.println(array1[i]+ " ");
	}


	}
		
	public static void selectionSort(int array1[])
	{
		int min , temp ;
		for (int i = 0; i < array1.length; i++) 
		{
			for (int j = i+1; j < array1.length; j++) 
			{
				min= i;
				if(array1[j]<array1[min])
				{
					min = j;
				}
				temp = array1[i];
				array1[i] = array1[min];
				array1[min]= temp;
			}
			
		}
	}
}

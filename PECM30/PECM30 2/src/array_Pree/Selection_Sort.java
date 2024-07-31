package array_Pree;

public class Selection_Sort
{
	public static void main(String [] args)
	{
		int array [] = {38,52,9,18,6,62,13};
		System.out.println("before sorting ");
		for(int i=0; i<array.length; i++)
		{ System.out.println(array[i]+ " ");
		}
	
	System.out.println("After sorting ");
	SelectionSort(array);
	for(int i=0; i<array.length; i++)
	{
		System.out.println(array[i]+ " ");
	}

	}
		public static void SelectionSort(int array[])
	{
		int min ,  temp =0;
		for(int i=0; i<array.length; i++)
			{
				 
				min = i;
					for(int j = i+1 ; j<array.length; j++)
					{
						if(array[j]<array[min])
						{ 
							min = j;
						}
					}
				temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
	}
}

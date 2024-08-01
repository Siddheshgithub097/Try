package array_Pree;

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
					array[j+1]= temp;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int array [] = {14,2,586,7406,87} ; 
	System.out.println(" array before bubble sort");
	for (int i = 0; i < array.length; i++) 
	{
		System.out.print(array[i]+ " ");
	}
	
	BubbleSort(array);
	
	System.out.println();
	System.out.println("Array After Bubble Sort");  
    for(int i=0; i < array.length; i++){  
            System.out.print(array[i] + " ");  
    }  
		
	}
}

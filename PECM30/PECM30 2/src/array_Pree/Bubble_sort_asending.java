package array_Pree;

public class Bubble_sort_asending 
{
	public static void Bubblesort(int array[])
	{
		
		for (int i = 0; i < array.length-1; i++)
		{
			for (int j = 0; j < array.length-i-1; j++) 
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];		// ab array[j] already int temp mein chala gaya so ab wo khali hai ,so uske undar kuch bhi value dal sakte hai .
					array[j]=array[j+1];		// ab array[j+1] already array[j] mein chala gaya so array[j+1] to khali hai.
					array[j+1]=temp;			// ab array[j+1] mein khali hai so usmein hum dal denge hamari temp value . 
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int array [] = {14,2,586,706,87} ; 
		System.out.println(" array before bubble sort");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+ " ");
		}
		
		Bubblesort(array);
		
		System.out.println("Array After Bubble Sort");  
        for(int i=0; i < array.length; i++)
        {  
                System.out.print(array[i] + " ");  
        }  
	}
	
}

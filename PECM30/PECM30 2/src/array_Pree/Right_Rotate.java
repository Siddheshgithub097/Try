package array_Pree;

public class Right_Rotate 
{
	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56};
		
		int n = 3 ;
		
		System.out.println(" orignal array ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+" ");
		}
		
		for (int i = 0; i < n; i++) 
		{
			int j , first;
			
			first= array[0];
			
			for (j = 0;  j< array.length-1; j++) 
			{
				array[j] = array[j+1];
			}
			
			array[j] = first;
			
		}
		
		System.out.println();
		
		System.out.println(" after rotating array ");   		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] +" ");
		}
	}
}

package array_javaT;

public class Rotate_element 
{
		// i want to rotate element  e.g  5,6,7,8,9,10 --> 8,9,10,5,6 (this type 
	
	public static void main(String[] args) 
	{
		int array [] = {1,2,3,4,5,6};
		
		int n = 3 ;   //bcz i want it rotate from 4 
		
		System.out.println(" before rotating array ");   						// i want to display before rotating
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] + " ");
		}
		
		// so i want to rotate array 3 times 
		
		for (int i = 0; i < n; i++) 
		{
			  int j,  first;  
	            //Stores the first element of the array  
	           
			  first =array[0];
			  
			  for ( j = 0; j < array.length-1; j++) 
			  {
				  array[j]=array[j+1];
				
			  }
			  
			 array[j]= first;
		}
		
		System.out.println();
		
		System.out.println(" after rotating array ");   		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] +" ");
		}
	}
	
}

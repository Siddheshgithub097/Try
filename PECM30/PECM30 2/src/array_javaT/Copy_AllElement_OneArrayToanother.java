package array_javaT;

public class Copy_AllElement_OneArrayToanother 
{
	public static void main(String[] args) 
		
	{
		int array1 [] =  {12,43,76,736,3463,735,23,43,23,65,65,56};
		int array2 [] = new int[array1.length];					//Create another array arr2 with size of arr1    
		
		for (int i = 0; i < array1.length; i++)
		{
			array2[i]= array1[i];							//Copying all elements of one array into another   
		}
		
		System.out.println(" element of orignal array ");
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println();
		
																	//Displaying elements of array arr2     
        System.out.println("Elements of new array: ");  
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.print(array2[i] + " ");
		}
	
	}
}

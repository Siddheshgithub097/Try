package array_javaT2;

public class Copy_All_element {

	public static void main(String[] args)
	{
		int array1 [] =  {12,43,76,736,3463,735,23,43,23,65,65,56};

		int array2 [] = new int[array1.length];
		
		for (int i = 0; i < array2.length; i++) 
		{
			array2[i] = array1[i];
		}

		System.out.println(" elememt of orignal array ");
		for (int i = 0; i < array1.length; i++) 
		{
			System.out.print(array1[i]+" ");
		}
		
		System.out.println();
		
		System.out.println(" element of new array ");
		
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.print(array2[i]+" ");
		}
	}

}

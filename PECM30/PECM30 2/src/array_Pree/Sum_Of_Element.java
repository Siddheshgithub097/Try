package array_Pree;

public class Sum_Of_Element {

	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56};
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) 
		{
			sum = sum +array[i];
		}

		System.out.println(" Sum of all the elements of an array: "+ sum);
	}

}

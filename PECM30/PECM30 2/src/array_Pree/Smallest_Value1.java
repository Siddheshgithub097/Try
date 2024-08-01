package array_Pree;

public class Smallest_Value1 {

	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,7,23,65,65,56};
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(smallest>array[i])
			{
				smallest=array[i];
			}	
		}
		System.out.println(" smallest value of an array is : "+ smallest);
	}

}

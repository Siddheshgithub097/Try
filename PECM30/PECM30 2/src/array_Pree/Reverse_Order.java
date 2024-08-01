package array_Pree;

public class Reverse_Order 
{
	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56};
		
		System.out.println(" orignal array ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("=========================================== ");
		System.out.println(" reverse array ");
		
		for (int i = array.length-1 ; i >= 0; i--) 
		{
			System.out.print(array[i]+" ");
		}
	}
}

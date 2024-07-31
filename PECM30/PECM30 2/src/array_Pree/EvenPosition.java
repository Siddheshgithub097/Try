package array_Pree;

public class EvenPosition 
{
	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56};
		
		for (int i = 1; i < array.length; i=i+2) 
		{
			System.out.println(array[i]);
		}
	}
}

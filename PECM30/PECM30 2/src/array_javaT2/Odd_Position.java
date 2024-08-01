package array_javaT2;

public class Odd_Position 
{
	public static void main(String[] args) 
	{
		int array [] = {1,2,3,4,5,6};
		
		System.out.println(" Odd Position ");
		for (int i = 0; i < array.length; i=i+2) 
		{
			System.out.println(array[i]+" ");
		}
	}

}

package array_javaT2;

public class Even_Position 
{
	public static void main(String[] args) 
	{
		int array [] = {1,2,3,4,5,6};
		
		for (int i = 1; i < array.length; i=i+2) 
		{
			System.out.println(array[i]+" ");
		}
	}
}

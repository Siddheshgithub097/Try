package array_javaT;

public class Odd_Even 
{
	public static void main(String[] args)
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56,65,56};
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i] + " even num ");
			}
			else
			{
				System.out.println(array[i] + " odd num ");
			}
		}
	}
}

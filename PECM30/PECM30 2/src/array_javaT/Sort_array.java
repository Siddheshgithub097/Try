package array_javaT;

import java.util.Arrays;

public class Sort_array 
{
	public static void main(String[] args) 
	{
		int array [] = {-12,-34,0,12,43,76,736,3463,735,23,43,23,65,65,56,65,56};
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+" ");
		}
	}
}

package array_javaT;

import java.util.Arrays;

public class Third_Largest 
{
	public static void main(String[] args) 
	{
		int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 87, 34};
		
		Arrays.sort(array);
		
		int Third_Largest = array[array.length-3];
		
		System.out.println(" thrd largest value is "+ Third_Largest);
	}
}

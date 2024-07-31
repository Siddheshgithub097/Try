package arrays;

import java.util.Arrays;

public class FindLeader 
{
	public static void main(String[] args) 
	{
		int array [] = {16,17,4,3,5,2};
		int result []=findLeader(array);
		System.out.println(Arrays.toString(result));
		
	}
	
	public static int [] findLeader(int array []) 
	{
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]>max)
			{
				max = array[i];
				count++;
			}
		}
		
		int result [] = new int[count];
		result[0] = max;
		count = 1 ;
		max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]>max)
			{
				max = array[i];
				result[count]= max;
				count++;
			}
		}
		
		return result;
	}
}

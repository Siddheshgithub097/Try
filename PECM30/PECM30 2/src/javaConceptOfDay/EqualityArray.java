package javaConceptOfDay;

import java.util.Arrays;

public class EqualityArray 
{
	public static void main(String[] args)
	{
		
		int array []= {1,2,3,4,5};
		int array2 []= {1,2,3,4,5};
		
		if(isEqualArray(array, array2))
		{
			System.out.println(Arrays.toString(array)+" and "+Arrays.toString(array2)+" both are the equl ");
		}
		else
		{
			System.out.println(array+" and "+array2+" both are NOT equl ");
		}
	}
	
	public static boolean isEqualArray(int array [] , int array2 [])
	{
		if(array.length!=array2.length)
		{
			return false;
		}
		
		for (int i = 0; i < array2.length; i++) 
		{
			if(array[i]!=array2[i])
			{
				return false;
			}
		}
		
		return true;
	}
}

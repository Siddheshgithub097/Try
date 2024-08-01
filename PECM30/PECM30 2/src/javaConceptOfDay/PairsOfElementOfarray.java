package javaConceptOfDay;

public class PairsOfElementOfarray
{
	// Java Program To Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number :
	public static void main(String[] args)
	{
		
		FindpairSum(new int [] {1,2,3,4,6,7,8,9,12, 21}, 20);
		System.out.println("=================================== ");
		FindpairSum(new int [] {1,2,3,4,6,7,8,9,12, 21}, 14);
	}
	
	public static void FindpairSum(int array [] , int target)
	{
		for (int i = 0; i < array.length; i++) 
		{
			
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i]+array[j]==target)
				{
					System.out.println(array[i]+" + "+ array[j]+" = "+ target);
				}
			}
		}
	}
}

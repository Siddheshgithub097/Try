package javaConceptOfDay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateUsingHashset
{
	public static void main(String[] args) 
	{
		
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		System.out.println("======Duplicates Using HashSet======");
		findDuplicateHASHSET(array);
		
		System.out.println("======Duplicates Using HASHMAP======");
		FindDuplicateUsingHASHMAP(array);
		
		System.out.println("======Duplicates Using Sorting======");
		FindDuplicateUsingSortingMethod(array);
	}
	
	public static void findDuplicateHASHSET(int array []) 
	{
		HashSet<Integer>  set = new HashSet<Integer>();
		
		for (Integer integer : array)
		{
			if(!set.add(integer))
			{
				System.out.println(" Duplicate element found "+ integer);
			}
		}
	}
	
	public static void FindDuplicateUsingSortingMethod(int array [])
	{
		Arrays.sort(array);
		
		boolean flag = false;
		for (int i = 0; i < array.length-1; i++) 
		{
			if(array[i]==array[i+1])
			{
				System.out.println(" Duplicate element found "+ array[i]);
				flag = true;
			}
		}
	}
	
	public static void FindDuplicateUsingHASHMAP(int array [])
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		boolean flag = false;
		
		for (int i : array) 
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for (int i : map.keySet())
		{
			if(map.get(i)>1)
			{
				System.out.println(" Duplicate element found "+ i+ " --> "+ map.get(i));
			}
			flag = true;
		}
		
		if(!flag)
		{
			System.out.println(" No duplicate element found ");
		}
	}
	
	
}

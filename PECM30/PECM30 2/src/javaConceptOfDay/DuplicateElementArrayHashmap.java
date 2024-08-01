package javaConceptOfDay;

import java.util.HashMap;



public class DuplicateElementArrayHashmap 
{
	public static void main(String[] args) {
		
		int array [] = {34,65,87,98,56,78,56,45,87,34};

		boolean flag = false;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : array) 
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for (int i : map.keySet())
		{
			if(map.get(i)>1)
			{
				System.out.println(" Duplicate Element found : "+ i+ " --> "+map.get(i));
				flag = true;
			}
		}
		
		if(!flag)
		{
			System.out.println(" No duplicate Found ");
		}
	}
}

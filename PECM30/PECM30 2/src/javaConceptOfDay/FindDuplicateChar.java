package javaConceptOfDay;

import java.util.HashMap;

import arrays.Hashmap;

public class FindDuplicateChar 
{
	public static void main(String[] args) {
		
		String str = " Siddehsh Pathare ";
		
		str = str.toLowerCase();
		
		str= str.replaceAll("\\s", "");
		
		boolean flag = false;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character character : str.toCharArray())
		{
			
			{
				map.put(character, map.getOrDefault(character, 0)+1);
			}
		}
		
		for (Character character : map.keySet())
		{
			if(map.get(character)>1)
			{
				System.out.println(" Duplicate character found : "+ character);
				flag = true;
			}
		}
		if(!flag)
		{
			System.out.println(" No duplicate char found ");
		}
		
	}
}

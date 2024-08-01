package javaConceptOfDay;

import java.util.HashMap;
import java.util.Scanner;

import arrays.Hashmap;

public class AnagramHashmap 
{
	public static void main(String[] args) {
		
		String str1="Brag"; 
   		String str2="Grab"; 
   			
   						/* 
   						Scanner sc = new Scanner(System.in);
						System.out.println(" Enter the word ");
						String str1 = sc.next();
						
						System.out.println(" Enter the Second Word ");
						String str2 = sc.next();
   						 */
   		
   		str1 = str1.toLowerCase();
   		str2= str2.toLowerCase();
   		
   		if(isAnagram(str1, str2))
   		{
   			System.out.println(" Both String are Anagram ");
   		}
   		else
   		{
   			System.out.println(" Both String are not Anagram ");
   		}
   		
	}
	
	public static boolean isAnagram(String str , String str2)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for (Character character: str.toCharArray())
		{
			map.put(character, map.getOrDefault(character, 0)+1);
		}
		
		for (Character iterable_Character : str2.toCharArray())
		{
			map2.put(iterable_Character, map2.getOrDefault(iterable_Character, 0)+1);
		}
		
		return map.equals(map2);
	}
}

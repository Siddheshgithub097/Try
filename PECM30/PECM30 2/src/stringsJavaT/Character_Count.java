package stringsJavaT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Character_Count 
{
	public static void main(String[] args) 
	{
		String str = "Siddhesh" ; 
		
		// Create a HashMap to store character counts
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char ch : str.toCharArray()) 
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		// we display the character
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) 
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
	}
}

package arrays;

import java.util.HashMap;

public class Hashmap 
{
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		map.put(3, 56);
		map.put(2, 15);
		
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		map2.putAll(map);
		System.out.println(map2);
	}
}

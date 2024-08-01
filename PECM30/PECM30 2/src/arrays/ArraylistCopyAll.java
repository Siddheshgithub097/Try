package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistCopyAll 
{
	public static void main(String[] args) 
	{
		
		int arraay [] = {12,34,55,5,3,4,56,67,8};
		
		ArrayList<Integer> list334 = new ArrayList<Integer>();
		
		for (Integer integer : arraay) 
		{
			list334.add(integer);
		}
		
		int newarray [] = new int[list334.size()];
		
		for (int i = 0; i < list334.size(); i++) 
		{
			newarray[i] = list334.get(i);
			
		}
		
		System.out.println(Arrays.toString(newarray));
		
		
		
	/*	ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12,34,5,6,7,6,78,9));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.addAll(list);
		
		System.out.println(list2);
		*/
		
		
	}
}

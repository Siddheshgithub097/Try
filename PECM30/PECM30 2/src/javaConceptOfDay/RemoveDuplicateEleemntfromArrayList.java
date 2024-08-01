package javaConceptOfDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateEleemntfromArrayList 
{
	public static void main(String[] args) 
	{
		
		removeDuplicateFromArraylist();
		System.out.println("======================= ");
		System.out.println();
		
		RemoveDuplicateWIthAnother();
	}
	
	public static void removeDuplicateFromArraylist()
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12,23,34,56,3,4,5,6,12,23,45,76,45,69,36,67,92,21,57,6,34));
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (Integer integer : list) 
		{
			hashSet.add(integer);
		}
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
		
		System.out.println(" Arraylist with Duplicate : "+ list);
		System.out.println(" Arraylist without Duplicate : "+ arrayList);
	}
	
	public static void RemoveDuplicateWIthAnother()
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(12,23,34,56,3,4,5,6,12,23,45,76,45,69,36,67,92,21,57,6,34));
		
		HashSet<Integer> set = new HashSet<Integer>(list);
		
		ArrayList<Integer> arraylistWithoutDuplicate= new ArrayList<Integer>(set);
		
		System.out.println(" Orignal Arraylist With Duplicate element : "+ list);
		System.out.println(" Arraylist without Duplicate Element : "+ arraylistWithoutDuplicate);
	}
}

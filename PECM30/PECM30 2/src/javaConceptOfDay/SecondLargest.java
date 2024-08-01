package javaConceptOfDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SecondLargest 
{
	public static void main(String[] args) {
		
		int array [] = {1,2,3,4,5,67,45,34,54,32,12,115,76,43};
		
		System.out.println("............ USING FIRST METHOD............ ");
		SecondLargest(array);
		System.out.println();
		
		System.out.println("............ USING SECOND METHOD............ ");
		System.out.println(" Second Largest value is : "+ secondLargestusingSelection(array));
		System.out.println();
		
		System.out.println("............ USING Arraylist............. ");
		System.out.println(" Second Largest value is "+ secondLargestArraylist(array));
	}
	
	public static void SecondLargest(int array [])
	{
		int secondLargest = Integer.MIN_VALUE;
		int firstlargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(firstlargest<array[i])
			{
				secondLargest = firstlargest;
				firstlargest= array[i];
			}
			else if(secondLargest<array[i] && array[i]!=firstlargest)
			{
				secondLargest = array[i];
			}
		}
		
		System.out.println(" Second largest value in array is : "+ secondLargest);
	}
	
	public static int secondLargestusingSelection(int array [])
	{
		int secondlargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++)
		{
			
			for (int j = i+1; j < array.length; j++) 
			{
				
				if(array[i]>array[j])
				{
					
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array[array.length-2];
		
	}
	
	
	public static int secondLargestArraylist(int array [])
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (Integer integer : array)
		{
			list.add(integer);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		return list.get(1);
	}
}

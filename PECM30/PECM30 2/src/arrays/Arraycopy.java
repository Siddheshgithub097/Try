package arrays;

import java.util.Arrays;

public class Arraycopy 
{
	public static void main(String[] args) {
		
		int arraay [] = {12,34,55,5,3,4,56,67,8};
		
		int array2 [] = new int[arraay.length];
		
		for (int i = 0; i < arraay.length; i++) 
		{
			array2[i] = arraay[i];
		}
		
		
		
		for (int i = 0; i < array2.length; i++) 
		{
			System.out.println(array2[i]);
		}
		
				}
}

package javaConceptOfDay;

import java.util.Arrays;

public class ReverseWord
{
	public static void main(String[] args) {
		
		String str = " Siddhesh Pathare ";
		
		str= str.trim();
		
		String strrr [] = str.split(" ");
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = strrr.length-1; i >= 0; i--) 
		{
			builder.append(strrr[i]).append(" ");
		}
		
		System.out.println(builder);
	}
}

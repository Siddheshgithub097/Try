package javaConceptOfDay;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the word ");
		String str1 = sc.next();
		
		System.out.println(" Enter the Second Word ");
		String str2 = sc.next();
		
	//	String str1="Brag"; 
   //		String str2="Grab"; 
   		
   		str1 = str1.toLowerCase();
   		str2= str2.toLowerCase();

   		if(str1.length()!=str2.length())
   		{
   			System.out.println(" given string is not anagram ");

   		}
   		else
   		{
   			
   			char strr1 [] = str1.toCharArray();
   			char strr2 [] = str2.toCharArray();
   			
   			Arrays.sort(strr1);
   			Arrays.sort(strr2);
   			
   			if(Arrays.equals(strr1, strr2))
   			{
   				System.out.println("Both the strings are anagram"); 
            } 
            else { 
                System.out.println("Both the strings are not anagram"); 
            } 

   		}
	}
}

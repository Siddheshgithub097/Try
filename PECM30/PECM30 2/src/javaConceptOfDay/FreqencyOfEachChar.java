package javaConceptOfDay;

import java.util.HashMap;

public class FreqencyOfEachChar 
{
	public static void main(String[] args) {
		
		String str = "Java J2EE Java JSP J2EE";
		
		str = str.toLowerCase();
		
		System.out.println(" String is : "+ str);
		System.out.println(); 
		
		System.out.println(".....................Using Hashmap.....................");
		CountOfcharHASHMAP(str);
		System.out.println();
		
		System.out.println(".....................Using STRING.....................");
		CountOfCharUSINGSTRING(str);
	}
	
	public static void CountOfcharHASHMAP( String str )
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character iterable_Character : str.toCharArray())
		{
			if(iterable_Character!=' ')
			{
			map.put(iterable_Character, map.getOrDefault(iterable_Character, 0)+1);
			}
		}
		
		System.out.println(map);
	}
	
	public static void CountOfCharUSINGSTRING(String str )
	{
		int freq [] = new int[str.length()];
		
		char strrr [] = str.toCharArray();
		
		for (int i = 0; i < strrr.length; i++) 
		{
			freq[i] = 1;
			
			for (int j = i+1; j < strrr.length; j++)
			{
				
				if(strrr[i]==strrr[j])
				{
					freq[i]++;
					strrr[j]='0';
				}
			}
		}
		
		System.out.println(" Char and their freqency ");

		boolean flag = true;
		
		for (int i = 0; i < strrr.length; i++) 
		{
			if(strrr[i]!='0' && strrr[i]!=' ')
			{
				if(!flag)
				{
					System.out.print(", ");
				}
				System.out.print(strrr[i]+" ---> "+ freq[i]+" ");
				flag = false;
				
			}
		}
		
	}
}

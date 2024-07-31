package javaConceptOfDay;

import java.util.Arrays;

public class Duplicate_Char 
{
	public static void main(String[] args) {
		
		String str =" Siddhesh Pathare ";

		str = str.toLowerCase();
		
		str = str.replaceAll("\\s", "");
		
		char strr [] = str.toCharArray();
		
		for (int i = 0; i < strr.length; i++) 
		{
			int count = 0;
			
			if(strr[i]!='0' && strr[i]!=' ')
			{
				for (int j = i+1; j < strr.length; j++) 
				{
					if(strr[i]==strr[j])
					{
						count++;
						strr[j]='0';
					}
				}
				
				if(count!=0)
				{
					System.err.println(strr[i]+" ");
				}
			}
		}
	}
}

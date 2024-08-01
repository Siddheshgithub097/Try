package javaConceptOfDay;

public class Cont_OF_Char
{
	public static void main(String[] args) {
		
	
	String str = "Siddhesh Pathare ";

	int count=0;
	for (int i = 0; i < str.length(); i++) 
	{
		if(str.charAt(i)!= ' ')
		{
			count++;
		}
		
		
	}
	System.out.println(" char of string is "+ count);
	}
}

package strings;

import java.util.Scanner;

public class Count_Of_Char 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the string ");
		String str = sc.next();
		
		
		int count= 0;
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		
		System.out.println(" total number of charactor in string is : "+ count);
	}
}

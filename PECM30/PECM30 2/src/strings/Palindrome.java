package strings;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data: ");
		String s1=sc.nextLine().toLowerCase();
		char []ch=s1.toCharArray();
		char ch1='\u0000';
		char ch2='\u0000';
		for(int i=0;i<ch.length;i++)
		{
			ch1=ch[i];
		}
		for(int j=ch.length-1;j>=0;j--)
		{
			ch2=ch[j];
		}
		if(ch1==ch2)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}
	}
}

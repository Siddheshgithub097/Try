package strings;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Data: ");
		String s1=sc.next();
		char []ch=s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
	}
}

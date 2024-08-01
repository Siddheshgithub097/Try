package strings;

import java.util.Scanner;

public class Vowels 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String data: ");
		String s1=sc.next();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' ||ch[i]=='I' || ch[i]=='O' || ch[i]=='U') 
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
}

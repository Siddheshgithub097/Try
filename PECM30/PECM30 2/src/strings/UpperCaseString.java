package strings;

import java.util.Scanner;

public class UpperCaseString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String: ");
		String s1=new Scanner(System.in).next();
		char [] ch=toCharArray(s1);
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
	public static char[] toCharArray(String s1)
	{
		char [] ch=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
		return ch;
	}
	//to find length
	public static int length(String s1)
	{
		char []ch=toCharArray(s1);
		return ch.length;
	}
	//to find lowercase to uppercase
	public static String toUpperCase(String s1)
	{
		String s2="";
		char ch[]=toCharArray(s1);
		for(int i=0;i<ch.length;i++)
		{
			char c1=ch[i];
			if(c1>='a' && c1<='z')
			{
				char c2=(char) (c1-32);
				s2=s2+c2;
			}
			else
			{
				s2=s2+c1;
			}
		}
		return s2;
	}
}

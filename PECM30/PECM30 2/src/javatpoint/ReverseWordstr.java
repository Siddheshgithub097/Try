package javatpoint;

import java.util.Arrays;

public class ReverseWordstr 
{
	public static void main(String[] args) 
	{
		String str = " Pathare Siddhesh ";
		
		str = str.trim();
		
		String strr [] = str.split(" ");
		
		for (int i = strr.length-1; i >= 0; i--)
		{
			System.out.print(strr[i]+" ");
		}
	}
}

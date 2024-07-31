package Array;

import java.util.Scanner;

public class ArrayFirstDublicate {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter array size");
		int a [] = new int [sc.nextInt()];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i]= sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			int count = 0;
			if (a[i] != 0)
			{
				for (int j = i+1 ; j < a.length; j++) 
				{
					if (a[i] == a[j])
					{
						count ++ ;
						a[j] =0 ;
						
					}
				}
				if (count != 0)
				{
					System.out.println(a[i]);
					return ;
				}
			}
		}
	}

}


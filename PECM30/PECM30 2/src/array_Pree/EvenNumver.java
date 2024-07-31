package array_Pree;

import java.util.Scanner;

public class EvenNumver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size Of Array ");
		
		int a [] = new int[sc.nextInt()];
		
		System.out.println(" Enter array element ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]= sc.nextInt();
		}
		
		System.out.print("Even Number is ");
		System.out.print(" { ");
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i]%2==0)
			{
				System.out.print(a[i]);
				if(i!=a.length-1)
				{
					System.out.print(" , ");
				}
				
			}
		}
		
		System.out.println(" } ");
		
		
	}
		
	}


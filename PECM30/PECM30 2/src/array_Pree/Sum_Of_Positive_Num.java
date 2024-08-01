package array_Pree;

import java.util.Scanner;

public class Sum_Of_Positive_Num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter The Size Of Array ");
		int ar [] = new int[sc.nextInt()];
		
		System.out.println(" Enter Element In Array ");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]= sc.nextInt();									// bcz user kadun input hava aahe na..
		}
		
		int sum = 0;
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>0)
			{
				sum = sum+ ar[i];
				
			}
		}
		
		System.out.println(" Sum Of Positive Number Is " + sum);
}
}

package ProgramingTask1;

import java.util.Scanner;

public class CountOfPositiveNegative 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int []a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();		
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0 )
			{
				count++;
			}
		}
		System.out.println("The Count of Positive Number is= "+count);
		
	}
}

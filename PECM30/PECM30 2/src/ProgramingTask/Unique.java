package ProgramingTask;

import java.util.Scanner;

public class Unique 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size if array: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			if(arr[i]!=0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=0;
					}
				}
				if(count==0)
				{
					System.out.println(arr[i]+" is unique element!");
				}
			}
		}
	}
}

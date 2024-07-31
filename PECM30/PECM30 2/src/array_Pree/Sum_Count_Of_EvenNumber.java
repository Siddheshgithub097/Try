package array_Pree;

import java.util.Scanner;

public class Sum_Count_Of_EvenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter The Size of Array ");
		int arr[] = new int[sc.nextInt()];
		
		System.out.println(" Enter the Element ");
		for(int i =0 ; i<arr.length ; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.print("Even Number is - ");
		System.out.print(" { ");
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
			{
				sum = sum + arr[i];
				count++;
				System.out.print(arr[i]);
				if(i!=arr.length-1)
				{
					System.out.print(" , ");
				}

				
			}
		}
		System.out.println(" } ");
		
		System.out.println("The count is "+count+" and sum of all positive element in the array is: "+sum);


	}
}

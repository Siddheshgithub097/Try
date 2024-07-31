package array_Pree;

import java.util.Scanner;

public class Unique_First 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter Array size ");
		int array[]= new int[sc.nextInt()];
		
		System.out.println(" enter element ");
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) 
		{
			int count =0;
			if(array[i]!=0)
			{
				for (int j = i+1; j < array.length; j++) 
				{
					if(array[i]==array[j])
					{
						count++;
						array[j]=0;
					}
				}
				
				if(count ==0) 
				{
					System.out.println(array[i]);
					return;
				}
			}
		}
		
	}
}

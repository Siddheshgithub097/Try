package arrays;

import java.util.Scanner;

public class CountOfDuplicate 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size in an array: ");
		int size=sc.nextInt();
		int []arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int count=1; //0
			if(arr[i]!=0) //3!=0
			{
				for(int j=i+1;j<arr.length;j++) //7<8
				{
					if(arr[i]==arr[j]) //3==5
					{
						count++;
						arr[j]=0;
					} //end of 2nd if condition
				} //end of inner loop
			    System.out.println("Count of "+arr[i]+" = "+count);
			} //end of 1st if condition
		} //end of outer loop
	}
}

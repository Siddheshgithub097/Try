package arrays;

import java.util.Scanner;

public class SwapDataInArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		int []arr=new int[size];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    int temp=arr[0];
	    arr[0]=arr[arr.length-1];
	    arr[arr.length-1]=temp;
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	}
}

package arrays;

import java.util.Scanner;

public class RemoveSpecificIndex 
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
	    System.out.println("Enter Index: ");
	    int index=sc.nextInt();
	    if(index<arr.length)
	    {
	    	arr[index]=0;
	    }
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(i!=index)
	    	{
	    		System.out.println(arr[i]);
	    	}
	    }
	}
}

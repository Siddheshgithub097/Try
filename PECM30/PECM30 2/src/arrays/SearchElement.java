package arrays;

import java.util.Scanner;

public class SearchElement 
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
	    System.out.println("Please enter the number for check: ");
	    int element=sc.nextInt();
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==element)
	    	{
	    		System.out.println("Element Found!");
	    		return;
	    	}
	    	System.out.println("Element Not Found!");
	    }
	    System.out.println("Element Not Found!");
	}
}

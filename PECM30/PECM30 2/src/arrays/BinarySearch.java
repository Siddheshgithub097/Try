package arrays;

import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search: ");
		int key=sc.nextInt();
		int [] a= {10,21,26,30,53,91,109,210,500};
		int start=0,end=a.length-1;
		int mid=(start+end)/2;
		boolean found=false;
		while(start<=end)
		{
			if(key==a[mid])
			{
				found=true;
				break;
			}
			else if(key<a[mid])
			{
				end=mid-1;
			}
			else if(key>a[mid])
			{
				start=mid+1;
			}
			mid=(start+end)/2;
		}
		if(found)
		{
			System.out.println("Element found at "+mid+" index");
		}
		else
		{
			System.out.println("Element not found!");
		}
	}
}

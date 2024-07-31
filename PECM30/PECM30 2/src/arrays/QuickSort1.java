package arrays;

import java.util.Arrays;

public class QuickSort1
{
	public static void main(String[] args) 
	{
		int []a= {10,5,8,20,9,1};
		System.out.println(Arrays.toString(quickSort(a,0,a.length-1)));
	}
	public static int[] quickSort(int []a,int i,int j)
	{
		if(i<j)
		{
			int partition=partition(a,i,j);
			quickSort(a,i,partition-1);
			quickSort(a,partition+1,j);
		}
		return a;
	}
	public static int partition(int []a,int low,int high)
	{
		int ref=a[low];
		int i=low;
		int j=high+1;
		while(i<j)
		{
			do
			{
				i++;
			}
			while(ref>=a[i]);
			do
			{					
				j--;
			}
			while(ref<a[j]);
			if(i<j)
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		int temp=a[j];
		a[j]=a[low];
		a[low]=temp;
		System.out.println(Arrays.toString(a));
		return j;
	}
}

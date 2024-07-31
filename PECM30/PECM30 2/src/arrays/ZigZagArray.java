package arrays;

import java.util.Scanner;

public class ZigZagArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		int[]a=new int[sc.nextInt()];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter length: ");
		int[]b=new int[sc.nextInt()];
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		int []res=merge(a,b);
		for (int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static int[] merge(int[]a,int[]b)
	{
		int []c=new int[a.length+b.length];
		int index=0;
		int big=a.length>b.length?a.length:b.length;
		for(int i=0;i<big;i++)  //4<6
		{
			if(i<a.length)  //3<3
			c[index++]=a[i];
			if(i<b.length)  //4<6
			c[index++]=b[i];
		}
		return c;
	}
}

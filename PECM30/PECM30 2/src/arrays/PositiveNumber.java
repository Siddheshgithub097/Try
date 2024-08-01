package arrays;
import java.util.Scanner;

public class PositiveNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int a[]=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}

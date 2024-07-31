package arrays;

import java.util.Scanner;

public class DuplicateElement 
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
			int count=0; //0
			if(arr[i]!=0) //3!=0
			{
				for(int j=i+1;j<arr.length;j++) //7<7
				{
					if(arr[i]==arr[j]) //3==5
					{
						count++;
						arr[j]=0;				// ekda to element bhetla tyla dirct 0 karun takaycha mean next time iterartion chy veles to prt nahi bhetnar.
					}
				} //end of inner loop
				if(count!=0) //0==0
				{
					System.out.println(arr[i]+" is the Duplicate Element!");
				} 
			} //end of if condition
		} //end of outer loop
	}
}

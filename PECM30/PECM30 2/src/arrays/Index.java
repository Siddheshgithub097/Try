package arrays;

import java.util.Scanner;

public class Index 				// ha program user ne jya value takyla aahet , tynusar aapn findout kru shakto konty index la konti value aahe 
														

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
	    	
	    	System.out.println(arr[index]);
	    }
	    else
	    {
	    	System.out.println("Index not Existing!");
	    }
	}
}
/*Enter size of an array: 
4
32423145
342314
234
234
Enter Index: 

3
234 */
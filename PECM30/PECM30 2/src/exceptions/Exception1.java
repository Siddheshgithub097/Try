package exceptions;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Exception1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the size: ");
			int size=sc.nextInt();
			int[] nums;
			if(size>0)
			{
				nums=new int[size];
				System.out.println("Array created of "+size+" size");
			}
			else
			{
				nums=null;
			}
			System.out.println("Enter the element to the array: ");
			for(int i=0;i<nums.length;i++)
			{
				nums[i]=sc.nextInt();
			}
			System.out.println("Element Added!");
			System.out.println("Enter the numerator index: ");
			int numerator=sc.nextInt();
			System.out.println("Enter the denometer index: ");
			int den=sc.nextInt();
			
			int res=nums[numerator]/nums[den];
			System.out.println(res);
		}
		catch(NullPointerException a)
		{
			System.out.println("Please enter the size greater than zero!");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter valid input!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Give the index greater than -1 and less than given size!");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Don't divide a number by zero!");
		}
		catch(NegativeArraySizeException a)
		{
			System.out.println("The size of the array must be greater than equal to zero!");
		}
		System.out.println("Thank You!");
	}
}

package arrays;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size: ");
		int []num=new int[sc.nextInt()];
		for (int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++)
		{
			if(isPalindrome(num[i]))
			{
				System.out.println("Palindrome Number= "+num[i]);
			}
		}
	}
	public static boolean isPalindrome(int num)
	{
		int rev=0;
		int Num=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(Num==rev)
		{
			return true;
		}
		return false;
	}
}

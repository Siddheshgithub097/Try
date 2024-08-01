package javaConceptOfDay;

public class LargestNumberWithoutDigit 
{
	public static void main(String[] args) 
	{
		// Java Program To Find Largest Number Less Than Given Number And Without A Given DIgit :
		
		System.out.println(findlargestlessthan(4582, 5));
		System.out.println(findlargestlessthan(53421, 3));
		
	}
	
	public static int findlargestlessthan(int number , int Digit)
	{
		// int digit ha number avoid karaycha aahe 
		//Converting digit to char
		
		char avoidDigit = Integer.toString(Digit).charAt(0);
		
		//Decrementing number & checking whether it contains digit
		// so what is my requirement i want to find largest number which is less than given number , and avoid digit 
		
		
		for (int i = number; i >= 0; i--)
		{
			if(Integer.toString(i).indexOf(avoidDigit)==-1)
			{
				return i ;
			}
		}
		return -1 ;
		
	}
	
	
}

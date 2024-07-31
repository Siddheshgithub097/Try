package javatpoint;

public class Factorial_Number
{
	// factorial = 4 = 4*3*2*1,
	public static void main(String[] args)
	{
		int num = 4;
		
		int fact= 1;
		
		for (int i = 1; i <= num; i++) 
		{
			fact= fact*i;
		}
		
		System.out.println(" factorial of "+ num+" is : "+ fact);
	}
}

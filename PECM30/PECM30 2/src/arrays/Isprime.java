package arrays;

public class Isprime 
{
	public static void main(String[] args) {
		
	
	int num = 7;
	
	
	
	if(isPrime(num))
	{
		System.out.println(num+" is prime num ");
	}
	else
	{
		System.out.println(num+" not prime number ");
	}
	
	}

	private static boolean isPrime(int num)
	{
		// TODO Auto-generated method stub
		
		if(num<=1)
		{
			return false;
		}
		
		for (int i = 2; i <num; i++) 
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
		
	}
	
}

package arrays;

public class PowerByRecursion 
{
	public static int power(int base,int raise)
	{
		if(raise>0)
		{
			return base*power(base,raise-1);
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(power(2,4));
	}
}

package arrays;

public class FactByRecursion 
{
	public static int fact(int num)
	{
		if(num>0)
		{
			return num*fact(num-1);
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(4);
	}
}

package array_javaT;

public class Third_largest_value 
{
	public static void main(String[] args) 
	{
		int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 84, 34};
		
		int Firstmax = Integer.MIN_VALUE;
		int SecondMax = Integer.MIN_VALUE;
		int Thirdmax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) 
		{
			if(Firstmax<array[i])
			{
				Thirdmax= SecondMax;
				SecondMax= Firstmax;
				Firstmax = array[i];
			}
			else if(SecondMax< array[i])
			{
				Thirdmax= SecondMax;
				SecondMax = array[i];
			}
			else if(Thirdmax<array[i])
			{
				Thirdmax= array[i];
			}
		}
		
		System.out.println(" first maximum value is "+ Firstmax);
		System.out.println(" Second maximum value is "+ SecondMax);
		System.out.println(" Third maximum value is "+ Thirdmax);
	}
}

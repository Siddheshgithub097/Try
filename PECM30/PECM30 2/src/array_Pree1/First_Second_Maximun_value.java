package array_Pree1;

public class First_Second_Maximun_value {

	public static void main(String[] args) 
	{
		int array [] = {34,23, 65,87,98,56,78,56,45,87,34};
		
		int max = array[0];
		int max2 = 0;
		for (int i = 1; i < array.length; i++) 
		{
			if(max<array[i])
			{
				max= array[i];
			}
		}
		
		for (int i = 1; i < array.length; i++) 
		{
			if(max2<array[i] && array[i]!=max)
			{
				max2 = array[i];
			}
			
		}
		System.out.println(" Firstmax value is "+max);
		System.out.println(" SecondMax value is "+ max2);
	}

}

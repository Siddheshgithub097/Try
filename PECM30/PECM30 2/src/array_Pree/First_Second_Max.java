package array_Pree;

public class First_Second_Max 
{
	public static void main(String[] args) 
	{
		int array [] = {1233,354235,3254252,9754863,298349435};
		
		int max= array[0];
		int Secondmax = 0;
		for (int i = 1; i < array.length; i++) 
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		for (int i = 1; i < array.length; i++) 
		{
			if(array[i]>Secondmax && array[i]!=max)
			{
				Secondmax= array[i];
			}
		}
		System.out.println(" Firstmax value is "+max);
		System.out.println(" SecondMax value is "+ Secondmax);
	}
}

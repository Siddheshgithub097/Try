package array_javaT;

public class Even_Odd 
{
	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56,65,56};
		
		System.out.println(" Even Number ");
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]%2==0)
			{
				System.out.println(" "+array[i]+" ");
			}
		}
		
		System.out.println(" odd Number ");
		for (int i = 0; i < array.length; i++) 
		{

			if(array[i]%2==1)
			{
				System.out.println(" "+array[i]+" ");
			}
		}
	}
}

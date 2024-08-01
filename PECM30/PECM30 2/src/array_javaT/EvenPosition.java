package array_javaT;

public class EvenPosition 
{
	public static void main(String[] args)
{
		int array [] = {34,65,87,98,56,78,56,45,87,34}; 
		
		for (int i = 1; i < array.length; i=i+2) 
		{
			System.out.println(" even position element - "+ array[i]);
		}
}
}

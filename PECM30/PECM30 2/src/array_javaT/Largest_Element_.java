package array_javaT;

public class Largest_Element_ 
{
	public static void main(String[] args) {
		
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		int lar = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]>lar)
			{
				lar = array[i];
			}
		}
		System.out.println(" largest value of array is "+lar);
	}
}

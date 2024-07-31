package array_javaT;

public class Even_Array 		//Even Array 
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]%2==0)
			{
				System.out.println(array[i]+" ");
			}
		}
	}
}

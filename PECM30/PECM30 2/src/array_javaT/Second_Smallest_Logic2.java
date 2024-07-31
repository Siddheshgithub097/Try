package array_javaT;

public class Second_Smallest_Logic2 {

	public static void main(String[] args) 
	{
		int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 84, 34}; 
		
		int firstMin=Integer.MAX_VALUE ;
		int SecondMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(firstMin>array[i])
			{
				SecondMin = firstMin;
				firstMin= array[i];
			}
			else if (SecondMin>array[i] && array[i]!=firstMin)
			{
				SecondMin = array[i];
			}
		}
		
		System.out.println(" First min value is = "+ firstMin);
		System.out.println(" Second Min value is = "+ SecondMin);
	}

}

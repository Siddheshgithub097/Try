package array_javaT;

public class Third_Largest1 
{
	public static void main(String[] args) {
		int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 84, 34};
		
		int firstlar = Integer.MIN_VALUE;
		int secondlar = Integer.MIN_VALUE;
		int thirdlar = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(firstlar<array[i])
			{
				thirdlar= secondlar;
				secondlar= firstlar;
				firstlar= array[i];
			}
			else if (secondlar<array[i])
			{
				thirdlar= secondlar;
				secondlar= array[i];
			}
			else if (thirdlar<array[i])
			{
				thirdlar= array[i];
			}
		}
		System.out.println(" first largest value is "+ firstlar);
		System.out.println(" my third largest value is "+ thirdlar);
	}
}

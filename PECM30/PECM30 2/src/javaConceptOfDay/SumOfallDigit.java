package javaConceptOfDay;

public class SumOfallDigit 
{
	public static void main(String[] args) {
		
		int num = 4567;
		
		int temp ,reminder , sum =0;
		
		temp =num;
		
		while (num>0)
		{
			reminder = num%10;
			sum= sum+reminder;
			num= num/10;
		}
		
		System.out.println(" Sum Of all Digit In "+ temp+" is "+ sum);
	}
}

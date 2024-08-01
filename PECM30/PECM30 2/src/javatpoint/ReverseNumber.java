package javatpoint;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num = 153 ;
		
		int reminder , temp , sum = 0;
		
		while (num>0)
		{
			reminder= num%10;
			sum=(sum*10)+ reminder;
			num = num/10;
		}
		
		System.out.println(" reverse Number : "+ sum);
	}
}

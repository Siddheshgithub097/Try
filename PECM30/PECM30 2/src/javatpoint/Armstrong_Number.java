package javatpoint;

public class Armstrong_Number 
{
	public static void main(String[] args) {
		
		int num = 153 ;
		
		int reminder,sum = 0 ;
		
		int temp = num;
		while (num>0)
		{
			reminder= num%10;
			sum= sum+(reminder*reminder*reminder);
			num = num/10;
		}
		
		if(sum==temp)
		{
			System.out.println(" Armstrong Number ");
		}
		else
		{
			System.out.println(" Not Armstrong Number ");
		}
	}
}

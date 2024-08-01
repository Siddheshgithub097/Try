package javatpoint;

public class Palindrome_Integer 
{
	public static void main(String[] args) {
		
		int num = 434;
		
		int reverse,temp,sum=0;
		
		temp=num;
		
		while (num>0)
		{
			reverse= num%10;
			sum=(sum*10)+reverse;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println(" Given Number is palindrome ");
		}
		else
		{
			System.out.println(" Given Number is Not Palindrome ");
		}
		
	}
}

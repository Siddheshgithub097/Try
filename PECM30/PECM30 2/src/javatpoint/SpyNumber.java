package javatpoint;

import java.util.Scanner;

public class SpyNumber 
{
	// spy number mean product and sum donhi same asta  
	// 132 = 1+3+2 = 6 ; & 1*3*2 = 6 ; 6=6 its spy number 
	
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		
		String ContinueInout;
		int num;
		do 
		{
			System.out.println(" enter the number ");
			num = Sc.nextInt();
			
			int product = 1 , sum = 0 ;
			int temp =num;
			
			while (num>0)
			{
				int lastdigit = num%10 ;	//132%10 = 2 ,3 ,1%10 = 1
				sum = sum+lastdigit;	// 0+2 = 2 ,3+2 = 5; 5+1 = 6
				product = product*lastdigit; // 1*2 = 2 ; 2*3 =6 ; 6* 1 = 6
				num = num/10;			// 132/10 = 13 ; 13/10 =1 ;
			}
			
			if(sum==product)		// 6==6
			{
				System.out.println(temp+" is Spy Number ");
			}
			else
			{
				System.out.println(temp+" is Not Spy Number ");
			}
			
			System.out.println(" Do you want to enter another number ? (yes/no) ");
			ContinueInout = Sc.next();
			
			
		} 
		while (ContinueInout.equalsIgnoreCase("yes"));
		System.out.println(" thank you for using The Spy Number Checker. Goodbye!");
		Sc.close();
		
	}
	/*
	 First Iteration:

			num = 132
			lastdigit = 132 % 10 = 2
			sum = 0 + 2 = 2
			product = 1 * 2 = 2
			num = 132 / 10 = 13
			Second Iteration:
			
			num = 13
			lastdigit = 13 % 10 = 3
			sum = 2 + 3 = 5
			product = 2 * 3 = 6
			num = 13 / 10 = 1
			Third Iteration:
			
			num = 1
			lastdigit = 1 % 10 = 1
			sum = 5 + 1 = 6
			product = 6 * 1 = 6
			num = 1 / 10 = 0
			The loop ends because num is now 0.
	*/
}

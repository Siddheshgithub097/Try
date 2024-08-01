package javatpoint;

import java.util.Scanner;

public class Automorphichrange 
{
	// automorphich mean number chy squre chy last digit he same asta 
	
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter The Starting Number ");
		 int start = sc.nextInt();
		 
		 System.out.println(" Enter The Ending number ");
		 int end = sc.nextInt();
		 
		 for (int Num = start; Num <= end; Num++) 
		 {
			 
			 if(isAutomorphich(Num))
			 {
				 System.out.println(Num+" is Automorphich number ");
			 }
		 }
		 
		 
	}
	
	public static boolean isAutomorphich(int num)
	{
		int squre = num*num;
		
		String number = Integer.toString(num);
		
		String squrestrr = Integer.toString(squre);
		
		return squrestrr.endsWith(number);
		
	}
}

package javatpoint;

import java.util.Scanner;

public class TechNumber_Range
{
	// tech Number = 2025 = 20+25 =45 , 45^2 =2025
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String ContinueInput ;
		 do 
		 {
			 System.out.println(" enter your starting Number ");
			 int start = sc.nextInt();
			 
			 System.out.println(" Enter your ending Number ");
			 int end = sc.nextInt();
			 
			 
			 for (int num = start; num <= end; num++)
			 {
				if(isTech_number(num))
				{
					System.out.println(num+" is tech Number ");
				}
			 }
			 
			 System.out.println(" Do you want check another ranges? (yes/no) ");
			 ContinueInput = sc.next();
		} while (ContinueInput.equalsIgnoreCase("yes"));
		 System.out.println("Thank you for using the Tech Number Checker. Goodbye!");
	        
			sc.close();
		 
		 
	}
	
	public static boolean isTech_number(int num)
	{
		// first of all aaplyla length check karavi lagel even aahe ka nahi ;
		
		String Number = Integer.toString(num);
		
		if(Number.length()%2!=0)
		{
			return false;
		}
		
		int firstPart = Integer.parseInt(Number.substring(0, Number.length()/2));
		
		int secondPart =  Integer.parseInt(Number.substring(Number.length()/2));
		
		int sum = firstPart+secondPart;
		
		return sum*sum==num;
	}
}

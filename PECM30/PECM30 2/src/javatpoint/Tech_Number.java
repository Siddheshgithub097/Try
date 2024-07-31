package javatpoint;

import java.util.Scanner;

public class Tech_Number 
{
	public static void main(String[] args) 
	{
		
		// tech number mean hard to explain
		// e.g 2025 , 20+25 = 45 , 45^2 = 2025 ;

		Scanner sc = new Scanner(System.in);
		String ContinueInput;
		
		do 
		{
			System.out.println(" enter your Number ");
			int num = sc.nextInt();
			
			if(isTechnumber(num))
			{
				System.out.println(num+" is tech Number ");
			}
			else
			{
				System.out.println(num+" is Not tech Number ");
			}
			
			System.out.println(" do you want to check another number ?  (yes/no) ");
			ContinueInput = sc.next();
			
		} while (ContinueInput.equalsIgnoreCase("yes"));
		 System.out.println("Thank you for using the Tech Number Checker. Goodbye!");
	        
		sc.close();
	}
	
	public static boolean isTechnumber(int num)
	{
		// so first of all aplyla tychi length even aahe ka nahi te check kaarycha aahe 
		
	//	if(num.le)// error dakhvat ahe bcz string mdhe aapn karu shakto 
			
			String number =  Integer.toString(num);
			
			// so  string mdhe tr kela aahe aata check kru , length even aahe ka nahi 
			
			if(number.length()%2!=0)
			{
				return false;
			}
			
			// next requirment ky ahe  aaplyla 2 part karun addition karaycha aahe 
			
			int first_half = Integer.parseInt(number.substring(0, number.length()/2));
			
			int Second_Half = Integer.parseInt(number.substring(number.length()/2));
			
			
			int sum = first_half+Second_Half;
			
			return sum*sum==num;
	}
}

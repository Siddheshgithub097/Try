package string;
import java.util.Scanner;
public class Palindrome {

	static boolean isPalindrome(String st)
	{
		int i = 0;
		while (i<st.length()/2)
		{
			if (st.charAt(i) != st.charAt(st.length()-1-i))
			
				return false ;
				i++;
		}
		       return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the sentence");
		String s = sc.nextLine();
		
		boolean Strings1 = isPalindrome(s);
		
		if(Strings1)
			System.out.println(" its palindrome");
		else 
			System.out.println("its  not palindrome");
	}

}

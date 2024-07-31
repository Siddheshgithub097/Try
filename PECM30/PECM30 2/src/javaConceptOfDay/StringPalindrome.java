package javaConceptOfDay;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str ="kayak";
		
		str=str.trim();
		
		boolean flag = true;
		
		for (int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
					{
						flag = false;
					}
		}
		
		if(flag)
		{
			System.err.println(" PALINDROME ");
		}
		else
		{
			System.out.println(" not Palindrome ");
		}

	}

}

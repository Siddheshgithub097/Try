package javatpoint;

public class SwapStringWithoutUsingThirdvariable 
{
	public static void main(String[] args) 
	{
		String str1 = " Siddhesh " ; 
		String strr2 = " Pathare ";
		
		System.out.println(" Before Swaping The String is : "+ str1+""+strr2);
		
		
		str1 = str1+strr2;	// siddhesh Pathare 
		
		strr2 = str1.substring(0, str1.length()-strr2.length()) ;
		
		str1 = str1.substring(strr2.length());
		
		System.out.println(" After swapping String is "+ str1+strr2);
		
		
	}
}

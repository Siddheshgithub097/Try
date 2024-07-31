package string_javaT2;

public class ReplaceSpace {

	public static void main(String[] args) 
	{
		String str = " Siddhesh Pathare 121 @ gmail . com ";
		char ch = '-';
		
		str = str.replace(' ', ch);
		
		System.out.println("String after replacing spaces with given character: "+ str);
		 
		
	}

}

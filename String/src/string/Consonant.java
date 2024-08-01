package string;
import java.util.Scanner;
public class Consonant {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println(" enter your string ");
		String st = sc.nextLine();
		
		char ch [] = st.toCharArray();
		int count = 0;
		
		for (int i = 0; i < ch.length; i++)
		{
			if ((ch[i]>='a' && ch[i] <= 'z'  )||(ch[i] == 'A' && ch[i] <= 'Z')) 
			{

				System.out.println(" in these given sentence consonant is : " + ch[i]);
			}
		}
	}

}

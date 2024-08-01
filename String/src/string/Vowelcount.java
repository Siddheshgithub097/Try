package string;
import java.util.Scanner;
public class Vowelcount {

	public static void main(String[] args)
	{

		Scanner sc= new Scanner (System.in);
		System.out.println(" enter your string ");
		String st = sc.nextLine();
		
		char ch [] = st.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i]=='a' || ch[i] == 'A' ||ch[i]=='e' || ch[i] == 'E' ||ch[i]=='i' || ch[i] == 'I' || ch[i]=='o' || ch[i] == 'O' || ch[i]=='u' || ch[i] == 'U')
			{
				count ++;
				System.out.println(" in these given sentence vowel is : " + ch[i]);
				
			}
		}
		System.out.println(" number of vowel is ---- " + count);
	}

}

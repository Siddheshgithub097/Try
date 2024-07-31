package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AL1 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(true);
		al1.add("Hello");
		al1.add(null);
		al1.add(null);
		al1.add('d');
		al1.add(null);
		al1.add(new Scanner(System.in));
		al1.add(133.144);
		
		System.out.println(al1);
	}
}

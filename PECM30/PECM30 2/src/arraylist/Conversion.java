package arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class Conversion 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> i=new ArrayList<>();
		i.add(23);
		i.add(23);
		i.add(56);
		i.add(76);
		i.add(12);
		
		System.out.println(i);
		
		HashSet<Integer> hs=new HashSet<>(i);
		System.out.println(hs);
	}
}

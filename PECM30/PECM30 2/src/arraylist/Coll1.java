package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Coll1 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList<>();
		a1.add(4);
		a1.add(1);
		a1.add(8);
		a1.add(0);
		a1.add(2);
		a1.add(0);
		a1.add(5);
		
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.shuffle(a1);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.rotate(a1,3);
		System.out.println(a1);
		System.out.println(Collections.max(a1));
		Collections.swap(a1,0,a1.size()-1);
		System.out.println(a1);
		System.out.println(Collections.binarySearch(a1,0));
		System.out.println(Collections.frequency(a1,0));
		Collections.replaceAll(a1,0,10);
		System.out.println(a1);
		Collections.reverse(a1);
	}
}

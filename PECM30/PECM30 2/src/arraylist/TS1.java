package arraylist;

import java.util.Iterator;
import java.util.TreeSet;

public class TS1 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t=new TreeSet<>();
		t.add(23);
		t.add(1);
		t.add(56);
		t.add(0);
		t.add(5);
		t.add(67);
		
		System.out.println(true);
		System.out.println(t.ceiling(5));
		
		Iterator<Integer> i=t.descendingIterator();
		System.out.println(i.next());
		System.out.println(t.descendingSet());
		System.out.println(t.floor(2));
		System.out.println(t.headSet(20,true));
		System.out.println(t.pollFirst());
		System.out.println(t);
		System.out.println(t.pollLast());
		System.out.println(t.subSet(5,true,23,true));
		System.out.println(t.tailSet(23,false));
	}
}

package arraylist;

import java.util.PriorityQueue;

public class PQ1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p1=new PriorityQueue<>();
		p1.add(23);
		p1.add(1);
		p1.add(45);
		p1.add(12);
		p1.add(76);
		p1.add(0);
		
		System.out.println(p1);
		System.out.println(p1.poll());
		System.out.println(p1.poll());
		System.out.println(p1.poll());
	}
}

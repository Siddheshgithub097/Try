package arraylist;

import java.util.HashMap;

public class HM1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h1=new HashMap<>();
		h1.put(10,"Pankaj");
		h1.put(12,"Pratik");
		h1.put(11,"Rahul");
		h1.put(40,"Vaibhav");
		
		System.out.println(h1);
		System.out.println(h1.containsKey(40));
		System.out.println(h1.containsValue("Pratik"));
		System.out.println(h1.get(10));
		System.out.println(h1.getOrDefault(21,"Employee Not Found....!"));
		
		h1.put(10,"Niraj");
		System.out.println(h1);
		System.out.println(h1.replace(40,"Vaibhav","Shankar"));
		System.out.println(h1.keySet());
		System.out.println(h1.values());
	}
}

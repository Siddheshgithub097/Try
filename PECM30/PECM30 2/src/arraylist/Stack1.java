package arraylist;

import java.util.Stack;

public class Stack1 
{
	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<>();
		s.push("abc");
		s.push("Hii");
		s.push("Hello");
		s.push("Bye");
		
		System.out.println(s.peek());
		System.out.println(s.search("Hello"));
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}

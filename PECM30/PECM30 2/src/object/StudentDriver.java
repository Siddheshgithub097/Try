package object;

public class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student s1=new Student("Tushar",143,"IIT",9876543210l);
		
		Student s2=new Student("Tushar",143,"IIT",9876543210l);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}

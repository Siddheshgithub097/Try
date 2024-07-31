package strings;

public class Demo 
{
	String a;
	Demo(String a)
	{
		this.a=a;
	}
	public static void main(String[] args) 
	{
		Demo d1=new Demo("Hello");
		Demo d2=new Demo("hello");
		System.out.println(d2.equals(d1));
	}
	public boolean equals(Object o1) 
	{
		Demo d1=(Demo)o1;
		String a=this.a;
		String b=d1.a;
		a=a.toUpperCase();
		b=b.toUpperCase();
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)==b.charAt(i))
				{
					
				}
				else
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
}

package wrapper;

public class Wrap3 
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(678);  //boxing
		
		int i=i1.intValue();  //unboxing
		
		System.out.println(i);
		
		Character ch1=new Character('y');  //boxing
		
		char ch=ch1.charValue();  //unboxing
		
		System.out.println(ch);
		
		Double d=new Double(345.435);  //boxing
		
		double d1=d.doubleValue();  //unboxing
		
		System.out.println(d1);
	}
}

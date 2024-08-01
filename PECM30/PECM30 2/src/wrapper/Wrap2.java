package wrapper;

public class Wrap2 
{
	public static void main(String[] args)
	{
		Character c1=new Character('e');  //Boxing
		
		System.out.println(c1); //non primitive
		
		char ch='e';
		
		System.out.println(ch);  //primitive
	}
}

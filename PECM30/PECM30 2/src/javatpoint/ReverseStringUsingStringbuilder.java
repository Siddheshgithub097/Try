package javatpoint;

public class ReverseStringUsingStringbuilder 
{
	public static void main(String[] args) {
		
		 String str = " Siddhesh ";
		 
		 StringBuilder builder = new StringBuilder(str).reverse();
		 
		 
		 System.out.println(" Orignal string : "+ str);
		 System.out.println(" After reverse String : "+ builder.toString());
	}
}

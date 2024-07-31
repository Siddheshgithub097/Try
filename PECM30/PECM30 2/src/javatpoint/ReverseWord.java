package javatpoint;

public class ReverseWord
{
	public static void main(String[] args) {
		
		String str = " Siddhesh Pathare ";
		
		String strr [] = str.split(" ");
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = strr.length-1; i >= 0; i--) 
		{
			builder.append(strr[i]).append(" ");
		}
		
		System.out.println(" Orignal String : "+ str);
		System.out.println(" After reverse Word : "+ builder.toString());
	}
}

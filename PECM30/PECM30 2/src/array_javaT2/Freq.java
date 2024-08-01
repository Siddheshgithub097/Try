package array_javaT2;

public class Freq 
{
	public static void main(String[] args)
	{
		String str = " picture perfect ";
		
		// remove whitespaces 
		
		str = str.replaceAll("\\s", "");
		
		int countstrr [] = new int[256];
		
		for (int i = 0; i < str.length(); i++)
		{
			countstrr[str.charAt(i)]++;
		}
		
		// so i wnat to display
		
		for (int i = 0; i < countstrr.length; i++) 
		{
			if(countstrr[i]>0)
			{
				System.out.println((char)i + " is "+ countstrr[i]+" times occures ");
			}
		}
	}
}

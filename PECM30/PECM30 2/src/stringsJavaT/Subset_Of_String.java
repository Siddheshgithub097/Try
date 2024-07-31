package stringsJavaT;

public class Subset_Of_String 
{
	public static void main(String[] args)
	{
		 String str = "FUN";  
		 int len = str.length();
		 int temp = 0;
		 
		 String strrr [] = new String[len*(len+1)/2];
		 
		 for (int i = 0; i < str.length(); i++)
		 {
			
			 for (int j = i; j < str.length(); j++)
			 {
				strrr[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		 
		 System.out.println(" all subset of string are ");
		 for (int i = 0; i < strrr.length; i++)
		 {
			 System.out.println(strrr[i]+" ");
		 }
	}
}

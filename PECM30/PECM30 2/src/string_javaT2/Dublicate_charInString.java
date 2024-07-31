package string_javaT2;

public class Dublicate_charInString 
{
	public static void main(String[] args) 
	{
		 String string1 = "Great responsibility";    
		 
		 char strr [] = string1.toCharArray();
		 
		 for (int i = 0; i < strr.length; i++) 
		{
			 int count = 1;
			 
			 for (int j = i+1; j < strr.length; j++) 
			 {
				if(strr[i]==strr[j] && strr[i]!=' ')
				{
					count++;
					strr[j]='0';
				}
			}
			 // if(count!=1)
			 {
				 System.out.println(strr[i] + " is occured in "+ count+" times ");
			 }
		}
		 
		 
	}
}

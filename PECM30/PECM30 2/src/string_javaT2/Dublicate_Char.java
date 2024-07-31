package string_javaT2;

 public class Dublicate_Char 
{
	public static void main(String[] args)
	{
		 String string1 = "Great responsibility";    
		 
		 string1 = string1.toLowerCase();
		 //Converts given string into character array    
		 
		 char [] strr = string1.toCharArray();
		 
		 System.out.println(" dublicate char in given string ");
		 
		 for (int i = 0; i < strr.length; i++) 
		{
			 int count = 1;
			 for (int j = i+1 ; j < strr.length; j++) 
			 {
				if(strr[i]==strr[j] && strr[i]!=' ')
				{
					count++;
					strr[j]='0';
				}
					
			}
			 
			 if(count>1 && strr[i]!='0')
			 {
				 System.out.println(strr[i]+ " ");
			 }
		}
	}
} 
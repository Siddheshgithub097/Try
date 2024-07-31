package string_javaT2;

public class Dubli_Char 
{
	
	public static void main(String[] args) 
	{
		 String string1 = "Great responsibility";   
		 
		 char [] str = string1.toCharArray();
		 
		 
		 System.out.println("Duplicate characters in a given string: ");
		 for (int i = 0; i < str.length; i++) 
		 {
			 int count = 1;
			if(str[i]!=0)
			{
				for (int j = i+1 ; j < str.length; j++) 
				{
				if( str[i]==str[j])
				{
					count++;
					str[j]=0;
				}
				}
			}
			
			if(count>1)
			{
				System.out.println(str[i]+" ");
			}
		}
	}
}

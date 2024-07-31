package string_javaT2;

public class Dublicate_Worde23
{
	public static void main(String[] args) 
	{
		 String string = "Big black bug bit a big black dog on his big black nose";    
		 
		 string = string.toLowerCase();
		 
		 String word [] = string.split(" ");
		 
		 for (int i = 0; i < word.length; i++) 
		 {
			 int count = 1;
			 if(word[i]!=null)
			 {
				 for (int j = i+1; j < word.length; j++) 
				 {
					 if(word[i].equals(word[j]) && word[i]!="0")
							 {
						 		count++;
						 		word[j]=null;
						 
							 }
				}
			 }
			 if(count>1)
			 {
				 System.out.println(word[i]+" ");
			 }
		 }
	}
}

package string_javaT2;

public class Dublicate_Worde 
{
	public static void main(String[] args) 
	{
		 String string = "Big black bug bit a big black dog on his big black nose"; 
		 
		 string = string.toLowerCase();
		 
		 String words [] = string.split(" ");
		 
		 for (int i = 0; i < words.length; i++) 
		 {
			 int count = 1;
			 
			 for (int j = i+1; j < words.length; j++) 
			 {
				 if(words[i].equals(words[j]) && words[i]!="0")
				 {
					 count++;
					 words[j]="0";
					 
				 }
			 }
			 
			 if(count>1)
			 {
				 System.out.println(words[i]+" ");
			 }
		 }
	}
}

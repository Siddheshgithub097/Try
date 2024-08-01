package strings;

public class Count_Of_Each_Char2 
{
	public static void main(String[] args) 
	{
		 String str = "Siddhesh Pathare ";  
		 str = str.toLowerCase();
		 int freq [] = new int[str.length()];
		 
		 char string  [] =str.toCharArray(); 
		 
		 for (int i = 0; i < str.length(); i++) 
		 {
			 freq[i] = 1;
			 
			 for (int j = i+1 ; j < str.length(); j++) 
			 {
				 if(string[i]==string[j])
				 {
					 freq[i]++;
					 string[j]='0';
				 }
			 }
		 }
		 
		 System.out.println("Characters and their corresponding frequencies");   
		 
		 for (int i = 0; i < string.length; i++) 
		 {
			 if(string[i]!=' ' && string[i]!='0') {
			 System.out.println(string[i]+" - "+ freq[i]); }
		}
	}
}

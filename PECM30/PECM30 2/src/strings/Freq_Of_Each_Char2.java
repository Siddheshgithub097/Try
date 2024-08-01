package strings;

public class Freq_Of_Each_Char2 
{
	public static void main(String[] args) 
	{
		 String str = "Siddhesh Pathare ";  
		 str = str.toLowerCase();
		 
		int freq [] = new int[ str.length()];
		
		char Strrr [] = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) 
		{
			freq[i] = 1;
			
			for (int j = i+1; j < str.length(); j++) 
			{
				if(Strrr[i]==Strrr[j])
				{
					freq[i]++;
					Strrr[j] = '0';
				}
			}
		}
		
		 System.out.println("Characters and their corresponding frequencies"); 
		 
		 for (int i = 0; i < Strrr.length; i++) 
		 {
			 if(Strrr[i]!='0' && Strrr[i]!=' ')
			 {
			 System.out.println(Strrr[i] + " ---> "+freq[i]); }
		}
		 
	}
}

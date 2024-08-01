package stringsJavaT;

public class Freq_of_Each_Char 
{
	public static void main(String[] args)
	{
		String str = "Siddhesh Pathare";
		
		str = str.toLowerCase();
		
		int freq [] = new int[str.length()];
		
		// now i will convert into array
		
		char string [] = str.toCharArray();
		
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
		
		System.out.println(" frequency of each char is ");
		for (int i = 0; i < string.length; i++) 
		{
			if(string[i]!='0' && string[i]!=' ')
			{
				System.out.println(string[i]+" occured in "+ freq[i]+" times ");
			}
		}
	}
}

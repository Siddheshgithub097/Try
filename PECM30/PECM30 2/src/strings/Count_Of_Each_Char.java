package strings;

public class Count_Of_Each_Char {

	public static void main(String[] args) 
	{
		String str = " Siddhesh Pathare ";
		
		// saglyt pahilyana yache white spaces aap remove kru 
		
		str = str.replaceAll("\\s", "");
		
		int charcount [] = new int[256];
		
		for (int i = 0; i < str.length(); i++) 
		{
			charcount[str.charAt(i)]++;
		}
		
		// so i want to display
		System.out.println(" char count in string ");
		
		for (int i = 0; i < charcount.length; i++) 
		{
			if(charcount[i]>0)
			{
				System.out.println((char)i+ " is "+ charcount[i]+" times ");
				
			}
		}

		
		
	}

}

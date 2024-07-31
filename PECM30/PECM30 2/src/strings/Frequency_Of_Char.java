package strings;

public class Frequency_Of_Char 
{
	public static void main(String[] args)
	{
		  String str = "Siddhesh Pathare";    
		  
		  str = str.toLowerCase();
		  int freq [] = new int [str.length()];
		  
		  // convert string into char array 
		  char [] string = str.toCharArray() ;
		  int i , j ;
		  for (i = 0; i < str.length(); i++) 
		  {
			  freq[i] = 1;
			  
			  for ( j = i+1 ; j < str.length(); j++) 
			  {
				if(string[i]==string[j])
				{
					freq[i]++;
					string[j]='0';
					
				}
				
				
			  }
		  }
		  
		  System.out.println("Characters and their corresponding frequencies");    
		  
		  for ( i = 0; i < freq.length; i++) 
		  {
			if(string[i]!=' ' && string[i]!='0')
			{
				System.out.println(string[i]+" - "+ freq[i]);
			}
		  }
		
	}
}

package string_javaT2;

public class Maximum_Minimum_Occuring_Char {

	public static void main(String[] args)
	{
		String str = "grass is greener on the other side";    
		
		int freq [] = new int[str.length()];
		
		char minchar = str.charAt(0);
		char maxchar = str.charAt(0);
		int i, j ,min , max;
		
		//Converts given string into character array    
	      char string[] = str.toCharArray();  		// bcz aaplyla pratek char count karaycha aahe na ..
	      
	      for (i = 0; i < string.length; i++) 
	    {
	    	  for (j = i+1 ;  j< string.length; j++) 
	    	 {
	    		  if(string[i]==string[j] && string[i]!=' '&& string[i]!=0)
	    		  {
	    			  freq[i]++;
	    			  
	    			  string[j]='0';
	    			 
	    		  }
			}
		}
	      
	      //Determine minimum and maximum occurring characters    
	      
	      min = max = freq[0]; // purpose is to initialized min and max is , frequency count of the first character in the array 
	      
	      for (i = 0; i < freq.length; i++) 
	      {
	    	  if(min>freq[i] && freq[i]!=0)
	    	  {
	    		  min = freq[i];
	    		  minchar = string[i]; 
	    	  }
	    	  if(max < freq[i]) {    
	              max = freq[i];    
	              maxchar= string[i];    
	          }    
		  }

	      System.out.println("Minimum occurring character: " + minchar);    
	      System.out.println("Maximum occurring character: " + maxchar);  
	}

}

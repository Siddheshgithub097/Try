package string_javaT2;

public class Dublicate_Word2 {

	public static void main(String[] args) 
	{
		String string = "Big black bug bit a big black dog on his big black nose";  
		
		string = string.toLowerCase();
		
		String chars [] = string.split(" ");
		
		for (int i = 0; i < chars.length; i++) 
		{
			int count = 0;
			if(chars[i]!=null)
			{
				for (int j = i+1 ; j < chars.length; j++) 
				{
					if(chars[i].equals(chars[j]))
					{
						count++;
						chars[j]=null;
					}
				}
			}
			
			if(count!=0)
			{
				System.out.println(chars[i]+" ");
			}
			
		}

	}

}

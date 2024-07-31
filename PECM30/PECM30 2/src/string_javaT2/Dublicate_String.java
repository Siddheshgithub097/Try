package string_javaT2;

public class Dublicate_String 
{
	public static void main(String[] args) 
	{
		String a[]= {"hello","hi","hello","Hello","thanks","thanks","sorry"};
		
		for (int i = 0; i < a.length; i++) 
		{
			int count = 0 ;
			if(a[i]!=null)
			{
				for (int j = i+1 ; j < a.length; j++)
				{
					if(a[i].equals(a[j]))
					{
						count++;
						a[j]=null;
					}
				}
			}
			// if(count!=0)
			{
				System.out.println(a[i]+" is occured in "+ count+" times ");
			}
		}
	}
}

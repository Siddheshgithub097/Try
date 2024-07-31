package array_Pree;

public class Dublicate_Last_String 
{
	public static void main(String[] args) 
	{
		String array[]= {"hi","hello","hello","harry","kevin","speed","Pree","Avengers","tom","tom","Tom","Pree",};
		
		for (int i = array.length-1; i > 0; i--)
		{
			int count = 0;
			if(array[i]!=null)
			{
			
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i].equals(array[j]))
				{
					count++;
					array[j]=null;
				}
			}
			}
			if(count!=0)
			{
				System.out.println(array[i]+" <--is last String_dublicate");
				return;
			}
		}
	}
}

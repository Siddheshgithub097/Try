package array_javaT;

public class Frequency_Of_String {

	public static void main(String[] args) 
	{
		String array[]= {"hi","Hello","hello","harry","kevin","speed","pree","Avengers","tom","tom","Tom","Pree","poona","hello","hello","harry","Pree","Avengers","tom"};
		
		for (int i = 0; i < array.length; i++) 
		{
			int count=1;
			if(array[i]!=null)
			{
				
				for (int j = i+1 ; j < array.length; j++) 
				{
					if(array[i].equals(array[j]))
					{
						count++;
						array[j]=null;
					}
				}
				
				if(count!=1)
				{
					System.out.println(" string - " +array[i] +" occurs " + count +" times ");
				}
			}
			
		}
	}

}

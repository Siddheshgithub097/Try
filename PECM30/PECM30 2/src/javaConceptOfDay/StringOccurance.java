package javaConceptOfDay;

public class StringOccurance 
{
	public static void main(String[] args) {
		
	
	String array[]= {"hi","hi","Hello","hello","harry","kevin","speed","pree","Avengers","tom","tom","Tom","Pree","poona","hello","hello","harry","Pree","Avengers","tom"};
	
	for (int i = 0; i < array.length; i++) 
	{
		int count = 1;
		if(array[i]!=null)
		{
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i].equalsIgnoreCase(array[j]))
						{
							count ++;
							array[j]=null;
						}
			}
			
			if(count!=0)
			{
				System.out.println(" string - " +array[i] +" occurs " + count +" times ");
			}
		}
	}
	
}
}
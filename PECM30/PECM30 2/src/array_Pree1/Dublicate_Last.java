package array_Pree1;

public class Dublicate_Last {

	public static void main(String[] args) 
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56};
		
		for (int i = array.length-1; i >0; i--) 
		{
			int count = 0;
			if(array[i]!=0)
			{
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i]==array[j])
				{
					count ++;
					array[j]=0;
				}
			}
			}
			
			if(count!=0)
			{
				System.out.println(array[i]+" ");
				return;
			}
			
		}

	}

}

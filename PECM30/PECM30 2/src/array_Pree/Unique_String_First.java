package array_Pree;

public class Unique_String_First {

	public static void main(String[] args) 
	{
		String arr [] = {"hii","hello","hello","harry","kevin","speed","Avengers","tom","tom","Tom","hii"};
		
		for (int i = 0; i < arr.length; i++) 
		{
			int count=0;
			if(arr[i]!=null)
			{
				for (int j = i+1; j < arr.length; j++) 
				{
					if(arr[i].equals(arr[j]))
					{
						count++;
						arr[j]=null;
					}
				}
				
				if(count==0)
				{
					System.out.println(arr[i]);
					return;
				}
				
			}
		}

	}

}

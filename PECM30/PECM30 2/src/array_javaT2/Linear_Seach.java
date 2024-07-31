package array_javaT2;

	public class Linear_Seach
	{
	      public static int Linear_Search( int array [ ] , int key ) 
	{
		for(int i = 0 ; i< array.length ; i++)
	{
		if(array[i]==key)
	{	
		return i ; 
	}
	}
	return -1 ; 
	}

	public static void main (String [ ] args)
	{
		int array [ ]  = {1,2,3,4,50,60,70}; 
		int key = 50 ; 

		System.out.println(key + " found at index of "+ Linear_Search(array, key)); 
	}  
	}



package arrays;

public class NumberNotPresent 
{
	public static void main(String[] args) 
	{
		int []a= {-1,-2,-3,-4,-5,0,1,2,3,4};
		int b=-5;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				b++;
				i=0;
				i--;
			}
		}
		System.out.println(b);
	}
}
